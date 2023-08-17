package OOP.encapsulation

class people(private val name:String, private val age:Int) {

    fun getpersoninfo(): String {
        return "Name:$name, Age:$age"
    }
}

fun main(args: Array<String>) {
    val person1 = people( name = "Bazu", age = 25)
    println(person1.getpersoninfo())
}