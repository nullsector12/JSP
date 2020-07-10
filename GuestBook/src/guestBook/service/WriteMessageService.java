package guestBook.service;

import java.sql.Connection;
import java.sql.SQLException;

import guestBook.DAO.MessageDAO;
import guestBook.jdbc.ConnectionProvider;
import guestBook.model.Message;

public class WriteMessageService {
	
	private static WriteMessageService service = new WriteMessageService();
	
	public static WriteMessageService getInstance() {
		return service;
	}
	
	MessageDAO dao = null;
	
	public int writeMessage(Message message) {
		int result = 0;
		dao = MessageDAO.getInstance();
		
		// DAO 에 전달할 Connection 생성
		Connection conn = null;
		
		try{
		
			conn = ConnectionProvider.getConnection();
			result = dao.insertMessage(conn, message);
		
		} catch (SQLException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return result;
	}

}
