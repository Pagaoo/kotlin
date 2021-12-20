fun main() {
    val str: String? = null
    println(str?.length) //Tem que usar o elvis operator ?.

    println(str!!.length) // Assumi que pode dar erro e continua
}