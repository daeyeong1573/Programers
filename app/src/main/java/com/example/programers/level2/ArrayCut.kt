package com.example.programers.level2

import kotlin.math.max

fun main(){

}

fun solution(n: Int, left: Long, right: Long): IntArray {
    //index/n 과 index%n 중에서 최댓값이 배열의 값이 되므로 아래처럼 정리 할 수 있다.
    return (left..right).map { (max(it/n,it%n)+1).toInt() }.toIntArray()
}