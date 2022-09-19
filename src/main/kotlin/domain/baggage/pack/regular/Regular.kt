package domain.baggage.pack.regular

import domain.baggage.pack.BaggagePackage
import domain.baggage.pack.BoardingTurn
import java.math.BigDecimal

abstract class Regular(

    override val price: BigDecimal
): BaggagePackage() {

    abstract override val name: String
    abstract override val boardingTurn: BoardingTurn

}