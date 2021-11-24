fun maiorDeIdade(idade: Int) {
    if (idade >= 18) {
        println("A pessoa é maior de idade")
    } else {
        println("A pessoa é menor de idade")
    }
}


fun main() {
    val idade = 22
    //val idade = 17
    maiorDeIdade(idade)
}