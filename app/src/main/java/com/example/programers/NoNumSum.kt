package com.example.programers

//없는수 더하기

fun main(){
    val num = intArrayOf(1,2,3,4,6,7,8,0)
    print(solution(num))
}

//나의 풀이
fun solution(numbers: IntArray): Int {
    var answer: Int = -1
    var temp = 0
    for (i in numbers.indices){
        temp += numbers[i]
    }
    answer = 45-temp
    return answer
}

//다른사람 풀이
fun solution2(numbers: IntArray): Int = (0..9).filterNot(numbers::contains).sum()
