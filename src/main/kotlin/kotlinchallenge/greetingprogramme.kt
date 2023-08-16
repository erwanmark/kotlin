package kotlinchallenge

fun main(args: Array<String>) {

    println("Enter ur name")
    var name:String = readLine()!!.toString()

    if (name.isBlank()  ) {
        println("please enter a valid name")
    }
    else{
        print("hello $name")
    }

    println("Welcome $name to our website we r glad u joined us")
}
