package com.example.programers

//문제 설명
//양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고,
// 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

fun main(){
    print(solution(13))
}


//나의 풀이
fun solution(x: Int): Boolean {
    if( x < 1 || x > 10000){
        false
    }
    var answer = true
    //48을 하는 이유는 sumby는 각 문자의 아스키 코드 값을 더하는 것이기 때문에 0의 아스키 코드 값이 48을 빼서 더해준다.
    val temp = x.toString().sumBy { it.toInt() - 48 }

    if(x%temp != 0){
        answer = false
    }

    return answer
}

// 다른 사람의 풀이
fun solution2(x: Int): Boolean {
    return x % x.toString().fold(0){acc, c -> acc + c.toInt() - 48} == 0
}
