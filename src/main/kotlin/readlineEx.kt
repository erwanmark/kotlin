fun main(args: Array<String>) {
    println("Enter your Age")
    var myage:Int = readLine()!!.toInt()

     if (myage >=18) {
         print("welcome to the club")
     }else{

         print("sorry cant admit an underage")
     }
}