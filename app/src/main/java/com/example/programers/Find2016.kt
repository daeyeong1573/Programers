package com.example.programers

//2016년 요일 구하기

fun main(){
    print(solution(8,31))
}

fun solution(a: Int, b: Int): String {
    var answer = ""
    var result = 0
    //1월1은 금요일, 배열로 요일 지정
    val dw = listOf<String>("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")
    //월 최대 요일 지정
    val m = listOf<Int>(31, 29, 31, 30, 31, 30,31, 31, 30, 31, 30, 31)
    //조건에 안 맞으면 값이 안나오게 설정
    if(a <= 0 || a>12 || b<=0 || b>31){
        return "제대로 입력해 주세요"
    }

    //월의 최대일 만큰 더해서 월 구하기
    //0부터 시작하므로 a값-1
    for(i in 0 until a-1){
        result += m[i]
    }
    //월 구한 수에 일수 더하기
    //위와 같은 이유로 -1
    result += b-1
    //나온수를 7로 나눈 나머지가 요일
    answer = dw[result%7]

    return answer
}
