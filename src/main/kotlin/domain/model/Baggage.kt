package domain.model

import java.math.BigDecimal

data class Baggage(
    val name: String,
    val price: BigDecimal,
    val personalQty: Int,
    val hadQty: Int,
    val checkedQty: Int
)
