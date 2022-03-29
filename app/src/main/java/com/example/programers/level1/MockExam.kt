package com.example.programers.level1

fun main() {
    print(solution(intArrayOf(1, 2, 3, 4, 5)).contentToString())
}

fun solution(answers: IntArray): IntArray {
    var score = arrayOf(0, 0, 0)
    var one = arrayOf(1, 2, 3, 4, 5)
    var two = arrayOf(2, 1, 2, 3, 2, 4, 2, 5)
    var three = arrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

    for (i in answers.indices) {
        if (answers[i] == one[i % one.size]) score[0]++
        if (answers[i] == two[i % two.size]) score[1]++
        if (answers[i] == three[i % three.size]) score[2]++
    }
    val max = score[0].coerceAtLeast(score[1].coerceAtLeast(score[2]))

    val list: MutableList<Int> = ArrayList()
    if (max == score[0]) {
        list.add(1)
    }
    if (max == score[1]) {
        list.add(2)
    }
    if (max == score[2]) {
        list.add(3)
    }
    val answer = IntArray(list.size)
    for (i in list.indices) {
        answer[i] = list[i]
    }


    return answer
}