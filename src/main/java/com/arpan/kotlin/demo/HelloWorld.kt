package com.arpan.kotlin.demo

fun main(args: Array<String>){
    val name = if(args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello $name")
    println("Hello ${args.getOrNull(0)}")
}