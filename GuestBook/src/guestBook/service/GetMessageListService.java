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
	
	// 한 페이지에 출력할 게시물 개수
	private static final int  MESSAGE_COUNT_PER_PAGE = 3;
	
	public MessageListView getMessageList(int pageNumber) {
		
		// 페이지 번호를 받아서 -> 시작행과 끝행을 나타냄
		// dao => List 로 전달
		
		 Connection conn = null;
		 MessageListView messageListView = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			dao = MessageDAO.getInstance();
			
			// 페이지의 전체 메시지 구하기
			List<Message> messageList = null;
			
			// 전체 페이지의 개수
			int messageTotalCount = dao.selectTotalCount(conn);
			
			int startRow = 0;
			int endRow = 0;
			
			if(messageTotalCount > 0) {
				
				// 시작 행, 마지막 행
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
