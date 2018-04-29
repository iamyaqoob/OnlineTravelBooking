package com.onlineTravelBooking.BookFlights.Service;

import java.util.Date;

import com.mongodb.client.MongoDatabase;
import com.onlineTravelBooking.BookFlights.Entity.Passenger;

public interface InsertTicketServiceInterface {

	public boolean insertTicket(MongoDatabase DB, String PNR, String AIRLINE, String DEPT_CITY, String ARR_CITY,
			Date DEPT_TIME, Date ARR_TIME, Passenger passenger);
}
