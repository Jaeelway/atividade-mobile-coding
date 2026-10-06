fun contarContasInvalidas(emails: List<String?>): Int {

    var invalidas = 0

    for (email in emails) {

        if (email == null || email.isBlank()) {
            invalidas++
        }
    }

    return invalidas
}


fun main() {

    val emails = listOf(
        "usuario@email.com",
        null,
        "",
        "teste@email.com",
        "   ",
        "outro@email.com"
    )

    val resultado = contarContasInvalidas(emails)

    println("Contas inválidas: $resultado")

}