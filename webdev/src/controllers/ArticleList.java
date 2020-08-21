package controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import front.controllers.AbstractController;
import front.controllers.ModelAndView;
import models.ArticleDAOOracle;
import models.ArticleDTO;
import models.IArticleDAO;

public class ArticleList extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		IArticleDAO articleDAO = ArticleDAOOracle.getInstance();
		try {
			List<ArticleDTO> list = articleDAO.getArticleList();
			return new ModelAndView("/WEB-INF/article/list.jsp","list",list);
		} catch (Exception e) {
			e.printStackTrace();
			ModelAndView mav = new ModelAndView("result.jsp");
			mav.addObject("msg", "list error");
			mav.addObject("url", "../index.html");
			return mav;
		}
	}
	

}
