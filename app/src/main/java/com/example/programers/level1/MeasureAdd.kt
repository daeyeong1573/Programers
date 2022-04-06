package com.example.programers.level1

fun main(){
    print(solution(24,27))
}

fun solution(left: Int, right: Int): Int {
    var answer: Int = 0

    for (i in left..right){
        //짝수인지 구별
        if(measureGet(i) % 2 == 0) answer += i
        else answer -= i
    }

    return answer
}

//약수 갯구 구하는 함수
fun measureGet(n : Int) : Int {
    var answer = 0

    for(i in 1..n){
        if (n % i == 0) answer++
    }

   return answer
}