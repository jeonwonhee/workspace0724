package com.kh.project2.model.vo;

import java.time.LocalDateTime;

public class Review {

	//필드
		private int reviewNo;         //리뷰번호
		private String reviewId;      //아이디
		private String reviewPwd;     //비밀번호
		private int movieId;          //영화번호
		private String title;         //영화제목
		private int rating;          //평점
		private LocalDateTime date;  //작성날짜
		
		public Review() {
			super();
		}
		public Review(int reviewNo, String reviewId, String reviewPwd, int movieId, String title, int rating,
				LocalDateTime date) {
			super();
			this.reviewNo = reviewNo;
			this.reviewId = reviewId;
			this.reviewPwd = reviewPwd;
			this.movieId = movieId;
			this.title = title;
			this.rating = rating;
			this.date = date;
		}
		
		
		public Review(String reviewId, String reviewPwd, String title, int rating) {
			super();
			this.reviewId = reviewId;
			this.reviewPwd = reviewPwd;
			this.title = title;
			this.rating = rating;
		}
		
		
		public Review(String reviewId, String reviewPwd, int rating) {
			super();
			this.reviewId = reviewId;
			this.reviewPwd = reviewPwd;
			this.rating = rating;
		}
		
		
		public Review(String reviewId, String reviewPwd) {
			super();
			this.reviewId = reviewId;
			this.reviewPwd = reviewPwd;
		}
		public int getReviewNo() {
			return reviewNo;
		}
		public void setReviewNo(int reviewNo) {
			this.reviewNo = reviewNo;
		}
		public String getReviewId() {
			return reviewId;
		}
		public void setReviewId(String reviewId) {
			this.reviewId = reviewId;
		}
		public String getReviewPwd() {
			return reviewPwd;
		}
		public void setReviewPwd(String reviewPwd) {
			this.reviewPwd = reviewPwd;
		}
		public int getMovieId() {
			return movieId;
		}
		public void setMovieId(int movieId) {
			this.movieId = movieId;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public int getRating() {
			return rating;
		}
		public void setRating(int rating) {
			this.rating = rating;
		}
		public LocalDateTime getDate() {
			return date;
		}
		public void setDate(LocalDateTime date) {
			this.date = date;
		}
		@Override
		public String toString() {
			return"[reviewNo=" + reviewNo + ", reviewId=" + reviewId +  ", title=" + title
					+ ", rating=" + rating + ",date= " + date + "]";
		}
		
		
}
