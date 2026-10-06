fun calcularDesconto(preco: Double, cupom: String?): Double {

    val precoFinal = when (cupom) {
        "PROMO10" -> {
            preco - 10
        }

        "PROMO20" -> {
            preco - 20
        }

        else -> {
            preco
        }
    }

    println("Preço final: R$ $precoFinal")

    return precoFinal
}


fun main() {

    calcularDesconto(100.0, "PROMO10")
    calcularDesconto(100.0, "PROMO20")
    calcularDesconto(100.0, null)

}