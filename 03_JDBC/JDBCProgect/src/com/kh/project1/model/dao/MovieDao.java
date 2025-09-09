package com.kh.project1.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.project1.model.vo.Movie; // 이 부분은 예시이므로 실제 클래스명으로 변경하세요.
import com.kh.project1.common.JDBCTemplate;

public class MovieDao {
	
	// static 변수로 선언하고, 딱 한 번만 로드합니다.
	private static Properties prop = new Properties();
	
	
	
	public MovieDao() {
		super();
		try {
			prop.loadFromXML(new FileInputStream("resource/query.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Movie> selectMovieAll(Connection conn) {
		ArrayList<Movie> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		// 이미 로드된 prop 객체에서 SQL 쿼리를 가져옵니다.
		String sql = prop.getProperty("selectMovieList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			while (rset.next()) {
				Movie m = new Movie();
				m.setTitle(rset.getString("TITLE"));
				m.setGenre(rset.getString("GENRE"));
				
				list.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 자원 반납
			try { if (rset != null) rset.close(); } catch (SQLException e) {}
			try { if (pstmt != null) pstmt.close(); } catch (SQLException e) {}
		}
		return list;
	}
}


