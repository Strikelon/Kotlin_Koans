package hmJava3.kotlin.kotlin_koans.Conventions.DestructuringDeclarations

//Read about destructuring declarations and make the following code compile by adding one word.

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

fun isLeapDay(date: MyDate): Boolean {

    val (year, month, dayOfMonth) = date

    // 29 February of a leap year
    return year % 4 == 0 && month == 2 && dayOfMonth == 29
}

fun main(){

    val date = MyDate(2016,2,29)

    println(isLeapDay(date))

}