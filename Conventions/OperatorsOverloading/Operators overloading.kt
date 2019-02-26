package hmJava3.kotlin.kotlin_koans.Conventions.OperatorsOverloading

//Implement a kind of date arithmetic. Support adding years, weeks and days to a date.
// You could be able to write the code like this: date + YEAR * 2 + WEEK * 3 + DAY * 15

//At first, add an extension function 'plus()' to MyDate, taking a TimeInterval as an argument.
// Use an utility function MyDate.addTimeIntervals() declared in DateUtil.kt
//
//Then, try to support adding several time intervals to a date. You may need an extra class.

data class MyDate(val year:Int, val month:Int, val dayOfMonth:Int)

enum class TimeInterval{
    DAY, WEEK, YEAR
}

class TimeIntervalNumber(val timeInterval: TimeInterval, val number:Int)

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate =
        this.addTimeIntervals(timeInterval, 1)

operator fun MyDate.plus(timeIntervalNumber: TimeIntervalNumber): MyDate =
        this.addTimeIntervals(timeIntervalNumber.timeInterval, timeIntervalNumber.number)

operator fun TimeInterval.times(number: Int):TimeIntervalNumber =
        TimeIntervalNumber(this, number)

fun task1(today: MyDate): MyDate {
    return today + TimeInterval.YEAR + TimeInterval.WEEK
}

fun task2(today: MyDate): MyDate {
    return today + TimeInterval.YEAR * 2 + TimeInterval.WEEK * 3 + TimeInterval.DAY * 5
}

fun main(){

    val date1 = MyDate(2018,2,1)
    println(task1(date1))

    val date2 = MyDate(1900, 1,1)
    println(task2(date2))

}