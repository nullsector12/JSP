package service;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexService_Impl implements Service {

	@Override
	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		// viewPage
		String viewPage = "/WEB-INF/Views/index.jsp";
		

		
		return viewPage;
	}
}
