package com.example.programers

import java.lang.StringBuilder


//시저 암호

fun main(args: Array<String>) {
    println(solution("z X C W", 25))
}

//나의 풀이

fun solution(s: String, n: Int): String {

    if (n in 1..25) {
        var temp = StringBuilder(s)
        var n = n % 26
        for (i in temp.indices) {
            if (temp[i].isLowerCase()) { //소문자면
                temp[i] = (((temp[i] - 'a' + n) % 26 + 'a'.toInt()).toChar()) //핵심 공식
            } else if (temp[i].isUpperCase()) { //대문자면
                temp[i] = (((temp[i] - 'A' + n) % 26 + 'A'.toInt()).toChar()) //핵심 공식
            } else if (temp[i] == ' ') { //받은 문자가 공백일 때
                continue
            }
        }

        return temp.toString()
    }

    return ""

}

//다른사람의 풀이
fun solution2(s: String, n: Int): String =
    s.toList().joinToString(separator = "") {
        when (it) {
            in 'A'..'Z' -> ('A'.toInt() + (it.toInt() - 'A'.toInt() + n) % ('Z' - 'A' + 1)).toChar()
            in 'a'..'z' -> ('a'.toInt() + (it.toInt() - 'a'.toInt() + n) % ('z' - 'a' + 1)).toChar()
            else -> it
        }.toString()
    }


