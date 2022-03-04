fun main(args: Array<String>) {
    NatalidadeMortalidade()
}

fun NatalidadeMortalidade (): Unit {

    println("Defina a taxa de nascimentos:")
    var nascidos = readLine()!!.toInt()
    println("Defina a taxa de óbitos:")
    var obitos = readLine()!!.toInt()
    println("Defina o número de habitantes:")
    var habitantes = readLine()!!.toInt()

    println("Escolha uma das opções: \n1 - Taxa de mortalidade \n2 - Taxa de natalidade")

    when (readLine()!!.toInt()) {
        1 -> println("Opção escolhida: Taxa de mortalidade: ${(obitos * 1000) / habitantes}" )
        2 -> println("Opção escolhida: Taxa de natalidade: ${(nascidos * 1000) / habitantes}")

        else -> println("Opção Invalida!")
    }
}
