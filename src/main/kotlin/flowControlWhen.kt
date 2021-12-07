fun operacao(a: Int, b: Int, c: String) {
    when(c) {
        "Soma".lowercase() -> {
            println(a + b)
        }
        "Subtração".lowercase() -> {
            println(a - b)
        }
        else -> {
            println("Operação incorreta")
        }
    }

}

fun main() {
    operacao(10,20, "soma")
    operacao(10,20,"subtração")
}