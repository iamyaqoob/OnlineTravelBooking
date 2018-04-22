package com.onlineTravelBooking.BookFlights.Dao;

import java.util.Date;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.onlineTravelBooking.BookFlights.Entity.Passenger;

public class InsertTicketDaoImpl implements InsertTicketDaoInterface {

	public boolean insertTicket(MongoDatabase DB, String PNR, String AIRLINE, String DEPT_CITY, String ARR_CITY,
			Date DEPT_TIME, Date ARR_TIME, Passenger passenger) {

		MongoCollection<Document> collection = DB.getCollection(COLLECTION_TICKETS);

		Document doc = new Document("PNR", PNR).append("AIRLINE", AIRLINE).append("DEPT_CITY", DEPT_CITY)
				.append("ARR_CITY", ARR_CITY).append("DEPT_TIME", DEPT_TIME).append("ARR_TIME", ARR_TIME);

		// UPDATE FLIGHTS TABLE

		insertPNRDetail(DB, PNR, passenger);

		collection.insertOne(doc);

		return true;
	}

	public void insertPNRDetail(MongoDatabase DB, String PNR, Passenger passenger) {

		MongoCollection<Document> collection = DB.getCollection(COLLECTION_PNR_DEATAIL);

		Document doc = new Document("PNR", PNR).append("FIRST_NAME", passenger.getFIRST_NAME())
				.append("LAST_NAME", passenger.getLAST_NAME()).append("ADDRESS", passenger.getADDRESS())
				.append("PHONE_NUMBER", passenger.getPHONE_NUMBER()).append("EMAIL", passenger.getEMAIL());

		collection.insertOne(doc);

	}

}
