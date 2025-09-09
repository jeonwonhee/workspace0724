	package com.kh.project1.service;
	
import static com.kh.project1.common.JDBCTemplate.close;
import static com.kh.project1.common.JDBCTemplate.commit;
import static com.kh.project1.common.JDBCTemplate.getConnection;
import static com.kh.project1.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.project1.model.dao.ReviewDao;
import com.kh.project1.model.vo.Review;
	
	public class ReviewService {
		public ReviewService() {
			super();
		}
		
		public int insertReview(Review r) {
			Connection conn = getConnection();
			
			int result = new ReviewDao().insertReview(r, conn);
		
			if(result>0) {
				commit(conn);
			}else {
				rollback(conn);
			}
			
			if (conn != null) close(conn);
			return result;
		}
	
		public ArrayList<Review> selectReviewList() {
			Connection conn = getConnection();
			
			ArrayList<Review> list = new ReviewDao().selectReviewList(conn);
			
			if (conn != null) close(conn);
			return list;
		}
		
		public int updateReview(Review r) {
			Connection conn = getConnection();
			
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
	        Connection conn = getConnection();
			
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
