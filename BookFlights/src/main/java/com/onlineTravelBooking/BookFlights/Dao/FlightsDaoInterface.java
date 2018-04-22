package com.onlineTravelBooking.BookFlights.Dao;

import java.sql.Date;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public interface FlightsDaoInterface {

	public String flights = "FLIGHTS";

	public MongoCollection<Document> getFlights(MongoDatabase DB, String DEPT_CTY, String ARR_CITY, Date date,
			int seats);

}
