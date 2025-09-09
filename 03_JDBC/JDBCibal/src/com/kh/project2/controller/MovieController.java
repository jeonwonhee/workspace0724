package com.kh.project2.controller;

import java.util.List;

import com.kh.project2.model.vo.Movie;
import com.kh.project2.service.MovieService;
import com.kh.project2.view.ReviewMenu;



public class MovieController {
	private MovieService ms = new MovieService();
	
	
	public MovieController() {
		super();
	}




	public void selectMovieAll() {
		// TODO Auto-generated method stub
        List<Movie> list = ms.selectMovieAll();
		
		if(list.isEmpty()) {
			new ReviewMenu().displayNoData("조회 결과가 없습니다.");
		}else {
			new ReviewMenu().displayMovieList(list, "회원 목록");
		}
	}


	
}
