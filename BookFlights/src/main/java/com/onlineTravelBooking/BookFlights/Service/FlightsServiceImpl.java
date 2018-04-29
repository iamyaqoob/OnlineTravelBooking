package com.onlineTravelBooking.BookFlights.Service;

import java.sql.Date;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import com.onlineTravelBooking.BookFlights.Dao.FlightsDaoInterface;

public class FlightsServiceImpl implements FlightsServiceInterface {

	@Autowired
	FlightsDaoInterface flightsDao;

	public FindIterable<Document> getFlights(MongoDatabase DB, String DEPT_CITY, String ARR_CITY, Date DATE,
			int seats) {
		return flightsDao.getFlights(DB, DEPT_CITY, ARR_CITY, DATE, seats);
	}

}
