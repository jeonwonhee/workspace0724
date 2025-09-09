package com.kh.project1.service;

import static com.kh.project1.common.JDBCTemplate.close;
import static com.kh.project1.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.project1.model.dao.MovieDao;
import com.kh.project1.model.vo.Movie;

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
