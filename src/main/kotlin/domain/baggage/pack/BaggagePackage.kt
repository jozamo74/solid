package domain.baggage.pack

import domain.baggage.type.BaggageType
import domain.baggage.type.BigHand
import domain.baggage.type.Checked
import domain.baggage.type.Hand
import java.math.BigDecimal

abstract class BaggagePackage {

    abstract val name: String
    abstract val price: BigDecimal
    abstract val boardingTurn: BoardingTurn

    open val baggageTypes: List<BaggageType> = listOf(
        Hand(),
        BigHand(),
        Checked()
    )
}


/*
open class BaggagePackage(
    open val name: String = "Baggage Plan",
    open val price: BigDecimal = BigDecimal(0.0)
) {
    open val boardingTurn: BoardingTurn = BoardingTurn.FIRST
    open val baggageTypes: List<BaggageType> = listOf(
        Hand(),
        BigHand(),
        Checked()
    )
}
*/