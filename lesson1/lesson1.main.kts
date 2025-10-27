fun printHello() {

    println("Hello Kotlin")
}
printHello()

println(1+1)
println(53-3)
println(50/10)
println(1.0/2.0)
println(2.0*3.5)
println(6*50)
println(6.0*50.0)
println(6.0*50)
println(2.times(3))
println(3.5.plus(4))
println(2.4.div(2))

val i: Int = 6
val b1 = i.toByte()
println(b1)

val b2: Byte = 1 // OK, literals are checked statically
println(b2)

val i4: Int = b2.toInt() // OK!
println(i4)

val i5: String = b2.toString()
println(i5)

val i6: Double = b2.toDouble()
println(i6)

val oneMillion = 1_000_000
println(oneMillion)

var fish = 1
fish = 2
var aquarium = 1
aquarium = 2

val numberOfFish = 5
val numberOfPlants = 12
println("I have $numberOfFish fish" + " and $numberOfPlants plants")

println("I have ${numberOfFish + numberOfPlants} fish and plants")

val numberOfFish1 = 50
val numberOfPlants1 = 23
if (numberOfFish1 > numberOfPlants1) {
    println("Good ratio!")
} else {
    println("Unhealthy ratio")
}
val fish1 = 50
if (fish1 in 1..100) {
    println(fish1)
}

if (numberOfFish == 0) {
    println("Empty tank")
} else if (numberOfFish < 40) {
    println("Got fish!")
} else {
    println("That's a lot of fish!")
}

when (numberOfFish) {
    0  -> println("Empty tank")
    in 1..39 -> println("Got fish!")
    else -> println("That's a lot of fish!")
}

var marbles: Int? = null

var fishFoodTreats = 6
if (fishFoodTreats != null) {
    fishFoodTreats = fishFoodTreats.dec()
}
val school = listOf("mackerel", "trout", "halibut")
println(school)

val myList = mutableListOf("tuna", "salmon", "shark")
myList.remove("shark")
println(myList)

val school1 = arrayOf("shark", "salmon", "minnow")
println(java.util.Arrays.toString(school1))

val numbers = intArrayOf(1,2,3)
val numbers3 = intArrayOf(4,5,6)
val foo2 = numbers3 + numbers
println(foo2[5])

val numbers1 = intArrayOf(1, 2, 3)
val oceans = listOf("Atlantic", "Pacific")
val oddList = listOf(numbers1, oceans, "salmon")
println(oddList)

val array = Array (5) { it * 2 }
println(java.util.Arrays.toString(array))

val school2 = arrayOf("shark", "salmon", "minnow")
for (element in school2) {
    print(element + " ")
}

for ((index, element) in school2.withIndex()) {
    println("Item at $index is $element\n")
}
for (i in 1..5) print(i);



for (i in 5 downTo 1) print(i);

for (i in 3..6 step 2) print(i)
for (i in 'd'..'g') print (i)

var bubbles = 0
while (bubbles < 50) {
    bubbles++
}
println("$bubbles bubbles in the water\n")

do {
    bubbles--
} while (bubbles > 50)
println("$bubbles bubbles in the water\n")

repeat(2) {
    println("A fish is swimming")
}








