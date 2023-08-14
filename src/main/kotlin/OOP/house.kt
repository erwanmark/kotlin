package OOP

class house(price:Int, bedroom:Int, type:String) {
    init {
        println("owner1 owns a $bedroom the model is $type while its price is $price")
    }

}
fun main(args: Array<String>) {

    var owner1 = house(30000 , 3 , "appartments"  )
}