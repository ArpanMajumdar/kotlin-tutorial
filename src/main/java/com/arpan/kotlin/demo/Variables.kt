package com.arpan.kotlin.demo


fun main() {
    // Read only variable: val
    val question: String = "Life, the universe and everything"
    println("$question ?")

    // This throws error
    //    question = "another question"

    // Mutable variable: var
    var answer = 0
    println(answer)
    answer = 10
    println(answer)

    // Local type inference

    val greeting = "Hi !"
    var number = 0

}

