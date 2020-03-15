package com.demo.theatre.Services

import org.springframework.stereotype.Service


@Service
class BookingService {

    fun isSeatFree(seat: Seat) : Boolean {
        return true
    }
}