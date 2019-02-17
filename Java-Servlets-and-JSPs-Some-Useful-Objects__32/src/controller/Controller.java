package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
	out.println("<html>");
		
		Cookie[] cookies = request.getCookies();
		
		if(cookies==null){
			out.println("No cookies found<br/>");
		} else {
			for(Cookie retrievedCookie: cookies){
				String name = retrievedCookie.getName();
				String value = retrievedCookie.getValue();
				
				out.println(name + " = " + value + "<br/>");
			}
		}
		 
        Cookie cookie = new Cookie("user", "Jacek");
        
        cookie.setMaxAge(300);
        
        response.addCookie(cookie);
        
        out.println("Cookie set.<br/>");
        
    out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}




































