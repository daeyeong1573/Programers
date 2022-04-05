package com.example.programers.level1

fun main(){
    print(solution(intArrayOf(5,9,7,10),5).contentToString())
}

//나의 풀이
fun solution(arr: IntArray, divisor: Int): IntArray {
    var list = ArrayList<Int>() // 나누어 떨어지는수 저장 하는 리스트
    //리스트에 데이터 추가
    for (i in arr.indices) if (arr[i] % divisor == 0) list.add(arr[i])
    //리스트 -> 배열로 변경
    return if (list.size == 0 ) intArrayOf(-1) else list.sorted().toIntArray()
}

//다른 사람의 풀이
fun solution2(arr: IntArray, divisor: Int): IntArray {
    var answer = intArrayOf()

    //IntArray에 plus + 연산자를 재정의한 함수가 있어 answer += it 이 가능하다.
    arr.forEach { if (it % divisor == 0) answer += it }
    answer.sort()

    if (answer.size == 0) answer += -1

    return answer
}