package com.example.programers.level1.kakao

fun main(){

    print(solution("=.="))

}

fun solution(new_id: String ): String{
    //소문자 알파벳, 숫자, -, _, . 을 제외한 정규식
    val regex = Regex("[^a-z0-9-_.]")
    //대문자 -> 소문자로 변경
    var answer = new_id.lowercase()
    //정규식으로 특수문자 제거
    answer = regex.replace(answer,"")
    //연속된 ..제거
    while (answer.contains("..")){
        answer = answer.replace("..",".")
    }

    //첫번째 마지막이 .이면 .삭제
    if (answer.startsWith(".")) answer = answer.substring(1,answer.length)
    if (answer.endsWith(".")) answer = answer.substring(0,answer.length-1)

    //만약 new_id가 빈문자열 이라면 a를 대입
    if (answer == "") answer = "a"

    //new_id의 길이가 16자 이상이면 15번째 뒤의 문자 삭제, 만약 삭제한 마지막 문자가 "." 이라면 "." 삭제
    if (answer.length >= 16 ){
        answer = answer.substring(0,15)
        if (answer.endsWith(".")){
            answer = answer.substring(0,14)
        }
    }
    //
    while (answer.length < 3){
        answer += answer.substring(answer.length-1,answer.length)
    }


    return answer
}