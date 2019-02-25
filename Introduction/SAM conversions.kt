package hmJava3.kotlin.kotlin_koans.Introduction

import java.util.*

//When an object implements a SAM interface (one with a Single Abstract Method)
// , you can pass a lambda instead. Read more about SAM-conversions.
//
//In the previous example change an object expression to a lambda.

fun getList2(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, { x, y -> y - x })
    return arrayList
}

fun main(){

    println(getList2())

}