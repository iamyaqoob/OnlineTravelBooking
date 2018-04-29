package com.onlineTravelBooking.BookFlights.Service;

import java.sql.Date;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;

public interface FlightsServiceInterface {

	public FindIterable<Document> getFlights(MongoDatabase DB, String DEPT_CITY, String ARR_CITY, Date DATE, int seats);
}
