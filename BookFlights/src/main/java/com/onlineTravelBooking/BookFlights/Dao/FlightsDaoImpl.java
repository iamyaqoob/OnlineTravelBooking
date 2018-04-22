package com.onlineTravelBooking.BookFlights.Dao;

import java.sql.Date;

import org.bson.Document;
import org.springframework.stereotype.Repository;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Repository
public class FlightsDaoImpl implements FlightsDaoInterface {

	public MongoCollection<Document> getFlights(MongoDatabase DB, String DEPT_CTY, String ARR_CITY, Date date,
			int seats) {

		// DBCollection collection = DB.getCollection(flights);

		return null;
	}

}
