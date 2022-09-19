package domain.baggage.pack.regular

import domain.baggage.pack.BoardingTurn
import java.math.BigDecimal

class RegularPlus(price: BigDecimal) : Regular(price) {
    override val name: String = "Regular Plus"
    override val boardingTurn: BoardingTurn = BoardingTurn.FIRST
}