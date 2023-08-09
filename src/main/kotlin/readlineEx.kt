fun main(args: Array<String>) {
    println("Enter your Age")
    var myage:Int = readLine()!!.toInt()

     if (myage >=18) {
         print("welcome to the club")
     }else{

         print("sorry cant admit an underage")
     }
}
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/erwanmark/kotlinweek1.git
git push -u origin main