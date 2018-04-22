package com.onlineTravelBooking.BookFlights.Entity;

public class Passenger {

	private String FIRST_NAME;
	private String LAST_NAME;
	private String ADDRESS;
	private String PHONE_NUMBER;
	private String EMAIL;

	public Passenger(String fIRST_NAME, String lAST_NAME, String aDDRESS, String pHONE_NUMBER, String eMAIL) {
		super();
		FIRST_NAME = fIRST_NAME;
		LAST_NAME = lAST_NAME;
		ADDRESS = aDDRESS;
		PHONE_NUMBER = pHONE_NUMBER;
		EMAIL = eMAIL;
	}

	public String getFIRST_NAME() {
		return FIRST_NAME;
	}

	public String getLAST_NAME() {
		return LAST_NAME;
	}

	public String getADDRESS() {
		return ADDRESS;
	}

	public String getPHONE_NUMBER() {
		return PHONE_NUMBER;
	}

	public String getEMAIL() {
		return EMAIL;
	}

}
