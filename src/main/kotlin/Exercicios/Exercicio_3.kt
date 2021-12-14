package Exercicios

fun category(categoria: String) {
    when (categoria) {
        "Pena".lowercase() -> {
            println("A categoria peso pena comporta menos de 57 kg")
        }
        "Leve".lowercase() -> {
            println("A categoria peso leve comporta entre 57 kg à 61 kg")
        }
        "Médio".lowercase() -> {
            println("A categoria peso médio comporta entre 61 kg à 73 kg")
        }
        "Pesado".lowercase() -> {
            println("A categoria peso pesado comporta acima de 73 kb")
        }
        else -> {
            println("CATEGORIA INVALÍDA")
        }
    }
}

fun main() {
    category("leve")
}