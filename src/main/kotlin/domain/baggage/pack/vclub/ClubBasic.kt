package domain.baggage.pack.vclub

import domain.baggage.pack.BoardingTurn
import java.math.BigDecimal

class ClubBasic(price: BigDecimal) : VClub(price) {
    override val name: String = "Basic VClub"
    override val boardingTurn: BoardingTurn = BoardingTurn.THIRD
}