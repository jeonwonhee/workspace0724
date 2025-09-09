package com.kh.project2.controller;

import java.util.List;

import com.kh.project2.model.vo.Review;
import com.kh.project2.service.ReviewService;
import com.kh.project2.view.ReviewMenu;

public class ReviewController {
	
	private ReviewService rs = new ReviewService();
	
	public ReviewController() {
		super();
	}

	public void insertReview(String reviewId, String reviewPwd ,String title, int rating) {
		Review r = new Review(reviewId, reviewPwd, title, rating);
		
		int result = 0;
		
		if(result > 0) {
			new ReviewMenu().displaySuccess("성공적으로 리뷰가 추가되었습니다.");
		}else {
			new ReviewMenu().displayFail("리뷰 추가에 실패하였습니다.");
		}
	}
	
	public void selectReviewAll() {
		List<Review> list = rs.selectReviewList();
		
		if(list.isEmpty()) {
			new ReviewMenu().displayNoData("조회 결과가 없습니다.");
		}else {
			new ReviewMenu().displayReviewList(list, "회원 목록");
		}
	}

	public void updateReview(String reviewId, String reviewPwd , int rating) {
		Review r = new Review(reviewId, reviewPwd, rating);
		
		int result = 0;
		
		if(result > 0) {
			new ReviewMenu().displaySuccess("성공적으로 리뷰가 수정되었습니다.");
		}else {
			new ReviewMenu().displayFail("리뷰 수정에 실패하였습니다.");
		}
	}
	
	public void deleteReview(String reviewId, String reviewPwd) {
		Review r = new Review(reviewId, reviewPwd);
		
		int result = 0;
		
		if(result > 0) {
			new ReviewMenu().displaySuccess("성공적으로 리뷰가 삭제되었습니다.");
		}else {
			new ReviewMenu().displayFail("리뷰 삭제에 실패하였습니다.");
		}
	}
}
