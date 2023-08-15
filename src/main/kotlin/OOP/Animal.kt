package OOP

open class Animal(color:String, legs:String, breed:String, gender:String) {
    fun nameofdog() {

    }

    init {
        println("clor is $color and it has $legs of $breed and its a $gender")
    }
}

class Dog(name:String) :Animal(color = "Black", legs = "4legs", breed = "Pitbull", gender = "male"){

}

fun nameoftheDog(){
    println("Boscow")
}
fun main(args: Array<String>) {
    var dog1= Dog("Boscow")
     dog1.nameofdog()

}