package com.flyaway.servlet;

import java.io.IOException;
import  com.flyaway.model.Search;
import java.io.PrintWriter;
import java.time.*;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SearchServlet extends HttpServlet {

    @Override
    public void service (HttpServletRequest request, HttpServletResponse response) throws IOException {
        Search.date = request.getParameter("date");
        Search.source = request.getParameter("source");
        Search.destination = request.getParameter("destination");
        Search.persons = Integer.parseInt(request.getParameter("persons"));

        if (Search.date.equals("")) {
            PrintWriter out = ((ServletResponse) request).getWriter();
            out.println("Please enter a valid date");
        }
        else {
            Search.day = getDay(Search.date);
            response.sendRedirect("search-results.jsp");
        }
    }

    public String getDay(String dateInp) {
        LocalDate dt = LocalDate.parse(dateInp);
        return dt.getDayOfWeek().toString();
    }
}
