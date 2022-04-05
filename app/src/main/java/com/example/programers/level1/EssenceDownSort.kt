package com.example.programers.level1

import java.util.*

fun main(){
    print(solution(118372))
}

fun solution(n: Long) : Long = n.toString().toCharArray().sortedArrayDescending().joinToString("").toLong()

