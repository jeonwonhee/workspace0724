package com.kh.project2.service;


import java.sql.Connection;
import java.util.ArrayList;
import static com.kh.project2.common.JDBCTemplate.*;
import static com.kh.project2.common.JDBCTemplate.getConnection;
import static com.kh.project2.common.JDBCTemplate.commit;
import static com.kh.project2.common.JDBCTemplate.rollback;
import static com.kh.project2.common.JDBCTemplate.close;


import com.kh.project2.model.dao.ReviewDao;
import com.kh.project2.model.vo.Review;

public class ReviewService {

	public ReviewService() {
		super();
	}
	
	public int insertReview(Review r) {
		Connection conn = getConnection1();
		
		int result = new ReviewDao().insertReview(r,conn);
		
		if(result>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		if (conn != null) close(conn);
		return result;
	}

	private Connection getConnection1() {
		return null;
	}

	private Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Review> selectReviewList() {
		Connection conn = getConnection1();
		
		ArrayList<Review> list = new ReviewDao().selectReviewList(conn);
		
		if (conn != null) close(conn);
		return list;
	}
	
	public int updateReview(Review r) {
		Connection conn = getConnection1();
		
		int result = new ReviewDao().updateReview(r, conn);
		
		if(result>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		if (conn != null) close(conn);
		
		return result;
	}
	
	public int deleteReview(Review r) {
        Connection conn = getConnection1();
		
		int result = new ReviewDao().deleteReview(r, conn);
		
		if(result>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		if (conn != null) close(conn);
		
		return result;
}
	
	



}
