package com.example.programers.level1.kakao

import com.example.programers.level1.solution


fun main() {
    print(
        solution(
            intArrayOf(44, 1, 0, 0, 31, 25),
            intArrayOf(31, 10, 45, 1, 6, 19)
        ).contentToString()
    )
}

fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
    var answer: IntArray = intArrayOf()
    var cnt = 0
    //최소 등수 구하기
    val union = lottos + win_nums
    val check = union.groupBy { it }.filter { it.value.size > 1 }.flatMap { it.value }.distinct()
    //중복값에 0이 있으면 -1
    val checkSize = if (check.contains(0)) check.size - 1 else check.size
    answer += checkLotto(checkSize)

    for (i in lottos) if (i == 0) cnt++
    answer += checkLotto(checkSize + cnt)

    return answer.sortedArray()
}

//등수 구하는 함수수
fun checkLotto(cnt: Int): Int {

    return when (cnt) {
        1 -> 6
        2 -> 5
        3 -> 4
        4 -> 3
        5 -> 2
        6 -> 1
        else -> 6
    }


}