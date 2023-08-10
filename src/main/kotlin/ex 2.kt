fun main(args: Array<String>) {

    println("Enter your marks")
    var marks:Int = readLine()!!.toInt()


   if (marks <= 29){
        print("grade= E")
    }

    else if (marks <=39){
        print("grade= D")
    }

    else if (marks <= 59){
        print("grade= B")
    }

    else if (marks <= 70){
        print("grade= B+")
    }

    else if (marks <= 80) {
       print("grade= A-")
   }

   else if (marks <= 100){
        print("grade= A")
    }

    else if (marks >100){
        print("Sorry invalid marks please try again")
    }

}
