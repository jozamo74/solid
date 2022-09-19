package domain.usescases.ticket

import domain.baggage.pack.regular.RegularBasic
import domain.model.*
import domain.presentation.Formatter
import domain.seat.Seat
import domain.seat.SeatClass
import domain.seat.SeatStatus
import java.math.BigDecimal
import java.time.LocalDateTime
import java.time.Month

class GetTickect(private val formatter: Formatter<Ticket>) {

    fun invoke(): String {
        val flight = Flight(
            number = "Y4 708",
            airCraft = AirCraft("Airbus", "A320"),
            price = BigDecimal(100.0),
            departureArrivalBooking = getAirportPair()
        )
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
            return formatter.format(ticket)

    }
    private fun getAirportPair(): Pair<AirportBooking, AirportBooking> {
        return Pair(
            AirportBooking(
                airPort = AirPort("BOG", "Bogotá"),
                dateTime = LocalDateTime.of(2022, Month.JUNE, 10, 13, 0, 0)
            ),
            AirportBooking(
                airPort = AirPort("CUN", "Cancún"),
                dateTime = LocalDateTime.of(2022, Month.JUNE, 10, 17, 30, 0)

            )
        )

    }
}