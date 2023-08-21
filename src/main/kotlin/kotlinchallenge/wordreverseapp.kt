package kotlinchallenge

fun main(args: Array<String>) {
    println("Enter any word")
    var words = readLine() ?:""

    var wordsplit = words.split("")
    var wordreverse = wordsplit.reversed()

    println(wordreverse.joinToString(""))

}