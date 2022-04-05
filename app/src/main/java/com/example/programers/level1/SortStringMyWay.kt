package com.example.programers.level1

fun main(){
    var string = "abcd"
    println(string.substring(1,2))
}

fun solution(strings: Array<String>, n: Int): Array<String> {
    var answer = Array<String>(strings.size){""}
    var map = HashMap<String,String>()

    for (i in strings.indices){
        map.put("${strings[i]}","${strings[i].substring(n-1,n)}")
    }

    map = map.toList().sortedBy { it.second }.toMap() as HashMap

    answer[0] = map.keys.toString()



    return answer
}