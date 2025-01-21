package com.movieticketsystem;
//this class represents a  movie with details such as title,genre,  and duration
public class Movie {
	private String title;
	private String genre; // action,comedy
	private int duration; // in minutes
	private boolean isAvailable; // Availability  status of the movie
	//constructor to initialize movie details
	public Movie (String title, String genre,int duration) {
		this.title=title;
		this.genre=genre;
		this.duration=duration;
		this.isAvailable=true;
	}
	public String  getTitle() {
		return title;
	}
	//method to check if the  movie is available
	public boolean isAvailable() {
		return isAvailable;
	}
	// method to mark movie as unavailable(e.g.sold out or removed)
	public void remove() {
		this.isAvailable=false;
	}
}
