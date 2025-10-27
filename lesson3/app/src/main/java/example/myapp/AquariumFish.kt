package example.myapp

abstract class AquariumFish {
    abstract val color: String
}
//class Shark: AquariumFish() {
//    override val color = "grey"
//}
//
//class Plecostomus: AquariumFish() {
//    override val color = "gold"
//}

//interface FishAction  {
//    fun eat()
//}
//class Shark: AquariumFish(), FishAction {
//    override val color = "grey"
//    override fun eat() {
//        println("hunt and eat fish")
//    }
//}
//
//class Plecostomus: AquariumFish(), FishAction {
//    override val color = "gold"
//    override fun eat() {
//        println("eat algae")
//    }
//}


// Interface for fish behavior
interface FishAction {
    fun eat()
}

// Interface for fish color
interface FishColor {
    val color: String
}

// Plecostomus fish implements both interfaces
class Plecostomus : FishAction, FishColor {
    override val color = "gold"
    override fun eat() {
        println("eat algae")
    }
}

// Shark fish implements both interfaces
class Shark : FishAction, FishColor {
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}
