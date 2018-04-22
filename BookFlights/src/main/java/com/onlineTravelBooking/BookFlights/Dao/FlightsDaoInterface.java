package com.onlineTravelBooking.BookFlights.Dao;

import java.sql.Date;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;

public interface FlightsDaoInterface {

	public String COLLECTION_FLIGHTS = "FLIGHTS";

	public FindIterable<Document> getFlights(MongoDatabase DB, String DEPT_CITY, String ARR_CITY, Date date, int seats);

}
