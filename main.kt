fun main(args: Array<String>) {
    val greetingFunction = { playerName: String, numBulidings: Int ->
        val currentYear = 2018
        println("Adding $numBulidings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
    println(greetingFunction("Guyal",2))
}