package hmJava3.kotlin.kotlin_koans.Introduction

//Default and named arguments help to minimize the number of overloads
// and improve the readability of the function invocation.
// The library function joinToString is declared
// with default values for parameters:

//fun joinToString(
//    separator: String = ", ",
//    prefix: String = "",
//    postfix: String = "",
//    /* ... */
//): String

//It can be called on a collection of Strings.
// Specifying only two arguments make the function joinOptions() return
// the list in a JSON format (e.g., "[a, b, c]")

fun main(){

    val arr = arrayListOf("qw","as","zx","er","df")

    println(joinOptions(arr))

}

fun joinOptions(options: Collection<String>) =
        options.joinToString(prefix = "[", postfix = "]")