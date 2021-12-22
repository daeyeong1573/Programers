package com.example.programers


//콜라츠 추측

fun main(){
    print(solution(626331))
}

//나의 풀이
fun solution(num: Int): Int {
    var answer = 0
    var temp : Long = num.toLong()

    while(answer < 500 && temp > 1){
        answer++
        temp = if(temp %2 == 0L) temp / 2L else temp * 3 + 1
    }

    return  if(answer >= 500) -1 else answer
}

//다른사람 풀이
fun solution2(num: Int): Int = collatzAlgorithm(num.toLong(),0)

tailrec fun collatzAlgorithm(n:Long, c:Int):Int =
    when{
        c > 500 -> -1
        n == 1L -> c
        else -> collatzAlgorithm(if( n%2 == 0L ) n/2 else (n*3)+1, c+1)
    }