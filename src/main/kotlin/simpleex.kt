import java.util.*

fun main(args: Array<String>) {

    println("Enter year of birth")
    var birthyear:Int = readLine()!!.toInt()

    var currentyear = Calendar.getInstance().get(Calendar.YEAR)

    var age = currentyear - birthyear

    println("your are $age years old")
}