package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArticleDAOOracle implements IArticleDAO {
	private static Logger logger = LoggerFactory.getLogger(ArticleDAOOracle.class);
	private static IArticleDAO articleDAO = null;
	
	private ArticleDAOOracle() {	// Data access object
		try {
			Class.forName("net.sf.log4jdbc.DriverSpy");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection(
				"jdbc:log4jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	}	
	public static IArticleDAO getInstance() {
		if (articleDAO == null) {
			articleDAO = new ArticleDAOOracle();
		}
		return articleDAO;
	}

	@Override
	public void insertArticle(ArticleDTO articleDTO) throws Exception {
		StringBuffer sql = new StringBuffer();
		sql.append(" insert into t_board(no, title, name, passwd, content) ");
		sql.append(" values(t_board_no_seq.nextval, ?, ?, ?, ?) ");
		try (Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString())){
			pstmt.setString(1, articleDTO.getTitle());
			pstmt.setString(2, articleDTO.getName());
			pstmt.setString(3, articleDTO.getPasswd());
			pstmt.setString(4, articleDTO.getContent());
			pstmt.executeUpdate();
			}
		}
	
	@Override
	public List<ArticleDTO> getArticleList() throws Exception {
		StringBuffer sql = new StringBuffer();
		sql.append(" select no");
		sql.append("       ,title");
		sql.append("       ,name");
		sql.append("       ,to_char(regdate,'YYYY/MM/DD') as regdate");
		sql.append("       ,readcount ");
		sql.append(" from t_board");
		sql.append(" order  by no desc");
		
		List<ArticleDTO> list = new ArrayList<>();
		
		try(Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString())){
			try(ResultSet rs = pstmt.executeQuery()){
				while(rs.next()) {
					ArticleDTO articleDTO = new ArticleDTO();
					articleDTO.setNo(rs.getLong("no"));
					articleDTO.setTitle(rs.getString("title"));
					articleDTO.setName(rs.getString("name"));
					articleDTO.setRegdate(rs.getString("regdate"));
					articleDTO.setReadcount(rs.getInt("readcount"));
					list.add(articleDTO);
				}
			}
		}
		return list;
	}

}
