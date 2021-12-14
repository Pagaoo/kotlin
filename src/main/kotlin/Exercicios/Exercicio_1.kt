package Exercicios

fun maiorValor(num_1: Int, num_2: Int) {
    if (num_1 > num_2) {
        return println("O maior número é o: $num_1")
    } else if (num_2 > num_1) {
        return println("O maior número é o: $num_2")
    }
    else{
        return println("Números iguais")
    }
}

fun main() {
    maiorValor(10, 10)
}