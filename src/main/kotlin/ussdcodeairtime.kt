fun main(args: Array<String>) {


    println("Enter USSD code")

    var USSD = readLine()!!.toInt()
    when(USSD){

        0->print("Amazing bundle offers")
        1->print("Amazing minutes offers")
        2->print("Buy daily bundles ")
        3->print("Weekly bundles ")
        4->print("Dabo credo offers")
        5->print("Monthly offers")
        6->print("Check data bundles balance")
        7->print("Unsubscribe to all monthly bundles")

        else-> print("Invalid input")
    }


}