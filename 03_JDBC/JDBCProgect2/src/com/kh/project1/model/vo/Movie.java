package com.kh.project1.model.vo;

public class Movie {
	
	private int movieId;
	private String title;
	private String genre;
	
	public Movie() {
		super();
	}
	public Movie(int movieId, String title, String genre) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.genre = genre;
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
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[title=" + title + ", genre=" +genre + "]";
	}
	
	

}
