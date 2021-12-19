fun main() {
    var index: Int = 0

    while(index <= 100) {
        println("Index está em $index")
        index++

        if (index == 50) {
            break
        }
    }

    println("")

    var i: Int = 10
    do {
        println("O i está em $i")
        i++
    } while (i <= 100)
}