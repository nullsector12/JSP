package first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class ServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
			int total = 0;
		 for (int cnt = 1; cnt < 101; cnt++)
		 total += cnt;
		 PrintWriter out = response.getWriter();
		 out.println("<HTML> ");
		 out.println("<HEAD><TITLE>Hundred Servlet</TITLE></HEAD> ");
		 out.println("<BODY> ");
		 out.printf("1 + 2 + 3 + ... + 100 = %d ", total);
		 out.println("</BODY> ");
		 out.println("</HTML> ");
		
	}

}
