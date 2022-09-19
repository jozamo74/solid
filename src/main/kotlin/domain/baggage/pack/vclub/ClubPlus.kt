package domain.baggage.pack.vclub

import domain.baggage.pack.BoardingTurn
import java.math.BigDecimal

class ClubPlus(price: BigDecimal) : VClub(price) {

    override val name: String = "Club Plus"
    override val boardingTurn: BoardingTurn = BoardingTurn.FIRST
}