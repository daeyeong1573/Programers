package com.example.programers.hash

fun main(){

}

inline fun solution(clothes: Array<Array<String>>): Int {
    var answer = 1

    var map = HashMap<String,Int>()

    for (clothe in clothes){
        var type = clothe[1]
        map[type] = map.getOrDefault(type,0)+1
    }

    val it  = map.values.iterator()

    while (it.hasNext()){
        answer *= it.next() + 1
    }

    return answer
}
