package com.onlineTravelBooking.BookFlights.Service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.mongodb.client.MongoDatabase;
import com.onlineTravelBooking.BookFlights.Dao.InsertTicketDaoInterface;
import com.onlineTravelBooking.BookFlights.Entity.Passenger;

public class InsertTicketServiceImpl implements InsertTicketServiceInterface {

	@Autowired
	InsertTicketDaoInterface insertTicketDao;

	public boolean insertTicket(MongoDatabase DB, String PNR, String AIRLINE, String DEPT_CITY, String ARR_CITY,
			Date DEPT_TIME, Date ARR_TIME, Passenger passenger) {

		boolean result = insertTicketDao.insertTicket(DB, PNR, AIRLINE, DEPT_CITY, ARR_CITY, DEPT_TIME, ARR_TIME,
				passenger);

		if (result == true) {
			return true;
		}

		return false;
	}

}
