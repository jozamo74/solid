package domain.model

import domain.baggage.pack.BaggagePackage
import domain.presentation.Formatter
import domain.seat.Seat
import java.math.BigDecimal

data class Ticket(
    val flight: Flight,
    val passenger: Passenger,
    val baggagePackage: BaggagePackage,
    val seat: Seat,
    val totalPrice: BigDecimal = flight.price + baggagePackage.price + seat.price
) {
    /*override fun fromat(): String {

    }*/


}
