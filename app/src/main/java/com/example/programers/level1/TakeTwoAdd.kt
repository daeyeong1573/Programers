package com.example.programers.level1

fun main(){
    print(solution(intArrayOf(2,1,3,4,1)).contentToString())
}

fun solution(numbers: IntArray): IntArray {
    var answer: IntArray = intArrayOf()

    for( i in numbers.indices){
        for (j in i+1 until numbers.size){
            answer += numbers[i] + numbers[j]
        }
    }


    return answer.distinct().sorted().toIntArray()
}