package com.cdac.model;

import java.sql.Date;

public class Movie {
	//Attributes of Movies
	
	private int movieId;
	private String title;
	private String director;
	private String genre;
	private int rating;
	private int realaseYear;
	
	
	//Default Constructors

public Movie() {
		
}
//Parameterized Constructor

	public Movie(int movieId, String title, String director, String genre, int rating, int realaseYear) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.rating = rating;
		this.realaseYear = realaseYear;
	}
	
	
	//Getter And Setter to Access Private Data
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

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getRealaseYear() {
		return realaseYear;
	}

	public void setRealaseYear(int realaseYear) {
		this.realaseYear = realaseYear;
	}

	
	//ToString Methods

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", title=" + title + ", director=" + director + ", genre=" + genre
				+ ", rating=" + rating + ", realaseYear=" + realaseYear + "]";
	}
	
	
	
	

	
	





	

	
	
	
	
	
	
	
	
	
	
	
}
