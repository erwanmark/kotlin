package kotlinchallenge

fun main(args: Array<String>) {

    println("Enter first number")
    var num1:Int = readLine()!!.toInt()
    println("Enter second num")
    var num2:Int = readLine()!!.toInt()

    for (x in 100..200){
        if (x % 3==0 && x % 5==0){
            println("$x is BeastMode")
        }
        if (x % 3 ==0){
            println("$x is Mode")
        }
        if (x % 5 ==0){
            println("$x is Beast")
        }
        else {
            println(x)
        }
    }
}