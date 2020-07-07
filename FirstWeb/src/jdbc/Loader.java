package jdbc;

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
				
				System.out.println(driver + "드라이버 로드 성공");
			}
			
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("오라클 드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("오라클 드라이버 로드 실패");
		}
	}
}
