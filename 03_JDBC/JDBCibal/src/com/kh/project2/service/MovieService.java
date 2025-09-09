package com.kh.project2.service;

import static com.kh.project2.common.JDBCTemplate.close;
import static com.kh.project2.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.kh.project2.model.dao.MovieDao;
import com.kh.project2.model.vo.Movie;
import com.kh.project2.model.vo.Review;

public class MovieService {

	public MovieService() {
		super();
	}

	public ArrayList<Movie> selectMovieAll() {
		Connection conn = getConnection();
		
		ArrayList<Movie> list = new MovieDao().selectMovieAll(conn);
		
		if (conn != null) close(conn);
		return list;
	}

	
}
