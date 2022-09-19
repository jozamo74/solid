package presentation.flight.formats

import domain.model.Flight
import domain.presentation.Formatter
import java.time.format.DateTimeFormatter

class FlightConsoleFormat: Formatter<Flight> {
    override fun format(t: Flight): String {
        val departure = t.departureArrivalBooking.first
        val arrival = t.departureArrivalBooking.second
        return """
            ${t.number}
            Origin ${departure.airPort.name}
            Origin ${departure.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            
            Arrival ${arrival.airPort.name}
            Arrival ${arrival.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            
            Duration: ${t.duration}
            
            Price: $${t.price}
            
        """.trimIndent()
    }

    // Comentado pues le hemos dado comportamiento en la interfaz
    /*override fun format(ts: List<Flight>): String {

    }*/
}