package com.example.programers.level1

fun main(){
    print(solution("Zbcdefg"))
}

fun solution(s : String) : String = s.toCharArray().sortedDescending().joinToString("")