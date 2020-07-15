package member.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.ConnectionProvider;
import member.dao.MemberDao;
import member.model.Member;
import member.model.MemberListView;
import service.Service;

public class MemberListServiceImpl implements Service {
	
	//한 페이지 당 노출할 리스트 개수
	final int MEMBER_LIST_PER_PAGE = 3;
	MemberDao dao;
	
	// ★★★★★WEB-INF안의 jsp는 해당 메서드를 통해서만 외부에서 볼 수 있다.
	// ★★★★★따라서 해당 메서드 안에 데이터 베이스에서 필요한 정보를 처리하고 원하는 jsp경로로 보내야한다.
	
	@Override
	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {
		
		Connection conn=null;
		
		MemberListView viewList = null;
		
		try {
			
			conn = ConnectionProvider.getConnection();
			
			dao = MemberDao.getInstance();
			
			// 출력할 회원 리스트
			List<Member> memberList = null;
			
			// 전체 리스트의 게수
			int memberTotalCount = dao.selectTotalCount(conn);
			
			// list.jsp에서 처리하던 request 부분을 Service에서 처리하도록 옮겨줌
			int PageNum = 1;
			String pageNumber = request.getParameter("page");
			if (pageNumber != null) {
				PageNum = Integer.parseInt(pageNumber);
			}
			
			// 페이지 시작 행 index
			int startRow = 0;
			
			
			if(memberTotalCount>0) {
				
				// 시작 행, 마지마 행
				// startRow : (1-1)*50 = 0, (2-1)*50 = 50, (3-1)*50 = 100 ...
				startRow = (PageNum-1)*MEMBER_LIST_PER_PAGE;
				
				
				
				memberList = dao.selectMemberList(conn, startRow, MEMBER_LIST_PER_PAGE);
				
				
			} else {
				PageNum = 0;
				memberList = Collections.emptyList();
			}
			
			viewList  = new MemberListView(
					memberTotalCount, 
					PageNum, 
					memberList, 
					MEMBER_LIST_PER_PAGE, 
					startRow 
					);
			
			System.out.println(viewList);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		
		// Service 내에서 처리한 정보들을 저장해준다. 
		// request에 처리한 정보들을 set 한 후 jsp 페이지로 return 해야한다.
		// 그래야 return한 jsp 페이지 내에서 데이터를 요청하고 사용할 수 있다.
		request.setAttribute("viewList", viewList);
			
		return "/WEB-INF/views/member/memberList.jsp";
	}

}

	
	

