package com.kh.project1.view;

import java.util.List;
import java.util.Scanner;

import com.kh.project1.controller.MovieController;
import com.kh.project1.controller.ReviewController;

public class ReviewMenu {
    private Scanner sc = new Scanner(System.in);
    private ReviewController rc = new ReviewController();
    private MovieController mc = new MovieController();
    
    public ReviewMenu(Scanner sc, ReviewController rc, MovieController mc) {
		super();
		this.sc = sc;
		this.rc = rc;
		this.mc = mc;
	}

		
    
    public ReviewMenu() {
		super();
	}

	public void mainMenu() {
		while(true) {
			System.out.println("====영화리뷰관리 프로그램====");
			System.out.println("1. 상영 중인 영화 조회");
			System.out.println("2. 리뷰 작성");
			System.out.println("3. 리뷰 수정");
			System.out.println("4. 전체 리뷰 조회");
			System.out.println("5. 리뷰 삭제");
			System.out.println("9. 프로그램 종료");
			
			System.out.println("메뉴 입력 : ");
			int sel = sc.nextInt();
			sc.nextLine();
			
			switch(sel) {
			case 1: mc.selectMovieAll(); break;
			case 2: insertReview(); break;
			case 3: updateReview(); break;
			case 4: rc.selectReviewAll();  break;
			case 5: deleteReview(); break;
			case 9: System.out.println("프로그램을 종료합니다.");
			        return;
			default: System.out.println("잘못 입력하셨습니다.");
			        break;
			
			}
			System.out.println();
		}
	}
	
	//리뷰 추가하기
	public void insertReview() {
		System.out.println("====리뷰 추가====");
		System.out.println("리뷰를 등록할 ID : ");
		String reviewId = sc.nextLine();
		
		System.out.println("비밀번호 : ");
		String reviewPwd = sc.nextLine();
		
		System.out.println("영화 제목 : ");
		String title = sc.nextLine();
		
		System.out.println("평점(1~5) : ");
		int rating = sc.nextInt();
		sc.nextLine();
		
		rc.insertReview(reviewId, reviewPwd, title, rating);
	}
	
	//리뷰 수정하기
	public void updateReview() {
		System.out.println("====리뷰 수정====");
		System.out.println("리뷰를 등록한 ID : ");
	    String reviewId = sc.nextLine();
	
	    System.out.println("비밀번호 : ");
	    String reviewPwd = sc.nextLine();
	    
		System.out.println("평점(1~5) : ");
		int rating = sc.nextInt();
		sc.nextLine();
	    
		rc.updateReview(reviewId, reviewPwd, rating);
	    
	}	
	
	//리뷰 삭제하기
	public void deleteReview() {
		System.out.println("====리뷰 삭제====");
		System.out.println("리뷰를 등록한 ID : ");
		String reviewId = sc.nextLine();
		
	    System.out.println("비밀번호 : ");
	    String reviewPwd = sc.nextLine();
	    
	    rc.deleteReview(reviewId, reviewPwd);
	}
	

	
	//========================= 응답화면 ===================================
		//서비스요청 처리 후 성공했을 때 사용자가 보게될 화면
		//msg : 기능별 성공메세지
	public void displaySuccess(String msg) {
		System.out.println("\n 서비스 요청 완료 : " + msg);
	}
	
	public void displayFail(String msg) {
		System.out.println("\n 서비스 요청 실패 : " + msg);
	}
	
	public void displayNoData(String msg) {
		System.out.println("\n" + msg);
	}
	
	public void displayList(List list, String title2) {
		System.out.println("========== " + title2 + " ==========");
		for(Object o : list) {
			System.out.println(o);
		}
	}
	
	public void displayMovieList(List list, String title2) {
		System.out.println("========== " + title2 + " ==========");
		for(Object o : list) {
			System.out.println(o);
		}
	}
	
}
