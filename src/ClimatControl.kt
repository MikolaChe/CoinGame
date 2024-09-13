fun main(){
    climateControl()
}

fun heat(currentTemperature: Int, temperatureNeeded: Int) {
    println("Here is cold. I start heating...")
    for (t in currentTemperature..temperatureNeeded) {
        println("set temperature $t")
        Thread.sleep(1000)
    }
    println("Stop. Temperature set up $temperatureNeeded")
}

fun cool(currentTemperature: Int, temperatureNeeded: Int) {
    println("Here is warm. I start cooling...")
    for (t in currentTemperature downTo temperatureNeeded) {
        println("set temperature $t")
        Thread.sleep(1000)
    }
    println("Stop. Temperature set up $temperatureNeeded")
}

fun setValue(text: String): Int {
    print("Set $text")
    return readlnOrNull()?.toIntOrNull() ?: 0
}

fun climateControl() {
    val currentTemperature = setValue("current temperature: ")
    if (currentTemperature == 0) println("You entered 0 or wrong value")
    val neededTemperature = setValue("needed temperature: ")
    if (neededTemperature == 0) println("You entered 0 or wrong value")
    if (currentTemperature < neededTemperature) heat(currentTemperature,neededTemperature)
    if (currentTemperature > neededTemperature) cool(currentTemperature,neededTemperature)
}
