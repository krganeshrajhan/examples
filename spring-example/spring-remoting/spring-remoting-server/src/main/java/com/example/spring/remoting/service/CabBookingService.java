package com.example.spring.remoting.service;

import com.example.spring.remoting.model.Booking;
import com.example.spring.remoting.exception.BookingException;

public interface CabBookingService {
	Booking bookRide(String pickUpLocation) throws BookingException;
}
