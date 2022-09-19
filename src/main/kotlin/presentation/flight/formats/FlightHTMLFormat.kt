package presentation.flight.formats

import domain.model.Flight
import domain.presentation.Formatter
import java.time.format.DateTimeFormatter

class FlightHTMLFormat: Formatter<Flight> {
    override fun format(flight: Flight): String {
        val departure = flight.departureArrivalBooking.first
        val arrival = flight.departureArrivalBooking.second
        return """
            <p><strong>${flight.number}</strong><br/>
            Origin: ${departure.airPort.name}<br/>
            Destination: ${arrival.airPort.name}<br/>
            Departure: ${departure.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            Arrival Date: ${arrival.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            Duration: ${flight.duration}
            <strong>Price: ${'$'}${flight.price}</strong></p>
        """.trimIndent()
    }
}