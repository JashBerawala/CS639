fun main(args: Array<String>) {
    println("Hello, world!")
}

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
}

// Will assign kotlin.Unit
val isUnit = println("This is an expression")
println(isUnit)

val temperature = 10
val isHot = if (temperature > 50) true else false
println(isHot)

val temperature = 10
val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
println(message)

fun feedTheFish() {
    val day = randomDay()
    val food = "pellets"
    println ("Today is $day and the fish eat $food")
}

fun main(args: Array<String>) {
    feedTheFish()
}
fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}
