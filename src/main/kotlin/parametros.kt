// CASO HAJA ALGUM PARAMETRO QUE NÃO SE SAIBA, PODE-SE INICIA-LOS COMO UM VALOR POR DEFAULT. PORÉM A CHAMADA DA FUNÇÃO
// SERÁ DIFERENTE.
fun endereco(rua: String = "", cidade: String, estado: String, cep: String, numero: Int = 0) {
    println("Rua: $rua")
    println("Cidade: $cidade - $estado - $cep")
}

// vararg ME DEIXA COLOCAR QUANTOS PARAMETROS EU PRECISAR
fun media(vararg notas: Float){
    if (notas.isNotEmpty()) {
       var soma = 0f
       for (nota in notas) {
           soma += nota
       }
        println("A média é: ${soma/notas.size}")
    }
}

// ESSA FUNÇÃO ACEITA DIFERENTES TIPOS DE VALORES
fun <T> media2(vararg valores: T) {
    for (valor in valores) {
        println(valor)
    }
}

fun main() {
    // AGORA NA HORA DE CHAMAR A FUNÇÃO, TERÁ QUE CHAMAR A VARIAVEL DE FORMA EXPLICITA
    endereco(cidade = "Vitória", estado = "Espirito Santo", cep = "29060-110")
    media(8f,9f)
    media2("asdsdas", 12, 3f, 234423f, 'c')
}

