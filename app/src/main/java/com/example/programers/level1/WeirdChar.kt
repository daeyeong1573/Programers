package com.example.programers.level1

import java.util.*

fun main() {
    println(solution("try hello world"))
}

//나의 풀이
fun solution(n: String): String {
    var answer = ""
    var cnt = 0
    //문자열 길이 만큼 반목
    for (i in n.indices) {
        //공백을 만나면 공백은 카운트를 안치니까 -1을 해줍니다.
        if (n[i] == ' ') cnt = -1
        //cnt 상승량을 2로 나눴을때 몫이 0이면 짝수 이므로 대문자 아니면 소문자
        answer += if (cnt % 2 == 0) n[i].uppercase() else n[i].lowercase()
        //카운트 상승
        cnt++
    }

    return answer
}

//다른 사람의 풀이
fun solution2(s: String) =
    s.split(" ").joinToString(" ") { word ->
        word
            .mapIndexed { index, char ->
                if (index % 2 == 0) char.toUpperCase() else char.toLowerCase()
            }
            .joinToString("")
    }