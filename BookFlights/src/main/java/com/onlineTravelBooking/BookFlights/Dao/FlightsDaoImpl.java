package com.onlineTravelBooking.BookFlights.Dao;

import java.sql.Date;

import org.bson.Document;
import org.springframework.stereotype.Repository;

import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Repository
public class FlightsDaoImpl implements FlightsDaoInterface {

	public FindIterable<Document> getFlights(MongoDatabase DB, String DEPT_CITY, String ARR_CITY, Date DATE,
			int seats) {

		MongoCollection<Document> collection = DB.getCollection(COLLECTION_FLIGHTS);

		BasicDBObject query = new BasicDBObject();
		query.put(DEPT_CITY, DEPT_CITY);
		query.put(ARR_CITY, ARR_CITY);
		query.put("SEATS", new BasicDBObject("$gte", seats));

		FindIterable<Document> docs = collection.find();

		for (Document d : docs) {
			System.out.println(d);
			System.out.println(d.get("DEPT_CITY"));
			System.out.println(d.get("IATA_CODE"));
			// access documents e.g. doc.get()
		}

		return docs;
	}

}
