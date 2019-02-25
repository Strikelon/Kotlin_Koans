package hmJava3.kotlin.kotlin_koans.Conventions

//Implement the function MyDate.rangeTo().
// This allows you to create a range of dates using the following syntax:

//MyDate(2015, 5, 11)..MyDate(2015, 5, 12)

//Note that now the class DateRange implements the standard ClosedRange
// interface and inherits contains method implementation.

operator fun MyDate.rangeTo(other: MyDate) = DateRange2(this, other)

class DateRange2(override val start: MyDate, override val endInclusive: MyDate): ClosedRange<MyDate>

fun checkInRange2(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}

fun main(){

    val date1 = MyDate(1990,5, 3)
    val date2 = MyDate(1995,3,4)

    val date4 = MyDate(1994,4,5)
    val date5 = MyDate(1998,3,3)

    println(checkInRange2(date4, date1, date2))
    println(checkInRange2(date5, date1, date2))

}