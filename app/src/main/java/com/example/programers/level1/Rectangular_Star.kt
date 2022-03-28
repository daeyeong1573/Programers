package com.example.programers

//직사각형 별찍기

fun main() {
    //수 입력
    val input = readLine()!!.split(" ").map { it.toInt() }

    for (i in 0 until input[1]) {
        for (i in 0 until input[0]) {
            print("*")
        }
        println("")
    }
}
