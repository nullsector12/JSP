package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse
			response) // 1단계, HTTP 요청 받음 
						throws ServletException, IOException {
		processRequest(request, response);
	}
	
	// 1단계, HTTP 요청 받음
	public void doPost(HttpServletRequest request, HttpServletResponse 
			response) throws ServletException, IOException {
			processRequest(request, response);
	}
	
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		// 2단계, 요청 파악
		// request 객체로부터 사용자의 요청을 파악하는 코드
		//    request.getParameter(name)
		//    request.getRequestURL()
		//    request.getRequestURI() ★★★★★
//		String type = request.getParameter("type");
//		type = "date";
		String type = "date";
		String command = request.getRequestURI();
		System.out.println("요청 명령 : " + command + "명령 index : " + command.indexOf(request.getContextPath()) );
		System.out.println("요청 파악 : " + type);
		
		// /fc/date
		if(command.indexOf(request.getContextPath()) == 0) {
			type = command.substring(request.getContextPath().length());
		}
		
		// 3단계, 요청한 기능을 수행한다.
		// 사용자에 요청에 따라 알맞은 코드
		Object resultObject = null;
		String page = "/WEB-INF/Views/simpleView.jsp";
		
		
		// http://localhost:8080/fc/greeting...
		// http://localhost:8080/fc/date...
		if (type == null || type.equals("/greeting")) {
			resultObject = "안녕하세요.";
			page="/WEB-INF/Views/view01.jsp";
		
		} else if (type.equals("/date")) {
			resultObject = new java.util.Date();
			page="/WEB-INF/Views/view02.jsp";
			
		} else if (type.equals("/")) {
			resultObject = "type 은 /";
			page="/WEB-INF/Views/index.jsp";
			
		} else {
			resultObject = "Invalid Type";
		
		}
		System.out.println("핵심 처리 결과 : " + resultObject);
		
			// 4단계, 결과 데이터를 속성에 저장 : request나 session에 처리 결과를 저장
			request.setAttribute("result", resultObject);
			System.out.println("속성에 저장");
			
			// 5단계, RequestDispatcher를 사용하여 알맞은 뷰로 포워딩
			RequestDispatcher dispatcher = request.getRequestDispatcher(page);
			dispatcher.forward(request, response);
	}
}
