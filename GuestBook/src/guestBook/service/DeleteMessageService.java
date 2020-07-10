package guestBook.service;

import java.sql.Connection;
import java.sql.SQLException;

import guestBook.DAO.MessageDAO;
import guestBook.jdbc.ConnectionProvider;
import guestBook.model.Message;

public class DeleteMessageService {

	private DeleteMessageService() {
	}

	private static DeleteMessageService delete = new DeleteMessageService();

	public static DeleteMessageService getInstance() {
		return delete;
	}

	MessageDAO dao;

	public int deleteMessage(int mid, String upw) {

		int resultCnt = 0;

		Connection conn = null;
		Message message = null;

		// 1. mid의 메세지 존재 하는지 확인
		// 2. 메세지가 존재하면 객체의 upw와 사용자가 입력한 upw 비교
		// 3. 비교의 결과가 같다면 mid의 메세지를 삭제

		try {
			conn = ConnectionProvider.getConnection();
			dao = MessageDAO.getInstance();

			message = dao.selectMessage(conn, mid);

			if (message == null) {
				resultCnt = -1;
				throw new Exception("게시물이 존재하지 않습니다.");
			}

			if (!message.getUpw().equals(upw)) {
				resultCnt = -2;
				throw new Exception("입력하신 패스워드가 일치하지 않습니다.");
			}

			// 삭제
			resultCnt = dao.deleteMessage(conn, mid);

		} catch (SQLException e) {
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return resultCnt;
	}

}
