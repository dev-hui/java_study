package models;

import java.util.List;

public interface IArticleDAO {

	void insertArticle(ArticleDTO articleDTO) throws Exception;

	List<ArticleDTO> getArticleList() throws Exception;

}
