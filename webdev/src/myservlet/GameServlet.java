package myservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@WebServlet(value = "/game", loadOnStartup = 1)
public class GameServlet extends HttpServlet {
	private static final Logger logger = Logger.getLogger(GameServlet.class);
	
   @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("basic/game_form.jsp");
		dispatcher.forward(request, response);
	}

   	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("basic/game_result.jsp");
		
		String[] caption = {"", "가위", "바위", "보"};
		int you = Integer.parseInt(request.getParameter("you"));
		int com = (int)(Math.random() * 3) + 1;	
		String msg = winner_msg(you, com);
		
		request.setAttribute("you", caption[you]);
		request.setAttribute("com", caption[com]);
		request.setAttribute("msg", winner_msg(you, com));
		
		go_process(request, response, "basic/game_result.jsp");
   	}
   	
   	
	private void go_process(HttpServletRequest request, HttpServletResponse response, String viewName) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewName);
		dispatcher.forward(request, response);
	}

		public String winner_msg(int you, int com){
			if (you == 1 && com == 3 || you == 2 && com == 1 || you == 3 && com == 2)
				return("YOU WIN!!");
			else if (you == com)
				return("DRAW!!");
			else return("YOU LOSE!!");}
		

	}

