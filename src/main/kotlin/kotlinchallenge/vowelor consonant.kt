package kotlinchallenge


fun main(args: Array<String>) {

    println("Enter any Alphabet:")

    val letter = readLine()!!.trim()
    if (letter.isBlank()) {
        println("Empty submission try again")
    } else {
        var chara = letter[0]

        var result = if (chara in "aeiou") {
            println("is a vowel")
        } else {
            println("consonant")
        }
    }
}


