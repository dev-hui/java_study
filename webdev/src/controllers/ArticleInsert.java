package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import front.controllers.AbstractController;
import front.controllers.ModelAndView;

public class ArticleInsert extends AbstractController {

	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		
		return new ModelAndView("/WEB-INF/article/insert.jsp");
	}

}
