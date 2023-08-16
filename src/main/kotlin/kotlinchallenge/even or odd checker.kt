package kotlinchallenge

fun main(args: Array<String>) {

    println("Enter any number")
    var number:Int = readLine()!!.toInt()

    if (number == null) {
        print("please enter a valid number")
    }
    else{
        var result = if (number % 2 == 0){
            println("$number is even")
        }
        else{
            println("$number is odd")
        }

    }

}
