package Exercicios

fun quantAbacaxi(qtd: Int) {
    if (qtd < 10) {
        val priceAbacaxi = qtd * 3
        return println("Uma quantidade de $qtd abacaxis está custando $priceAbacaxi")
    } else {
        val priceAbacaxi = qtd * 2
        return println("Uma quantidadde de $qtd abacaxis está custando $priceAbacaxi")
    }
}

fun main() {
    quantAbacaxi(9)
    quantAbacaxi(15)
}
