package domain.presentation

// Generics
interface Formatter<T> {
    fun format(t: T): String

    // Añadimos comportamiento por defecto
    fun format(ts: List<T>): String {
        val stringBuilder = StringBuilder()
        ts.forEach {
            stringBuilder.appendLine(format(it))
        }

        return stringBuilder.toString()
    }
}