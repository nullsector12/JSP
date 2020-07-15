package member.service;

import java.sql.Connection;
import java.sql.SQLException;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.ConnectionProvider;
import member.dao.MemberDao;
import member.model.Member;

import service.Service;

public class DeleteListServiceImpl implements Service {
	
	//한 페이지 당 노출할 리스트 개수
	
	MemberDao dao;
	
	// ★★★★★WEB-INF안의 jsp는 해당 메서드를 통해서만 외부에서 볼 수 있다.
	// ★★★★★따라서 해당 메서드 안에 데이터 베이스에서 필요한 정보를 처리하고 원하는 jsp경로로 보내야한다.
	
	@Override
	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {
		
		int resultCnt = 0;
		Connection conn = null;
		String uid = request.getParameter("uid");
		
		
		
		// 1. mid 의 메세지 존재 하는지 확인
		// 2. 메세지가 존재 하면 객체의 pw 사용자가 입력한 pw 비교
		// 3. 비교의 결과가 같다면 mid의 메세지를 삭제
		
		try {
			conn = ConnectionProvider.getConnection();
			dao = MemberDao.getInstance();
			
			resultCnt = dao.deleteMember(conn, uid);
			
			if(resultCnt == 0) {
				System.out.println("삭제할 회원이 존재하지 않습니다.");
			}
			
			if(resultCnt == 1) {
				System.out.println("정상 삭제");
			}
			
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		request.setAttribute("result", resultCnt);
			
		return "/WEB-INF/views/member/deleteView.jsp";
	}

}

	
	

