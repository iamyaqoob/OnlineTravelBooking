package com.onlineTravelBooking.BookFlights.Dao;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class Connection {

	static MongoClient mongo;
	static MongoDatabase mongoDB;

	public MongoClient connectMongo(String server, int port) {
		mongo = new MongoClient(server, port);
		return mongo;
	}

	public MongoDatabase connectDB(String db) {
		mongoDB = mongo.getDatabase(db);
		return mongoDB;
	}

}
