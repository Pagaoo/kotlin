fun main() {
    val str = "Gabriel Paganini"

    for (c in str) {
        print("$c ")
    }
    println("")
    // vai mostrar os números no range de 0 à 100. Colocando o step, pula-se de 2 em 2 ou o número que quiser
    for (i in 0..100 step 5) {
        if (i !== 80) print("$i ")
    }
    println("")
    for (j in 100 downTo 0 step 5) {
        print("$j ")
    }
}