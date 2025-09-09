package com.kh.project1.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.project1.model.vo.Review;

public class ReviewDao {
	private Properties prop = new Properties();
	
	public ReviewDao() {
		super();
		
		try {
			prop.loadFromXML(new FileInputStream("resource/query.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public int insertReview(Review r, Connection conn) {
	    int result = 0;
	    PreparedStatement pstmt = null;

	    String sql = prop.getProperty("insertReview"); // XML에서 SQL 읽기

	    try {
	        // Driver는 한 번만 로드하면 충분합니다. Service에서 conn 받아서 사용
	        pstmt = conn.prepareStatement(sql); // 반드시 여기서 pstmt 초기화
	        pstmt.setString(1, r.getReviewId());
	        pstmt.setString(2, r.getReviewPwd());
	        pstmt.setString(3, r.getTitle());
	        pstmt.setInt(4, r.getRating());

	        result = pstmt.executeUpdate();

	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try { 
	        	if(pstmt != null) pstmt.close(); 
	        	} catch(SQLException e) 
	        { e.printStackTrace(); 
	        }
	    }

	    return result;
	}


	public ArrayList<Review> selectReviewList(Connection conn) {
	    ArrayList<Review> list = new ArrayList<>();
	    PreparedStatement pstmt = null;
	    ResultSet rset = null;

	    String sql = prop.getProperty("selectReviewList");
	    
	    try {
	        pstmt = conn.prepareStatement(sql);
	        rset = pstmt.executeQuery();

	        while (rset.next()) {
	            Review r = new Review();
	            r.setReviewNo(rset.getInt("REVIEW_NO"));
	            r.setReviewId(rset.getString("REVIEW_ID"));
	            r.setTitle(rset.getString("MOVIE_TITLE"));
	            r.setRating(rset.getInt("RATING"));
	            r.setDate(rset.getTimestamp("CREATE_DATE").toLocalDateTime());

	            list.add(r);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try { if (rset != null) rset.close(); } catch (SQLException e) {}
	        try { if (pstmt != null) pstmt.close(); } catch (SQLException e) {}
	        
	    }
	    return list;
	    
	}
	
	public int updateReview(Review r, Connection conn) {
	    int result = 0;
	    PreparedStatement pstmt = null;
	    String sql = prop.getProperty("updateReview");

	    try {
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setInt(1, r.getRating());
	        pstmt.setString(2, r.getReviewId());
	        pstmt.setString(3, r.getReviewPwd());

	        result = pstmt.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try { if(pstmt != null) pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
	    }
	    return result;
	}			
	
	public int deleteReview(Review r, Connection conn) {
	    int result = 0;
	    PreparedStatement pstmt = null;

	    String sql = prop.getProperty("deleteReview"); // XML에서 SQL 읽기

	    try {
	        // Driver는 한 번만 로드하면 충분합니다. Service에서 conn 받아서 사용
	        pstmt = conn.prepareStatement(sql); // 반드시 여기서 pstmt 초기화
	        pstmt.setString(1, r.getReviewId());
	        pstmt.setString(2, r.getReviewPwd());
	        
	        result = pstmt.executeUpdate();

	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	        	if(pstmt != null) pstmt.close();
	        	}
	        catch(SQLException e) { e.printStackTrace();
	        }
	    }

	    return result;
	}
	

}
