package guestBook.jdbc;

import java.util.StringTokenizer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class Loader  extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		
		
		String jdbcDrivers = config.getInitParameter("jdbcDriver");
		
		//System.out.println(jdbcDrivers);
		
		StringTokenizer st = new StringTokenizer(jdbcDrivers, ",");
		
		
		String msg = config.getInitParameter("msg");
		
		System.out.println(msg);
		
		try {
			
			while(st.hasMoreTokens()) {
				
				String driver = st.nextToken();
				
				Class.forName(driver);
				
				System.out.println(driver + "����̹� �ε� ����");
			}
			
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("����Ŭ ����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("����Ŭ ����̹� �ε� ����");
		}
	}
}
