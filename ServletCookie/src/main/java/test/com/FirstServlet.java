package test.com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String n = request.getParameter("userName");
		out.println("Welcome :" + n);
		
		HttpSession session=request.getSession();
		session.setAttribute("uname", n);

//		Cookie ck = new Cookie("uname", n);
//		response.addCookie(ck);
		
		//out.print("<form action='servlet2'>");
		//out.print("<input type='hidden' name='uname'  value='"+n+">");
		//out.print("<input type='submit' value='go'>");
		out.print("<a href='servlet2'>vist</a>");
		//out.print("</form>");
		out.close();
		

	}

}
