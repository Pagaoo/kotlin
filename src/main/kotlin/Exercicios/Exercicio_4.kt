package Exercicios

fun numerosPares() {
    for (nums in 100..200) {
        var i = 0
        val j = nums % 2
        if (j == 0) println("${nums}")
    }
}

fun main() {
    numerosPares()
}