package kotlinchallenge

fun  main(args: Array<String>) {

    println("Enter first number")
    var num1:Int = readLine()!!.toInt()
    println("Enter second number")
    var num2:Int = readLine()!!.toInt()
    main(num1,num2)

}
fun sumEvenNumbers(start: Int, end: Int): Int {
    if (start > end) {
        return 0
    }

    return if (start % 2 == 0) {
        start + sumEvenNumbers(start + 2, end)
    } else {
        sumEvenNumbers(start + 1, end)
    }
}

fun main(num1:Int, num2:Int) {

    val sum = sumEvenNumbers(num1, num2)
    println("Sum of even numbers from $num1 to $num2: $sum")
}


