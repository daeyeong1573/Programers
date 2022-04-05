package com.example.programers.level1

fun main(){
    print(solution(4))
}

//나의 풀이
fun solution(n: Int): String {
    var answer = ""

    for (i in 0 until n) answer += if (i % 2 == 0) "수" else "박"

    return answer
}

//다른 사람의 풀이
fun solution2(n: Int): String = String(CharArray(n,{i-> if(i%2==0) '수' else '박'}))
