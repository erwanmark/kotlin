package kotlinchallenge

fun main(args: Array<String>) {
    println("Enter Year")
    var year = readLine()!!.toInt()

    var leap = if (year % 4 == 0){
        if (year % 100 == 0){
            year % 400 == 0
        }else true
    } else false

    println("$year is ${if (leap) "leap year"
    else
        
    "Not a leap year"}")
}