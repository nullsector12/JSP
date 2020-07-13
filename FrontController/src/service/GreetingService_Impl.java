package service;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetingService_Impl implements Service {

	@Override
	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		// viewPage
		String viewPage = "/WEB-INF/Views/greeting.jsp";
		
		
		// 응답 데이터 처리
		String result = "안녕하세요";
		
		// request 속성에 저장
		request.setAttribute("result", result);
		
		
		return viewPage;
	}
}
