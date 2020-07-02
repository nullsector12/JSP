package util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class CookieBox {
	
	// Cookie ����� Map�� �����ؼ� ����
	private Map<String, Cookie> cookieMap = new HashMap<String, Cookie>();
	
	public CookieBox(HttpServletRequest request) {
		
		Cookie[] cookies = request.getCookies();
		
		// ��Ű �����͸� Map�� ��� ����		
		for(int i=0; i<cookies.length; i++) {
			// Map ������ ����
			cookieMap.put(cookies[i].getName(), cookies[i]);
		}
		
	}
	
	public Cookie getCookie(String name) {
		return cookieMap.get(name);
	}
	
	public String getValue(String name) {
		
		String result = null;
		Cookie cookie = getCookie(name);
		
		if(cookie!=null) {
			result = cookie.getValue();
		}
		
		return result;
	}
	
	public boolean exist(String name) {
		return cookieMap.get(name) != null;
	}
	
	// ��Ű ��ü ���� �޼���
	public static Cookie createCookie(String name, String value) {
		return new Cookie(name, value);
	}
	
	public static Cookie createCookie(
			String name, 
			String value, 
			String path, 
			int maxAge) {
		
		Cookie cookie = new Cookie(name, value);
		// ��� ����
		cookie.setPath(path);
		// maxAge ����
		cookie.setMaxAge(maxAge);	
		
		return cookie;
		
	}
	
	public static Cookie createCookie(
			String name, 
			String value, 
			String domain,
			String path, 
			int maxAge) {
		
		Cookie cookie = new Cookie(name, value);
		
		//������ ����
		cookie.setDomain(domain);		
		// ��� ����
		cookie.setPath(path);
		// maxAge ����
		cookie.setMaxAge(maxAge);	
		
		return cookie;
		
	}
	

}
