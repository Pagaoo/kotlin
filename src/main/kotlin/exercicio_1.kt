fun charStr(str: String) = "A String $str tem ${str.length} caracteres"

fun main() {
    val str = "Gabriel"
    println(charStr(str))
}