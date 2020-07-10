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

		// 1. mid�� �޼��� ���� �ϴ��� Ȯ��
		// 2. �޼����� �����ϸ� ��ü�� upw�� ����ڰ� �Է��� upw ��
		// 3. ���� ����� ���ٸ� mid�� �޼����� ����

		try {
			conn = ConnectionProvider.getConnection();
			dao = MessageDAO.getInstance();

			message = dao.selectMessage(conn, mid);

			if (message == null) {
				resultCnt = -1;
				throw new Exception("�Խù��� �������� �ʽ��ϴ�.");
			}

			if (!message.getUpw().equals(upw)) {
				resultCnt = -2;
				throw new Exception("�Է��Ͻ� �н����尡 ��ġ���� �ʽ��ϴ�.");
			}

			// ����
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
