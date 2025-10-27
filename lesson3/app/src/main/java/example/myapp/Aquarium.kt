//////package example.myapp
//////
//////class Aquarium (var length: Int = 100, var width: Int = 20, var height: Int = 40) {
//////    init {
//////        println("aquarium initializing")
//////    }
//////    init {
//////        // 1 liter = 1000 cm^3
//////        println("Volume: ${width * length * height / 1000} liters")
//////    }
//////
//////class Aquarium(
//////    val width: Int = 100,
//////    val length: Int = 200,
//////    var height: Int = 40
//////) {
//////    fun printSize() {
//////        println(
//////            "Width: $width cm " +
//////                    "Length: $length cm " +
//////                    "Height: $height cm "
//////        )
//////    }
//////}
//////class Aquarium1(length: Int = 100, width: Int = 20, height: Int = 40) {
//////    // Dimensions in cm
//////    var length: Int = length
//////    var width: Int = width
//////    var height: Int = height
//////
//////}}
////package example.myapp
////
////class Aquarium(
////    var length: Int = 100,
////    var width: Int = 20,
////    var height: Int = 40
////) {
////    // init block #1
////    init {
////        println("aquarium initializing")
////    }
////
////    // init block #2
////    init {
////        // 1 liter = 1000 cm^3
////        println("Volume: ${width * length * height / 1000} liters")
////    }
////
////    fun printSize() {
////        println(
////            "Width: $width cm " +
////                    "Length: $length cm " +
////                    "Height: $height cm "
////        )
////    }
////}
//
//package example.myapp
//
//class Aquarium(
//    var length: Int = 100,
//    var width: Int = 20,
//    var height: Int = 40
//) {
//    // init block #1
//    init {
//        println("aquarium initializing")
//    }
//
////    // init block #2
////    init {
////        println("Volume: ${width * length * height / 1000} liters")
////    }
//var volume: Int
//    get() = width * height * length / 1000  // liters
//    set(value) {
//        height = (value * 1000) / (width * length) // adjust height
//    }
//
//    // Secondary constructor for fish
//    constructor(numberOfFish: Int) : this() {
//        val tank = numberOfFish * 2000 * 1.1
//        height = (tank / (length * width)).toInt()
//    }
//
//    fun printSize() {
//        println(
//            "Width: $width cm " +
//                    "Length: $length cm " +
//                    "Height: $height cm "
//        )
//        println("Volume: $volume liters")
//    }
//}
package example.myapp

//class Aquarium(
//    var length: Int = 100,
//    var width: Int = 20,
//    var height: Int = 40
//) {
//    init {
//        println("aquarium initializing")
//    }
//
//    // Volume: public getter, private setter
//    var volume: Int
//        get() = width * height * length / 1000  // liters
//        private set(value) {
//            height = (value * 1000) / (width * length)
//        }
//
//    constructor(numberOfFish: Int) : this() {
//        val tank = numberOfFish * 2000 * 1.1
//        height = (tank / (length * width)).toInt()
//    }
//
//    fun printSize() {
//        println(
//            "Width: $width cm " +
//                    "Length: $length cm " +
//                    "Height: $height cm "
//        )
//        println("Volume: $volume liters")
//    }
//}
//open class Aquarium(
//    open var length: Int = 100,
//    open var width: Int = 20,
//    open var height: Int = 40
//) {
//    init {
//        println("aquarium initializing")
//    }
//
//    // Volume: getter + setter
//    open var volume: Int
//        get() = width * height * length / 1000
//        set(value) {
//            height = (value * 1000) / (width * length)
//        }
//
//    // New open property: shape
//    open val shape = "rectangle"
//
//    // New open property: water (90% of volume)
//    open var water: Double = 0.0
//        get() = volume * 0.9
//
//    // Secondary constructor
//    constructor(numberOfFish: Int) : this() {
//        val tank = numberOfFish * 2000 * 1.1
//        height = (tank / (length * width)).toInt()
//    }
//
//    open fun printSize() {
//        println(shape)
//        println(
//            "Width: $width cm " +
//                    "Length: $length cm " +
//                    "Height: $height cm "
//        )
//        println("Volume: $volume liters Water: $water liters (${water / volume * 100.0}% full)")
//    }
//}

import java.lang.Math.PI

// Aquarium class
open class Aquarium(
    open var length: Int = 100,
    open var width: Int = 20,
    open var height: Int = 40
) {
    init {
        println("aquarium initializing")
    }

    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open val shape = "rectangle"

    open var water: Double = 0.0
        get() = volume * 0.9

    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    open fun printSize() {
        println(shape)
        println("Width: $width cm Length: $length cm Height: $height cm")
        println("Volume: $volume liters Water: $water liters (${water / volume * 100.0}% full)")
    }
}

// TowerTank subclass
class TowerTank(
    override var height: Int,
    var diameter: Int
) : Aquarium(height = height, width = diameter, length = diameter) {

    // Cylinder volume calculation
    override var volume: Int
        get() = (width / 2 * length / 2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width / 2 * length / 2)).toInt()
        }

    override var water = volume * 0.8
    override val shape = "cylinder"
}