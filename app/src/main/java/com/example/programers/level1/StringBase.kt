package com.example.programers.level1

//Level 1 문자열 다루기
fun main() {
    print(solution("123a56"))
}

fun solution(s: String): Boolean {
    return (s.length == 4 || s.length == 6) && s.all { it.isDigit() }
}
