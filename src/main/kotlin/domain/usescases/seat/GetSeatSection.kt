package domain.usescases.seat

import domain.seat.SeatSection
import domain.usescases.flight.GetFlightSaved

/**
 * 5. Mostrar los asientos disponibles
 */


class GetSeatSection(
    private val getFlightSaved: GetFlightSaved
) {
    operator fun invoke(): Map<Int, SeatSection> {
        val flight = getFlightSaved()
        return flight
            .airCraft
            .seatSections
            .mapIndexed { index, seatSection ->
                index + 1 to seatSection
            }.toMap()
    }
}