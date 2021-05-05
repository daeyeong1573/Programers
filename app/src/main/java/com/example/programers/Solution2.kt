package com.example.programers

import android.os.Build
import androidx.annotation.RequiresApi

// 문제
// i am groot가 있으면 모두 대문자로 바꾸고 [A1R1T1G1I1M1O2]이런식으로 알파벳의 빈도수 구하기

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    var str: String = "i am groot".toUpperCase().replace(" ","")
    var tmp  = str.filter { it != ' ' }.map { it.toUpperCase() }.sorted().toMutableList()
    var mp = hashMapOf<Char,Int>()

    for(temp in tmp){
        mp[temp] = mp.getOrDefault(temp,0)+1
    }

    for(key in mp.keys) {
        print("$key"+mp.get(key))
    }

}














