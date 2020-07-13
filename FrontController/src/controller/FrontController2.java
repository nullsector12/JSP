package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.DateService_Impl;
import service.GreetingService_Impl;
import service.IndexService_Impl;
import service.NullService_Impl;
import service.Service;

public class FrontController2 extends HttpServlet {
	
	private Map<String, Service> commands = new HashMap<String, Service> ();
	
	public void init() throws ServletException {
		
		// 1. commandsService.propertise(외부설정) => Propertise (안드로이드 개발에서 많이 사용)
		// 2. 클래스 정보의 클래스들을 생성 => 인스턴스 생성
		// 3. Map에 사용자 요청 commands 와 인스턴스를 저장
		// /index=service.IndexService_Impl
		
		commands.put("/", new IndexService_Impl());
		commands.put("/index", new IndexService_Impl());
		commands.put("/greeting", new GreetingService_Impl());
		commands.put("null", new NullService_Impl());
		commands.put("/date", new DateService_Impl());
	}
	
	
	
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
		
		String type = null;
		String command = request.getRequestURI();
		System.out.println("요청 명령 : " + command + "명령 index : " + command.indexOf(request.getContextPath()) );
		System.out.println("요청 파악 : " + type);
		
		// /fc/date
		if(command.indexOf(request.getContextPath()) == 0) {
			type = command.substring(request.getContextPath().length());
		}
		
		// 3단계, 요청한 기능을 수행한다.
		// 사용자에 요청에 따라 알맞은 코드
		
		Service service = commands.get(type);
		
		if(service == null) {
			service = commands.get("null");
		} 
		
		
		// http://localhost:8080/fc/greeting...
		// http://localhost:8080/fc/date...
//		if (type.equals("/greeting")) {
//			
//			service = new GreetingService_Impl();
//		
//		} else if (type.equals("/date")) {
//			
//			service = new DateService_Impl();
//			
//		} else if (type.equals("/") || type.equals("/index")) {
//			
//			service = new IndexService_Impl();
//			
//		} else {
//			
//			service = new NullService_Impl();
//		
//		}
		
		String page = service.getViewPage(request, response);
		
			// 4단계, 결과 데이터를 속성에 저장 : request나 session에 처리 결과를 저장
			
			
			// 5단계, RequestDispatcher를 사용하여 알맞은 뷰로 포워딩
			RequestDispatcher dispatcher = request.getRequestDispatcher(page);
			dispatcher.forward(request, response);
	}
}
