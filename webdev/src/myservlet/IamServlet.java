package myservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IamServlet
 */
@WebServlet(value = "/iam", loadOnStartup = 1)
public class IamServlet extends HttpServlet {
   public IamServlet() {
	   System.out.println("IamServlet() 수행");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/form.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String iam = "그래, 난 " + name + ". 포기를 모르는 남자지";
		
		request.setAttribute("iam", iam);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/process.jsp");
		dispatcher.forward(request, response);
	}

}
