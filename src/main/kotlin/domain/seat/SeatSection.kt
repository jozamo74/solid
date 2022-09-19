package domain.seat

import java.math.BigDecimal

data class SeatSection(
    val seatClass: SeatClass,
    val seats: Array<Seat>,
    val price: BigDecimal
)
