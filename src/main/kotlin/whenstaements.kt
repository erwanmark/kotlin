fun main(args: Array<String>) {


    println("Enter floor number")

    var floor = readLine()!!.toInt()
    when(floor){

        0->print("Go to ground floor")
        1->print("Go to first floor")
        2->print("Go to second floor")
        3->print("Go to third floor")
        3->print("Go to fourth floor")

        else -> print("No additional floor")

    }
}