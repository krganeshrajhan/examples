package com.example.spring.remoting.service;

import static java.lang.Math.random;
import static java.util.UUID.randomUUID;

import com.example.spring.remoting.exception.BookingException;
import com.example.spring.remoting.model.Booking;

import org.springframework.stereotype.Service;

@Service
public class CabBookingServiceImpl implements CabBookingService {

	@Override
	public Booking bookRide(String pickUpLocation) throws BookingException {
		if (random() < 0.3) throw new BookingException("Cab unavailable");
		return new Booking(randomUUID().toString());
	}
}
