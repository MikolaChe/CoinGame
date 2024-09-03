
fun main() {

    var line: String = "##########";
    var bonuses = 0

    do {
        bonuses ++

        val x = Math.random()
        val y = Math.random()
        val isBigger = x > y

        if (isBigger) line +="#"
        if (!isBigger) line = line.drop(1)

        println(line)

        if (line.length == 0) println("GAME OVER - YOU ARE BANKRUPT")
        if (line.length == 20) println("YOU ARE WIN $bonuses BONUSES")

        Thread.sleep(300)
    } while (line.length > 0 && line.length < 20)

}