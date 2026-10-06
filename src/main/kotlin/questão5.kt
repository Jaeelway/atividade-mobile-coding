fun classificarFeedback(nota: Int?) {

    if (nota == null || nota == 0) {
        println("Nenhuma avaliação fornecida.")
    } else if (nota == 5) {
        println("Excelente corrida!")
    } else if (nota == 4) {
        println("Boa corrida.")
    } else {
        println("Precisamos melhorar.")
    }
}


fun main() {

    classificarFeedback(5)
    classificarFeedback(4)
    classificarFeedback(3)
    classificarFeedback(0)
    classificarFeedback(null)

}