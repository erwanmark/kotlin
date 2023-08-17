package kotlinchallenge

fun CharactercountOccurence(userinput:String, chartag:Char): Int{
    var charCount = 0
    for(x in userinput){
        if (x == chartag){
            charCount += 1
        }
    }
    return charCount
}
fun main(args: Array<String>) {
    println("Enter any word")
    var datastringInput = readLine() ?: ""
    println("Enter any letter for occurence")
    var mytargetChar = readLine() ?.get(0) ?: ' '
    var charOccurence = CharactercountOccurence(datastringInput, mytargetChar)
    println("$mytargetChar appears $charOccurence number of times")
}