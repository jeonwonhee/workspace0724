package com.kh.project2.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.project2.model.vo.Movie;

public class MovieDao {
	
	private Properties prop = new Properties();
	
	public ArrayList<Movie> selectMovieAll(Connection conn) {
	    ArrayList<Movie> list = new ArrayList<>();
	    PreparedStatement pstmt = null;
	    ResultSet rset = null;

	
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
	        try { if (rset != null) rset.close(); } catch (SQLException e) {}
	        try { if (pstmt != null) pstmt.close(); } catch (SQLException e) {}
	        
	    }
	    return list;
	    
	}
}
