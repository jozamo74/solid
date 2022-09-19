package domain.baggage.type

class Hand() : BaggageType() {
    override val emoji: String = "\uD83D\uDC5C"
    override val title: String = "Hand Baggage"
    //val warning: String = "Warning message" //-> mejor no en codigo limpio

}
