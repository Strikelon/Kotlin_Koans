package hmJava3.kotlin.kotlin_koans.Conventions.ForLoop

import java.util.*

enum class TimeInterval{
    DAY, WEEK, YEAR
}

fun MyDate.addTimeIntervals(timeInterval: TimeInterval, number: Int): MyDate{

    val c = Calendar.getInstance()
    c.set(year, month, dayOfMonth)
    when(timeInterval){

        TimeInterval.DAY -> c.add(Calendar.DAY_OF_MONTH, number)
        TimeInterval.WEEK -> c.add(Calendar.WEEK_OF_MONTH, number)
        TimeInterval.YEAR -> c.add(Calendar.YEAR, number)

    }

    return MyDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE))

}

fun MyDate.nextDay() = addTimeIntervals(TimeInterval.DAY, 1)