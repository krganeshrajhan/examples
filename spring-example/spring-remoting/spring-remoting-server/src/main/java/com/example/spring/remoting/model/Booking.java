package com.example.spring.remoting.model;

import static java.lang.String.format;

import java.io.Serializable;

public class Booking implements Serializable {
	private String bookingCode;

	public Booking(String bookingCode) {
		this.bookingCode = bookingCode;
	}

	@Override
	public String toString() {
		return format("Ride confirmed: code '%s'.", bookingCode);
	}

	// standard getters/setters and a constructor
}
