package domain.baggage.pack.vclub

import domain.baggage.pack.BaggagePackage
import domain.baggage.pack.BoardingTurn
import domain.baggage.type.BaggageType
import domain.baggage.type.BoxPacked
import java.math.BigDecimal

const val DISCOUNT = 30

abstract class VClub(
    final override var price: BigDecimal,


) : BaggagePackage() {

    init {
        price = (price * BigDecimal(DISCOUNT) / BigDecimal(100))
    }

    abstract override val name: String
    abstract override val boardingTurn: BoardingTurn

    override val baggageTypes: List<BaggageType>
        get() = super.baggageTypes + listOf(
            BoxPacked()
        )
}

/*
open class VClub(
    override val name: String,
    final override var price: BigDecimal,


) : BaggagePackage() {

    init {
        price = (price * BigDecimal(DISCOUNT) / BigDecimal(100))
    }

    override val baggageTypes: List<BaggageType>
        get() = super.baggageTypes + listOf(
            BoxPacked()
        )
}
*/