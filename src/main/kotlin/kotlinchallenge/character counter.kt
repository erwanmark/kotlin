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

    var datastringInput = "bragatoshious ferotious"
    var mytargetChar = 'o'
    var charOccurence = CharactercountOccurence(datastringInput, mytargetChar)
    println("$mytargetChar appears $charOccurence number of times")
}