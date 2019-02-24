package hmJava3.kotlin.kotlin_koans.Introduction

//Pass a lambda to any function to check
// if the collection contains an even number.
// The function any gets a predicate as an argument and returns
// true if there is at least one element satisfying the predicate.

fun main(){

    val list1: List<Int> = arrayListOf(1,3,5,7)
    val list2: List<Int> = arrayListOf(1,3,4,7)

    println(containsEven(list1))
    println(containsEven(list2))

}

fun containsEven(collection: Collection<Int>): Boolean =
        collection.any { (it % 2) == 0 }