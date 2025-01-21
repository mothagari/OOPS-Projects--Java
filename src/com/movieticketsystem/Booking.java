package com.movieticketsystem;
import java.util.ArrayList;

import java.util.List;
//This class represents a booking made by user for a movie and selected seats.
public class Booking {
	private User user; // user who made the  booking 
	private Movie movie; // Movie for which the  booking is made
	private List<Seat> seats; //list of seats reserved in the booking.
	// constructor to initialize a  booking with  a user and movie
	public Booking (User user, Movie movie)
	{
		this.user=user;
		this.movie=movie;
		this.seats=new ArrayList<>(); // initialize an empty list of seats
	}
	//Method to add a seat to the booking
	public void addSeat(Seat seat) {
		if(seat.isReserved()) {
			//prevent adding  a seat that is already reserved.
			throw new IllegalStateException("Seat "+ seat.getSeatNumber()+" is already reserved."); 
		}
		//Reserve the seat here
		seat.reserve();
		//Add the seat to the booking
		seats.add(seat);
		System.out.println("seat "+ seat.getSeatNumber()+" added to booking.");
		} 
	//method to display booking details , such as the movie and seats reserved
	public void displayBookingDetails() {
		if((movie==null) || !movie.isAvailable()){
			throw new IllegalStateException("Movie is unavailable"); // check movie availability
		}
		if(seats.isEmpty()) {
			throw new IllegalStateException("No seats reserved"); // ensure at leat one seat is reserved
		}
		System.out.println("Booking for "+user.getName()+" : "+movie.getTitle());
		System.out.println("seats reserved: "+ seats.size());
		
	}
} 
