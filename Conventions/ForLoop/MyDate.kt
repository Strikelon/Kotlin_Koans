package hmJava3.kotlin.kotlin_koans.Conventions.ForLoop

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate>{

    override fun compareTo(other: MyDate): Int = when{
        year != other.year -> year - other.year
        month != other.month -> month - other.month
        else -> dayOfMonth - other.dayOfMonth
    }

}

operator fun MyDate.rangeTo(other: MyDate) = DateRange(this, other)