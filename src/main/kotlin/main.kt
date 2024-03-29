// var é uma palavra reservada que remete a um dado que pode ser mudado durante o programa.
// val é uma palavra reservada que remete a um dado imutavel.

// Quando a função não tem 'fun calcBonus(a: Int): tipoDeDado' é pq não retorna nada
fun calcBonus(a: Int, b: Int, c: Int){
    println("Meu bônus é: ${a + b * c * 2}")
}

fun hello(nome: String) : String{
    return "Hello $nome"
}

// Quando há apenas uma intrução na função, pode fazer uma função em linha unica
fun hello2(nome: String) = "Olá, $nome"
// Também pode haver a especificação do tipo de retorno
//fun hello2(nome: String) : String = "Olá, $nome"

fun soma(a: Int, b: Int) : Int = a + b

fun main() {
    println("Hello World!");

    val nome = "Gabriel"
    val a = 10
    val b = 20
    val c = 30

    calcBonus(a,b,c)
    println(hello(nome))
    println(hello2(nome))
    println(soma(2,2))

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
