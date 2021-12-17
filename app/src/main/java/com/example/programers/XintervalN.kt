package com.example.programers

//x만큼 간격이 있는 n개의 숫자

fun main(){
    var input = readLine()!!.split(' ').map { it.toInt() }
    solution(input[0],input[1]).forEach { print(it) }
}

fun solution(x: Int, n: Int): Array<Long?> {
    var answer = arrayOfNulls<Long>(n)
    var temp : Long = 0
    for (i in 0 until n){
        temp += x
        answer[i] = temp
    }
    return answer
}