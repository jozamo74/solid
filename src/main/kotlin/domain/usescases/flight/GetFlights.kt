package domain.usescases.flight

import domain.model.AirCraft
import domain.model.AirPort
import domain.model.AirportBooking
import domain.model.Flight
import domain.presentation.Formatter
import java.math.BigDecimal
import java.time.LocalDateTime
import java.time.Month

/**
 * Mostrar los vuelos disponibles de un mes
 */
class GetFlights {
    fun invoke(month: Month) : Map<Int, Flight>{
        val flight = Flight(
            number = "Y4 708",
            airCraft = AirCraft("Airbus", "A320"),
            price = BigDecimal(100.0),
            departureArrivalBooking = getAirportPair()
        )

        val flightsMap = mapOf(
            1 to flight,
            2 to flight,
            3 to flight
        )
        return flightsMap.filter {fligthEntry ->
            fligthEntry.value.departureArrivalBooking.first.dateTime.month == month

        }

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
/*class GetFlights(private val formatter: Formatter<Flight>) {

    fun invoke(): String {
        val flight = Flight(
            number = "Y4 708",
            airCraft = AirCraft("Airbus", "A320"),
            price = BigDecimal(100.0),
            departureArrivalBooking = getAirportPair()
        )
        val flights = listOf(flight, flight, flight)

        return formatter.format(flights)
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
}*/

