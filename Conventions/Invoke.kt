package hmJava3.kotlin.kotlin_koans.Conventions

//Objects with invoke() method can be invoked as a function.

//You can add invoke extension for any class, but it's better not to overuse it:

//fun Int.invoke() { println(this) }
//
//1() //huh?..

//Implement the function Invokable.invoke() so it would count a number of invocations.

class Invokable {
    var numberOfInvocations: Int = 0
        private set
    operator fun invoke(): Invokable {
        numberOfInvocations++
        return this
    }
}

fun invokeTwice(invokable: Invokable) = invokable()()

fun main(){

    var inv = Invokable()

    println(inv.numberOfInvocations)

    invokeTwice(inv)

    println(inv.numberOfInvocations)

}

