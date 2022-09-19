package presentation.ticket.formats

import domain.model.Ticket
import domain.presentation.Formatter

class TicketHTMLFormat: Formatter<Ticket> {
    override fun format(t: Ticket): String {
        return """
            <p><strong>Passenger: ${t.passenger.name}</strong><br/>
            Flight Number: ${t.flight.number}<br/>
            Departure: ${t.flight.departureArrivalBooking.first.airPort.name}<br/>
            Arrival: ${t.flight.departureArrivalBooking.second.airPort.name}<br/>
            Flight Price: $${t.flight.price}<br/>
            BaggagePlan: $//{bagage.format()}<br/>
            Seat: ${t.seat.number}<br/>
            <strong>Total: $${t.totalPrice}</strong></p>
        """.trimIndent()
    }
}