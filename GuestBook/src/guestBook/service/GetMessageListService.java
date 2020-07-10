package guestBook.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import guestBook.DAO.MessageDAO;
import guestBook.jdbc.ConnectionProvider;
import guestBook.model.Message;
import guestBook.model.MessageListView;

public class GetMessageListService {
	
	
	private GetMessageListService() {
		
	}
	
	
	private static GetMessageListService service = new GetMessageListService();
	
	public static GetMessageListService getInstance() {
		return service;
	}
	
	
	private MessageDAO dao;
	
	// �� �������� ����� �Խù� ����
	private static final int  MESSAGE_COUNT_PER_PAGE = 3;
	
	public MessageListView getMessageList(int pageNumber) {
		
		// ������ ��ȣ�� �޾Ƽ� -> ������� ������ ��Ÿ��
		// dao => List �� ����
		
		 Connection conn = null;
		 MessageListView messageListView = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			dao = MessageDAO.getInstance();
			
			// �������� ��ü �޽��� ���ϱ�
			List<Message> messageList = null;
			
			// ��ü �������� ����
			int messageTotalCount = dao.selectTotalCount(conn);
			
			int startRow = 0;
			int endRow = 0;
			
			if(messageTotalCount > 0) {
				
				// ���� ��, ������ ��
				startRow = (pageNumber-1)*MESSAGE_COUNT_PER_PAGE +1;
				endRow = startRow + MESSAGE_COUNT_PER_PAGE -1;
				
				messageList = dao.selectMessageList(conn, startRow, endRow);
				
			}else {
				pageNumber = 0;
				messageList = Collections.emptyList();
			}
			
			messageListView = new MessageListView (
							messageList, 
							messageTotalCount, 
							pageNumber, 
							MESSAGE_COUNT_PER_PAGE, 
							startRow, 
							endRow);
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch ( SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return messageListView;
	}

}
