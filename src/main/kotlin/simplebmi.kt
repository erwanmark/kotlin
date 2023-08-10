fun main(args: Array<String>) {

    println("Enter your height in cm: ")
    var num1: Float = readLine()!!.toFloat()
    println("Enter your weight in kg: ")
    var num2: Float = readLine()!!.toFloat()


    var result = num1 /(num2 /100) *2

    if (result <= 18){
        print("Underweight")
    }
    else if (result <= 29){
        print("Normal weight")
    }
    else if (result <= 34){
        print("overweight")
    }
    else if (result <= 34){
        print("Obese")
    }
    print(result)
}