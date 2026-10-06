val calcularGorjeta: (Double) -> Double = {

    if (it > 0) {
        it * 0.10
    } else {
        it
    }
}


fun main() {

    println(calcularGorjeta(100.0))
    println(calcularGorjeta(50.0))
    println(calcularGorjeta(0.0))

}