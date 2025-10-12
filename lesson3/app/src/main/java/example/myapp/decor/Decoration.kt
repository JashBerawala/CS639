//package example.myapp.decor
//
//
//data class Decoration(val rocks: String)
//
//
//data class Decoration2(val rocks: String, val wood: String, val diver: String)
//
//fun makeDecorations() {
//    val decoration1 = Decoration("granite")
//    println(decoration1)
//
//    val decoration2 = Decoration("slate")
//    println(decoration2)
//
//    val decoration3 = Decoration("slate")
//    println(decoration3)
//
//
//    println(decoration1.equals(decoration2)) // false
//    println(decoration3.equals(decoration2)) // true
//
//
//    val d5 = Decoration2("crystal", "wood", "diver")
//    println(d5)
//
//
//    val (rock, wood, diver) = d5
//    println(rock)
//    println(wood)
//    println(diver)
//
//
//    val (rockOnly, _, diverOnly) = d5
//    println("Rock only: $rockOnly, Diver only: $diverOnly")
//}
//
//// Entry point
//fun main() {
//    makeDecorations()
//}
package example.myapp.decor

// Enum with RGB values
//enum class Color(val rgb: Int) {
//    RED(0xFF0000),
//    GREEN(0x00FF00),
//    BLUE(0x0000FF);
//}
//
//fun main() {
//    val red = Color.RED
//    println(red)              // RED
//    println(red.name)         // RED (string name of the enum constant)
//    println(red.ordinal)      // 0 (position in declaration order)
//    println(red.rgb)          // 16711680 (decimal form of 0xFF0000)
//}
//enum class Direction(val degrees: Int) {
//    NORTH(0),
//    SOUTH(180),
//    EAST(90),
//    WEST(270)
//}
//
//fun main() {
//    println(Direction.EAST.name)     // EAST
//    println(Direction.EAST.ordinal)  // 2
//    println(Direction.EAST.degrees)  // 90
//}
//class Choice {
//    companion object {
//        var name: String = "lyric"
//        fun showDescription(name:String) = println("My favorite $name")
//    }
//}
//
//fun main() {
//    println(Choice.name)
//    Choice.showDescription("pick")
//    Choice.showDescription("selection")
//}

fun main() {
//    // --- Pair Example ---
//    val equipment = "fish net" to "catching fish"
//    println("${equipment.first} used for ${equipment.second}")
//
//    // --- Triple Example ---
//    val numbers = Triple(6, 9, 42)
//    println(numbers.toString())
//    println(numbers.toList())
//
//    // --- Pair inside a Pair ---
//    val equipment2 = ("fish net" to "catching fish") to "equipment"
//    println("${equipment2.first} is ${equipment2.second}")
//    println("${equipment2.first.second}")
//
//    // --- Destructuring Pair ---
//    val (tool, use) = equipment
//    println("$tool is used for $use")
//
//    // --- Destructuring Triple ---
//    val (n1, n2, n3) = numbers
//    println("$n1 $n2 $n3")

//    val list = listOf(1, 5, 3, 4)
//    println(list.sum())
//
//    val list2 = listOf("a", "bbb", "cc")
//    println(list2.sumBy { it.length })
//
//    val list2 = listOf("a", "bbb", "cc")
//    for (s in list2.listIterator()) {
//        print("$s ")
//    }

    val scientific = hashMapOf(
        "guppy" to "poecilia reticulata",
        "catfish" to "corydoras",
        "zebra fish" to "danio rerio"
    )

//    println(scientific.get("guppy"))
//    println(scientific["zebra fish"])
//    println(scientific["swordtail"])

    //println(scientific.getOrDefault("swordtail", "sorry, I don't know"))

//    println(scientific.getOrElse("swordtail") { "sorry, I don't know" })

    val mutableScientific = mutableMapOf("guppy" to "poecilia reticulata")
    mutableScientific["catfish"] = "corydoras"   // Add
    mutableScientific.remove("guppy")            // Remove
    println(mutableScientific)

}
