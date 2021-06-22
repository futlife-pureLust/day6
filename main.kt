fun main(args: Array<String>) {
    val greetingFunction = { playerName: String, numBulidings: Int ->
        val currentYear = 2018
        println("Adding $numBulidings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
    runSimulation("Guyal",greetingFunction)
}
fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String)
{
    val numBuildings = (1..3).shuffled().last() //Randomly selects 1, 2, or 3
    println(greetingFunction(playerName, numBuildings))
}