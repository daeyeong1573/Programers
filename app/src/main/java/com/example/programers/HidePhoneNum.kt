package com.example.programers

import java.lang.StringBuilder

//핸드폰 번호 가리기

fun main(){
    print(solution("01044443333"))
}

fun solution(phone_number: String): String {
    var answer = ""
    //폰번호를 StringBuilder 형식으로 변환
    var temp : StringBuilder = StringBuilder(phone_number)

    //끝에 4자리 전까지만 for문 실행
    for(i in 0 until temp.length-4){
        //StringBuilder에 있는 index위치의 값을 원하는 char값으로 변경 하는 함수 사용 하여 앞에번호를 *처리
        temp.setCharAt(i,'*')
    }

    //temp는 엄연히 StringBuilder 타입이므로 String타입으로 변경
    answer = temp.toString()

    return answer
}