package com.example.programers

//배열의 평균값 구하기

fun main(){
    val test = IntArray(8)
    for (i in test.indices){
        test[i] = 5
    }
    print(solution(test))
}


//나의 풀이
fun solution(arr: IntArray): Double {
    var answer = 0

    for (i in arr.indices){
        answer += arr[i]
    }

    return answer/arr.size.toDouble()
}

//다른 사람의 풀이 간결
fun otherSolution(arr: IntArray): Double {
    return arr.average()
}
