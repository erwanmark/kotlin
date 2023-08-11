fun main(args: Array<String>) {

    println("Enter first number")
    var num1:Int = readLine()!!.toInt()
    println("Enter second num")
    var num2:Int = readLine()!!.toInt()

    for (x in 1..100){
        if (x % 3==0 && x % 5==0){
            println("$x is FizzBuzz")
        }
        if (x % 3 ==0){
            println("$x is Fizz")
        }
        if (x % 5 ==0){
            println("$x is Buzz")
        }
        else {
            println(x)
        }
    }
}