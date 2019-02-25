package hmJava3.kotlin.kotlin_koans.Conventions

//In Kotlin in checks are translated to
// the corresponding contains calls:

//val list = listOf("a", "b")
//"a" in list  // list.contains("a")
//"a" !in list // !list.contains("a")

//Read about ranges. Add a method fun contains(d: MyDate)
// to the class DateRange to allow in checks with a range of dates.

class DateRange(val start: MyDate, val endInclusive: MyDate){

    operator fun contains(d: MyDate) = (start <= d && d<= endInclusive)

}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}

fun main(){

    val date1 = MyDate(1990,5, 3)
    val date2 = MyDate(1995,3,4)

    val date4 = MyDate(1994,4,5)
    val date5 = MyDate(1998,3,3)

    println(checkInRange(date4, date1, date2))
    println(checkInRange(date5, date1, date2))

}