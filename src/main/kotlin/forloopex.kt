fun main(args: Array<String>) {

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