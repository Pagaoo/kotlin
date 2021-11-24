fun main(){
    // Vai atribuir 100 a uma variavel nula
    val test: Int? = null
    val op: Int = test ?: 100

    println(op)
}