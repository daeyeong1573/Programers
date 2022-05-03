package com.example.programers.level1.kakao

fun main(){
    var test = "test234"

    print(solution("23four5six7"))
}

fun solution(s: String): Int {
    var answer: String = s
    var map = HashMap<String,String>()

    //HashMap을 사용하여 문자 별 숫자 대입
    map["zero"] = "0"
    map["one"] = "1"
    map["two"] = "2"
    map["three"] = "3"
    map["four"] = "4"
    map["five"] = "5"
    map["six"] = "6"
    map["seven"] = "7"
    map["eight"] = "8"
    map["nine"] = "9"

    //replace를 활용하여 문자를 숫자로 치환
    for ((key,value ) in map){
       answer = answer.replace(key,value)
    }


    //Int형으로 만들어서 Return
    return answer.toInt()
}