package com.example.programers.level1

fun main() {
    print(solution(5, intArrayOf(2,4), intArrayOf(1,3,5)))
}

fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
    //모든 학생이 체육복이 있다고 가정
    var answer = n
    //여벌옷이 있는 사람은 도난당해도 괜찮으니 전체 도난당한 체육복에서 여벌옷이 있는 학생 번호 제외
    var lostSet = lost.sorted().toSet() - reserve.toSet()
    //set을 사용하여 잃어버린 사람을 제외한 사람을 추가
    val reserveSet = (reserve.toSet() - lost.toSet()) as MutableSet

    for (l in lostSet) {
        when {
            // 이전 사람이 여벌옷이 있는 경우
            l - 1 in reserveSet -> reserveSet.remove(l - 1)
            // 앞 사람이 여벌옷이 있는 경우
            l + 1 in reserveSet -> reserveSet.remove(l + 1)
            // 체육복을 구하지 못한경우 answer 감소
            else -> answer--
        }
    }

    return answer

}
