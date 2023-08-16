package OOP.polymorphism

// super class
open class Building (var type: String) {
    open fun openDoor() {
        println("$type door is opening")
    }
}

//sub class
class house(type: String) :Building(type) {
    override fun openDoor() {
        println("$type house door is opening")
    }
}

class Apartment(type: String) : Building(type) {
    override fun openDoor() {
        println("$type apartment door is opening")
    }
}
class Mansion(type: String): Building(type){
    override fun openDoor() {
        println("$type mansion door is opening")
    }
}
fun main(args: Array<String>) {
    var building1: Building = house(type = "The bungalow")
    building1.openDoor()

    var building2: Building = Apartment(type = "Studio")
    building2.openDoor()


    var building3: Building = Mansion(type = "Residential")
    building3.openDoor()
}

