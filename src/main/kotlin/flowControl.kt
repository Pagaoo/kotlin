fun calculaBonus(cargo: String, salario: Float): String {
    // Gerente Junior, Gerente Senior, Coordenador
    val bonus: Float
    if (cargo == "Coordenador") {
        return "O bonus de um Coordenador é de: ${(salario * 0.2f).also { bonus = it }}"
    } else if (cargo == "Gerente Junior") {
        return "O bonus de um Gerente Junior é de: ${(salario * 0.5f).also { bonus = it }}"
    } else {
        return "O bonus de um Gerente Senior é de: ${(salario * 2f).also { bonus = it }}"
    }
    return "$bonus"
}

fun maiorDeIdade(idade: Int) {
    if (idade >= 18) {
        println("A pessoa é maior de idade")
    } else {
        println("A pessoa é menor de idade")
    }
}

fun main() {
    val idade = 22
    //val idade = 1
    maiorDeIdade(idade)

    println(calculaBonus("Coordenador", 3000f))
    println(calculaBonus("Gerente Junior", 3000f))
    println(calculaBonus("Gerente Senior", 3000f))
}