package com.example.programers.level2

fun main() {

}


fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    // 정답이 될 행렬은 모든원소 0으로 초기화
    val answer = Array<IntArray>(arr1.size) { IntArray(arr2.first().size) { 0 } }

// 3번 loop
    for (row in arr1.indices) {
        // 2번 loop
        for (col2 in arr2.first().indices) {
            // 1번 loop
            for (col in arr1[row].indices) {
                answer[row][col2] += arr1[row][col] * arr2[col][col2]
            }
        }
    }
    return answer
}