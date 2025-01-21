package com.movieticketsystem;
//This class represents seat in the theater with a seat number and reservation status
public class Seat {
	private int seatNumber; // unique number identifying the seat
	private boolean isReserved; // reservation status of the seat
	public Seat(int seatNumber) {
		this.seatNumber=seatNumber;
		this.isReserved=false; // seats are unreserved by default 
	}
	// method to check  if the seat is  reserved
		public boolean isReserved() {
		return isReserved;
	}
		//method to reserve the seat . throws an exception if already reserved
	public void reserve() {
		if(!isReserved) {
			System.out.println("Reserving seat: "+ seatNumber);
			isReserved=true; // mark the seat as reserved
		}
		else {
			throw new IllegalStateException("Seat " +seatNumber+ "already reserved"); //prevent  double booking 
		}
		
	}
	//retrieve seat number
	public int getSeatNumber() {
		return seatNumber;
	} 
}
