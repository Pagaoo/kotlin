// var é uma palavra reservada que remete a um dado que pode ser mudado durante o programa.
// val é uma palavra reservada que remete a um dado imutavel.

fun main() {
    println("Hello World!");

    val nome = "Gabriel";
    val idade = 22;

    //println(nome);
    //println(idade);

    val frase = "Kotlin é um linguagem"
    val caract = "show!"
    println("$frase $caract")

    // Um bom jeito de setar strings muito grandes
    val str = """adskladskadskads
        |adsopadsopadkosads
        |adkosadkopskopads
        |akodsopadkskopads
        |koadskopadskoadsoads
        |asdadskopadskopads
    """.trimMargin()

    println("${str.length}")
}
