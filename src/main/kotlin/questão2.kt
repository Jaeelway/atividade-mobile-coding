fun verificarEndereco(endereco: String?) {

    val mensagem = endereco?.let {
        "Entrega Pendente: $it"
    } ?: "Endereço Desconhecido"

    println(mensagem)
}


fun main() {

    verificarEndereco("Rua das Flores, 123")
    verificarEndereco(null)

}