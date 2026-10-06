fun processarTransferencias() {

    val transferencias = listOf<Double?>(
        50.0,
        null,
        120.5,
        null,
        10.0
    )

    var total = 0.0

    for (transferencia in transferencias) {

        transferencia?.let {
            total += it
        }
    }

    println("Total processado: R$ $total")
}


fun main() {

    processarTransferencias()

}