package com.example.programers.level1

fun main() {
    print(solution(1, 20, 4))
}

//나의 풀이
fun solution(price: Int, money: Int, count: Int): Long {
    var sum = priceSum(price, count)

    return if (money > sum) 0 else sum.minus(money)
}

//요금 총합 구하기
fun priceSum(price: Int, count: Int): Long {
    var sum: Long = 0
    for (i in 1..count) sum += price * i
    return sum
}

//다른사람의 풀이
fun solution2(price: Int, money: Int, count: Int): Long =
    (1..count).map { it * price.toLong() }.sum().let { if (money > it) 0 else it - money }