package hmJava3.kotlin.kotlin_koans.Introduction

//Read about extension functions. Then implement extension
// functions Int.r() and Pair.r() and make them convert Int
// and Pair to RationalNumber.

data class RationalNumber(val numerator: Int, val denominator: Int)

fun Int.r(): RationalNumber = RationalNumber(this, 1)

fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(this.first, this.second)

fun main(){

    val a1 = 5
    println(a1.r())

    val a2 = Pair(3,4)
    println(a2.r())

}