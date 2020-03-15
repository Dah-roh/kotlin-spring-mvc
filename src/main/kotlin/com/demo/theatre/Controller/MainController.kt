package com.demo.theatre.Controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView


@Controller
class MainController {


    @RequestMapping("")
    fun homePage(): ModelAndView = ModelAndView("seatBooking", "bean", CheckAvailabilityBackingBean())

}



class CheckAvailabilityBackingBean() {

    val seatNumber = 1..40
    val seatRows = 'A'..'O'
    var selectedSeatNumber: Int = 1
    var selectedSeatRow: Char = 'A'
    var result: String = ""
}