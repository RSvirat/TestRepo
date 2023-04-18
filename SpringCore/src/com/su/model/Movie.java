package com.su.model;

import org.springframework.stereotype.Component;

@Component
public class Movie {
	private String movieName;
	private String movieActor;
	private int movieId;
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieActor() {
		return movieActor;
	}
	public void setMovieActor(String movieActor) {
		this.movieActor = movieActor;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", movieActor=" + movieActor + ", movieId=" + movieId + "]";
	}
	
	
}
