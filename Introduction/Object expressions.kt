package hmJava3.kotlin.kotlin_koans.Introduction

//Read about object expressions that play the same role in Kotlin
// as anonymous classes in Java.
//
//Add an object expression that provides a comparator to sort
// a list in a descending order using java.util.Collections class.
// In Kotlin you use Kotlin library extensions instead of
// java.util.Collections, but this example is still a good
// demonstration of mixing Kotlin and Java code.

import java.util.*
import kotlin.Comparator

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object: Comparator<Int> {

        override fun compare(o1: Int, o2: Int): Int {
            if(o1 == o2){
                return 0
            }else if(o1 > o2){
                return -1
            }else{
                return 1
            }
        }

    })
    return arrayList
}

fun main(){

    println(getList().joinToString())

}