package member.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jdbc.ConnectionProvider;
import member.dao.MemberDao;
import member.model.LoginBean;
import member.model.Member;
import service.Service;

public class LoginServiceImpl implements Service {
	
	MemberDao dao;

	@Override
	public String getViewPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// filter의 HttpSession에서 들어온 session을 받는다.
		int result = 0;
		Member member = null;
		Connection conn = null;
		
		HttpSession session = request.getSession();
		String uid = request.getParameter("uid");
		String upw = request.getParameter("upw");
		
		
		try {
			conn = ConnectionProvider.getConnection();
			dao = MemberDao.getInstance();
			
			member = dao.loginCheck(uid, upw);
			
			if (member == null) {
				result = -1;
				System.out.println("로그인 실패");
				request.setAttribute("loginCheck", result);

			} else if(member.getUid() != uid) {
				System.out.println("존재하지 않는 아이디입니다.");
				request.setAttribute("loginCheck", result);
				
			}  else if (member.getUpw() != upw) {
				result = -2;
				System.out.println("비밀번호 오류");
				request.setAttribute("loginCheck", result);
				
			} else if (member.getUid().equals(uid) && member.getUpw().equals(upw)) {
				result = 1;
				System.out.println(member + " 로그인 성공");
				request.setAttribute("loginCheck", result);
				request.setAttribute("loginId", uid);
				request.setAttribute("loginMemeber", member);
				session.setAttribute("sessionId", uid);
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
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/member/login.jsp");
		rd.forward(request, response);
		
		return "/WEB-INF/views/member/login.jsp";
	}

}
