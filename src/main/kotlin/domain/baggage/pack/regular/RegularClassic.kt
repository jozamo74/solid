package domain.baggage.pack.regular

import domain.baggage.pack.BoardingTurn
import java.math.BigDecimal

class RegularClassic(price: BigDecimal) : Regular(price) {
    override val name: String = "Regular Classic"
    override val boardingTurn: BoardingTurn = BoardingTurn.SECOND
}