package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import front.controllers.AbstractController;
import front.controllers.ModelAndView;
import models.ArticleDAOOracle;
import models.ArticleDTO;
import models.IArticleDAO;

public class ArticleInsertAction extends AbstractController {

	private static Logger logger = LoggerFactory.getLogger(ArticleInsertAction.class);
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String passwd = request.getParameter("passwd");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		ArticleDTO articleDTO = new ArticleDTO();
		articleDTO.setName(name);
		articleDTO.setPasswd(passwd);
		articleDTO.setTitle(title);
		articleDTO.setContent(content);
		
		logger.info(articleDTO.toString());
		
		IArticleDAO articleDAO = ArticleDAOOracle.getInstance();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/views/result.jsp");
		
		try {
			articleDAO.insertArticle(articleDTO);
			mav.addObject("msg", "글 입력 성공");
			mav.addObject("url", "list");
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("msg", "글 입력 실패");
			mav.addObject("url", "javascript:history.back();");
		}
		return mav;
	}
}
