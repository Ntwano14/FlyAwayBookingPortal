package com.flyaway.model;

public class Flight {
	
	 private String flightNumber;
	    private String departureCity;
	    private String destinationCity;
	    private String departureDate;
	    private String departureTime;
	    private double price;
	    
		public Flight() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Flight(String flightNumber, String departureCity, String destinationCity, String departureDate,
				String departureTime, double price) {
			super();
			this.flightNumber = flightNumber;
			this.departureCity = departureCity;
			this.destinationCity = destinationCity;
			this.departureDate = departureDate;
			this.departureTime = departureTime;
			this.price = price;
		}
		public String getFlightNumber() {
			return flightNumber;
		}
		public void setFlightNumber(String flightNumber) {
			this.flightNumber = flightNumber;
		}
		public String getDepartureCity() {
			return departureCity;
		}
		public void setDepartureCity(String departureCity) {
			this.departureCity = departureCity;
		}
		public String getDestinationCity() {
			return destinationCity;
		}
		public void setDestinationCity(String destinationCity) {
			this.destinationCity = destinationCity;
		}
		public String getDepartureDate() {
			return departureDate;
		}
		public void setDepartureDate(String departureDate) {
			this.departureDate = departureDate;
		}
		public String getDepartureTime() {
			return departureTime;
		}
		public void setDepartureTime(String departureTime) {
			this.departureTime = departureTime;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Flight [flightNumber=" + flightNumber + ", departureCity=" + departureCity + ", destinationCity="
					+ destinationCity + ", departureDate=" + departureDate + ", departureTime=" + departureTime
					+ ", price=" + price + "]";
		}
		
}
