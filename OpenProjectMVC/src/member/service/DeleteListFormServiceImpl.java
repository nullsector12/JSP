package member.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Service;

public class DeleteListFormServiceImpl implements Service {

	@Override
	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return "/WEB-INF/views/member/deleteListForm.jsp";
	}

}
