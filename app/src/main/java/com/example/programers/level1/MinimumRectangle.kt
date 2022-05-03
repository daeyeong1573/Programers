package com.example.programers.level1

fun main() {
    print(solution(arrayOf(intArrayOf(10,7), intArrayOf(12,3), intArrayOf(8,15), intArrayOf(14,7),
        intArrayOf(5,15))))
}

fun solution(sizes: Array<IntArray>): Int {
    var big = 0
    var small = 0
    sizes.forEach {
        if (it[0] > it[1]) {
            if (big < it[0]) big = it[0]
            if (small < it[1]) small = it[1]
        } else {
            if (big < it[1]) big = it[1]
            if (small < it[0]) small = it[0]
        }
    }
    return big * small

}