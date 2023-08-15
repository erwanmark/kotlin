fun main(args: Array<String>) {

    println("Enter first number")
    var num1 = readLine()!!.toInt()

    println("Enter second num")
    var num2:Int = readLine()!!.toInt()

    printsum(num1,num2)
}


fun printsum(num1: Int, num2: Int) {
    val sum = sumnumbers(num1, num2)
    print(sum)
}
fun sumnumbers(num1:Int , num2:Int):Int {
    return num1 * num2
}