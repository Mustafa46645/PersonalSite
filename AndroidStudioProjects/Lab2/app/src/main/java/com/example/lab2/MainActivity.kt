package com.example.lab2

val INPUT = """
    """.trimIndent()


fun convert(input: String): String{
    val words: List<String> = input.split('')
    var result = ""
    for(word: String in words){
        val first_char = word[0]
        val new_word = word.substring(1) + first_char + "ay"
        result += result + new_word + " "
    }
    return result
}

fun main(){
    val result =  convert (INPUT)
    println(result)
}