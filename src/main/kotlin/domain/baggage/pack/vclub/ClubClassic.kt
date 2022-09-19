package domain.baggage.pack.vclub

import domain.baggage.pack.BoardingTurn
import java.math.BigDecimal

class ClubClassic(price: BigDecimal) : VClub(price) {

    override val name: String =  "Classic VClub"
    override val boardingTurn: BoardingTurn = BoardingTurn.SECOND

}