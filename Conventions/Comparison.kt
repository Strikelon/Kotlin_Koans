package hmJava3.kotlin.kotlin_koans.Conventions

//Read about operator overloading to learn how different conventions for operations like ==, <, + work in Kotlin. Add the function compareTo to the class MyDate to make it comparable. After that the code below date1 < date2 will start to compile.
//
//In Kotlin when you override a member, the modifier override is mandatory.

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)
    : Comparable<MyDate> {

    override fun compareTo(other: MyDate): Int {
        if(this.year.compareTo(other.year)<0){
            return -1
        }else if(this.year.compareTo(other.year)>0){
            return 1
        }else{
            if(this.month.compareTo(other.month)>0){
                return 1
            }else if(this.month.compareTo(other.month)<0){
                return -1
            }else{
                if(this.dayOfMonth.compareTo(other.dayOfMonth)>0){
                    return 1
                }else if(this.dayOfMonth.compareTo(other.dayOfMonth)<0){
                    return -1
                }else{
                    return 0
                }
            }
        }
    }

}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2

fun main(){

    val date1 = MyDate(2015,4,23)
    val date2 = MyDate(2014, 3,12)

    println(date1.compareTo(date2))

}