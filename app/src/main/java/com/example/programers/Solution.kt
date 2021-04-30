package com.example.programers
class Solution {
    fun main(){
        print(solution(a = readLine()!!.toInt(),b = readLine()!!.toInt()))
    }
    fun solution(a: Int, b: Int): Long {
        var t1 = a
        var t2 = b
        var answer: Long = 0
        while (true){
            if(t1<t2){
                answer = answer + t1
                t1++
                if (t1 > t2){
                    break;
                }
            }
            else{
                answer = answer + t1
                t1--
                if (t1 < t2){
                    break;
                }
            }
        }
        return answer
    }
}