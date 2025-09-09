package com.kh.project1.controller;

import java.util.List;

import com.kh.project1.model.vo.Review;
import com.kh.project1.service.ReviewService;
import com.kh.project1.view.ReviewMenu;


public class ReviewController {
	//필드
	private ReviewService rs = new ReviewService();

	//생성자
	public ReviewController() {
		super();
	}
	
	//메서드
	public void insertReview(String reviewId, String reviewPwd ,String title, int rating) {
		Review r = new Review(reviewId, reviewPwd, title, rating);
		
		int result = rs.insertReview(r);
		
		if(result > 0) {
			new ReviewMenu().displaySuccess("성공적으로 리뷰가 추가되었습니다.");
		} else {			
			new ReviewMenu().displayFail("리뷰 추가에 실패하였습니다.");
		} 
	}
	
	public void selectReviewAll() {
		List<Review> list = rs.selectReviewList();
		
		if(list.isEmpty()) {
			new ReviewMenu().displayNoData("조회 결과가 없습니다.");
		}else {
			new ReviewMenu().displayList(list, "회원 목록");
		}
	}

	public void updateReview(String reviewId, String reviewPwd ,int rating) {
	    Review r = new Review();
	    r.setReviewId(reviewId);
	    r.setReviewPwd(reviewPwd);	
	    r.setRating(rating);

	    int result = rs.updateReview(r);

	    if(result > 0) {
	        new ReviewMenu().displaySuccess("리뷰가 성공적으로 수정되었습니다.");
	    } else {
	        new ReviewMenu().displayFail("리뷰 수정에 실패하였습니다.");
	    }
	}
	
    public void deleteReview(String reviewId, String reviewPwd) {
    	Review r = new Review();
    	r.setReviewId(reviewId);
    	r.setReviewPwd(reviewPwd);
    	
		int result = rs.deleteReview(r);
		
		if(result>0) {
			new ReviewMenu().displaySuccess("성공적으로 리뷰가 삭제되었습니다.");
		}else {			
			new ReviewMenu().displayFail("리뷰삭제에 실패하였습니다.");
		} 
	}

    
}
