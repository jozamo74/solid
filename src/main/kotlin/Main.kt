//import domain.baggage.pack.regular.RegularBasic as RegularBasic
//import domain.baggage.pack.regular.RegularClassic as RegularClassic

import domain.model.Flight
import domain.model.Ticket
import domain.presentation.Formatter
import domain.usescases.flight.GetFlights
import domain.usescases.ticket.GetTickect
import presentation.PresentationFormat
import presentation.flight.FlightPresentationFactory
import presentation.ticket.TicketPresentationFactory

fun main() {
/*
    val basicPrice = BigDecimal(200)
    val classicPrice = BigDecimal(400)

    val clubBasicClub: VClub = ClubBasic(basicPrice)
    val clubClassicClub: VClub = ClubClassic(price = classicPrice)

    println("Name: ${clubBasicClub.name} price: ${clubBasicClub.price}")
    println("Name: ${clubClassicClub.name} price: ${clubClassicClub.price}")

    val basic: Regular = RegularBasic(price = basicPrice)
    val classic: Regular = RegularClassic(price = classicPrice)

    println("Name: ${basic.name} price: ${basic.price}")
    println("Name: ${classic.name} price: ${classic.price}")

    val clubPlus: BaggagePackage = ClubPlus(price = BigDecimal(500))
    println("Name: ${clubPlus.name} price: ${clubPlus.price}")


    println("---------------------------------------------------------------")

    val flight = Flight(
        number = "Y4 708",
        airCraft = AirCraft("Airbus", "A320"),
        price = BigDecimal(100.0),
        departureArrivalBooking = getAirportPair()
    )

    //val  flightFormatted = flight.fromat()
    val flightConsoleFormat = FlightConsoleFormat()
    val flights = listOf(flight, flight, flight)
    val flightFormatted = flightConsoleFormat.format(flights)
    println(flightFormatted)
    println("---------------------------------------------------------------")

    val ticket = Ticket(
        flight = flight,
        passenger = Passenger(
            name = "José",
            email = "jozamo@ono.com",
            phone = "123456789"
        ),

        baggagePackage = RegularBasic(BigDecimal(50)),
        Seat("2", BigDecimal(15), SeatStatus.RESERVED, SeatClass.PLUS)
    )

    //val ticketFormatter = ticket.fromat()
    val ticketConsoleFormat = TicketConsoleFormat()
    val ticketFormatted = ticketConsoleFormat.format(ticket)
    println(ticketFormatted)*/

    val format = PresentationFormat.CONSOLE
    val flightFormat: Formatter<Flight> =  FlightPresentationFactory().getPresentationFormat(format)
    val flights = GetFlights(flightFormat).invoke()
    println(flights)

    val ticketFormat: Formatter<Ticket> = TicketPresentationFactory().getPresentationFormat(format)
    val ticket = GetTickect(ticketFormat).invoke()
    println(ticket)

    //val getFlights = GetFlights(FlightHTMLFormat())
    //val flightFormat = getFlights.invoke()
    //println(flightFormat)

    //val getTickect = GetTickect(TicketHTMLFormat())
    //val tickectFormat = getTickect.invoke()
    //println(tickectFormat)
}

