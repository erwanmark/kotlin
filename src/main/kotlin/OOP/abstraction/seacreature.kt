package OOP.abstraction

abstract class seacreature(var name:String) {
    //abstract method
    abstract fun makeSound()
    // general method
    fun describe() {
        print("$name is a sea creature")
    }
}

class Fish(name: String) : seacreature(name) {
    override fun makeSound() {
       println("$name makes a blup sound")
    }
}
class Whale (name: String) : seacreature(name){
    override fun makeSound() {
        println("$name makes a glup glup sound")
    }
}
fun main(args: Array<String>) {

    val creature1: seacreature = Fish(name = "Nemo")
    val creature2: seacreature = Whale(name = "Octavio")

    creature1.describe()
    creature1.makeSound()

    creature2.describe()
    creature2.makeSound()
}

