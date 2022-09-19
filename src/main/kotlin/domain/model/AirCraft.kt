package domain.model

import domain.seat.SeatSection

data class AirCraft(
    val name: String,
    val model: String,
    val airline: Airline = Airline("VL", "Volarius"),
    val seatSections: List<SeatSection>
)
