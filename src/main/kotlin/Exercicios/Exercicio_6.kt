package Exercicios

fun nums(
    a: Int,
    b: Int,
    c: String
) {
        when (c) {
            "ASC" -> {
                for (i in a..b){
                    println("$i")
                }
            }
            "DESC" -> {
                for (i in b.downTo(a))
                println("$i")
            }
            else -> {
                println("Operação invalida")
            }
        }
}

fun main() {
    nums(10, 15, "DESC")
}