package com.example.programers

//나머지가 1이 되는 수 찾기

fun main(){
    print(solution(10))
}

//나의 풀이
fun solution(n: Int): Int {
    var answer: Int = 0
    var temp = 0
    if(n in 3..1000000){
        for (i in 1 until n){
            temp = n%i
            if(temp == 1){
                answer = i
                break
            }
        }
    }
    return answer
}

//다른 사람 풀이
fun solution2(n: Int): Int {
    var answer = 1

    while (n % answer != 1) {
        answer++
    }
    return answer
}