import java.lang.NumberFormatException

// USA-SE CONVERSÃO DE VALORES QUANDO UM TIPO DE VARIAVEL SUPORTA MENOS DO QUE A OUTRA. TEM QUE SER EXPLICITA
//EX: Byte to Double; Int to Float; Short to Long etc
//E TAMBÉM PARA CONVERSÃO DE STRINGS PARA NÚMEROS

fun main() {
    val n1: Double = Double.MAX_VALUE
    val b1: Byte = 100

    println(b1.toShort())
    println(b1.toLong())
    println(b1.toFloat())
    println(b1.toDouble())


    // Na hora de tratar excessões especificas, sempre colocar elas em primeiro, como a NumberFormatException que
    // verifica se é um número.
    try {
        println("dasadsads".toDouble())
    } catch (e: NumberFormatException) { // Jeito especifico
      println("Esse valor não é um número")
    } catch (e: Exception) { //Jeito genérico
        println("Algo está errado")
    } finally { // Executa sempre depois de entrar e sair do try e catch
        println("19".toInt())
        println("19".toFloat())
        println("19".toDouble())
    }

}