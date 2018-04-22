package com.onlineTravelBooking.BookFlights.Dao;

import java.util.Date;

import com.mongodb.client.MongoDatabase;
import com.onlineTravelBooking.BookFlights.Entity.Passenger;

public interface InsertTicketDaoInterface {

	public String COLLECTION_TICKETS = "TICKETS";
	public String COLLECTION_PNR_DEATAIL = "PNR_DETAIL";

	public boolean insertTicket(MongoDatabase DB, String PNR, String AIRLINE, String DEPT_CITY, String ARR_CITY,
			Date DEPT_TIME, Date ARR_TIME, Passenger passenger);

}
