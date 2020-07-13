package service;



import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateService_Impl implements Service {

	@Override
	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		// viewPage
		String viewPage = "/WEB-INF/Views/view02.jsp";
		
		
		// 응답 데이터 처리
		Date now = new Date();
		
		// request 속성에 저장
		request.setAttribute("result", now);
		
		
		return viewPage;
	}
}
