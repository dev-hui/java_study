package front.controllers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet(name = "DispatcherServlet", 
			urlPatterns = {
					"/article/*",
					"/member/*"
					}, loadOnStartup = 1)
public class DispatcherServlet extends HttpServlet{
	
	private static final Logger logger = LoggerFactory.getLogger(DispatcherServlet.class);
	private Map<String, Object> actionMap = new HashMap<>();
	
	public DispatcherServlet() throws ServletException {
		logger.info("DispatcherServlet() is now working...");
	}
	
	@Override
	public void init() throws ServletException {
		logger.info("DispatcherServlet.init() is now working...");
		Properties prop = new Properties();
		try {
		prop.load(new FileInputStream(
			this.getClass().getResource("dispatcher-servlet.properties").getFile()));	
		for(Object key : prop.keySet()) {
			String skey = (String)key;
			Class clazz = Class.forName(prop.getProperty(skey));
			actionMap.put(skey, clazz.getConstructor().newInstance());
		}
		} catch (Exception e) {
			e.printStackTrace();
			logger.info(e.toString());}
		}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("DistpatcherServlet.service() is now working...");
		
		String action = request.getRequestURI().substring(request.getContextPath().length());
		AbstractController controller = null;
		ModelAndView mav = null;
	    controller = (AbstractController) actionMap.get(action);
		mav = controller.handleRequestInternal(request, response);
	    
		if (mav != null ) {			
			RequestDispatcher dispatcher = request.getRequestDispatcher(mav.getViewName());
			for(String key : mav.getModel().keySet()) {
				request.setAttribute(key, mav.getModel().get(key));
			}
			dispatcher.forward(request, response);
		} else {
			logger.info("DispatcherServlet에서 길을 잃었다네~~~");
		}
	}
}
