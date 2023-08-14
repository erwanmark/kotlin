package OOP

class car(make:String, model:String, price:Int, cc:Int) {
    init {
        println(" owner1 owns a $make the model is $model while its price is $price with a cc of$cc")

    }
}

fun main(args: Array<String>) {

    var owner1 = car("Subaru", "WRX", 2500000 , 2500)

}