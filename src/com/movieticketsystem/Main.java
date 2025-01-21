package com.movieticketsystem;
//This is the main class to demonstrate user authentication, seat reservation, and booking functionality
public class Main {
	public static void main(String args[]) {
		//step 1 : to create a user
		User user=new User("Srinidhi","Srinidhi@gmail.com","Srinidhi@123");
		// step 2 : Authenticate the user
		if(!user.authenticate("Srinidhi@gmail.com","Srinidhi@123")) {
			System.out.println("Authentication failed.");
			return; // Exit the program if authentication fails
		} 
		// step 3: create a Movie
		    Movie movie=new Movie(" Vannam Kottattum", "Tamil",143);
	    //step 4 :  create seats
		    Seat seat1=new Seat(1); // create seat 1
		    Seat seat2=new Seat(2); //create seat 2
		    // step 5 : create booking for the authenticated user and movie
		   Booking booking=new Booking(user, movie);
		    try {
		    	//Add reserved seats to the booking
		    	System.out.println("Adding seat 1 to booking:");
		    	booking.addSeat(seat1);
		    	System.out.println("Adding seat 2 to booking:");
		    	booking.addSeat(seat2);
		    }
		    catch (IllegalStateException e) { // handle exception if adding the seat fails
			System.out.println("Error:"+ e.getMessage());
			
		}
		    try {
		    	//display booking details
		    	booking.displayBookingDetails();
		    }
		    catch (IllegalStateException e) {
		    	//handle exception if displacing booking details fails-
				System.out.println("Error: "+e.getMessage());
			
		    }
	}

}
  