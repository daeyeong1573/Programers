package com.example.programers.sort

import java.util.*

fun main(){
    val commands = Array<IntArray>(3) { IntArray(3) }
    commands[0] = intArrayOf(2,5,3)
    commands[1] = intArrayOf(4,4,1)
    commands[2] = intArrayOf(1,7,3)
    val array : IntArray = intArrayOf(1, 5, 2, 6, 3, 7, 4)
    print(solution(array, commands).contentToString())
}




fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = IntArray(commands.size)

    for (i in answer.indices){
        var tempArray = array.slice(commands[i][0]-1 until commands[i][1])
        tempArray = tempArray.sorted()
        answer[i] = tempArray[commands[i][2]-1]
    }

    return answer
}