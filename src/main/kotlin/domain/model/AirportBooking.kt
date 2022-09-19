package domain.model

import java.time.LocalDateTime

data class AirportBooking(
    val airPort: AirPort,
    val dateTime: LocalDateTime
)
