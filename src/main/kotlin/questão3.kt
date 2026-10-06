fun validarBioFinal(biografia: String?) {

    val tamanho = biografia?.length ?: 0

    if (tamanho <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}


fun main() {

    validarBioFinal("Olá, essa é minha bio!")
    validarBioFinal(null)

}