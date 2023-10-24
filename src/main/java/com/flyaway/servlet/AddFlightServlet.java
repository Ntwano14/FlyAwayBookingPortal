package com.flyaway.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flyaway.model.Flight;

/**
 * Servlet implementation class AddFlightServlet
 */
@WebServlet("/AddFlightServlet")
public class AddFlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFlightServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 String operation = request.getParameter("operation");
	        
	        if ("addFlight".equals(operation)) {
	            String flightNumber = request.getParameter("flightNumber");
	            String source = request.getParameter("source");
	            String destination = request.getParameter("destination");
	            String airline = request.getParameter("airline");
	            String departureTime = request.getParameter("departureTime");
	            double ticketPrice = Double.parseDouble(request.getParameter("ticketPrice"));

	            // Assuming you have a Flight class
	            Flight newFlight = new Flight(flightNumber, source, destination, airline, departureTime, ticketPrice);

	            // Retrieve the list of flights from the application context
	            List<Flight> flights = (List<Flight>) getServletContext().getAttribute("flights");

	            // If the flights list is not initialized, initialize it
	            if (flights == null) {
	                flights = new ArrayList<>();
	            }

	            // Add the new flight to the list
	            flights.add(newFlight);

	            // Update the flights list in the application context
	            getServletContext().setAttribute("flights", flights);

	            // Redirect back to the add-flight page or any other page as needed
	            response.sendRedirect("add-flight.jsp");
	        } else {
	            // Handle other operations if necessary
	        }
	    }
	}