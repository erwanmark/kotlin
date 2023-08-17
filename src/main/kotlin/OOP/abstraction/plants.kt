package OOP.abstraction

abstract class plants(var name:String) {
    //abstract method
    abstract fun grow()
    // general method
    fun describe() {
        print("$name of the plant")
    }

    abstract fun typeofplant()
}
class tree(name: String) : plants(name) {
    override fun grow() {
        println("$name is mahogany")
    }

    override fun typeofplant() {
        println("$name is mahogany")
    }
}
class flower (name: String) : plants(name){
    override fun grow() {
        println("$name is rose")
    }

    override fun typeofplant() {
        println("$name is a rose ")
    }
}
fun main(args: Array<String>) {

    val creature1: plants = tree(name = "Mahogany")
    val creature2: plants = flower(name = "rose")

    creature1.describe()
    creature1.typeofplant()

    creature2.describe()
    creature2.typeofplant()
}
