package presentation.ticket.formats

import domain.model.Ticket
import domain.presentation.Formatter

class TicketConsoleFormat : Formatter<Ticket> {
    override fun format(t: Ticket): String {
        return """
            Passenger: ${t.passenger.name}
            Flight Number: ${t.flight.number}
            Departure: ${t.flight.departureArrivalBooking.first.airPort.name}
            Arrival: ${t.flight.departureArrivalBooking.second.airPort.name}
            Flight Price: $${t.flight.price}
            BaggagePlan: $//{bagage.format()}
            Seat: ${t.seat.number}
            Total: $${t.totalPrice}
        """.trimIndent()
    }
}