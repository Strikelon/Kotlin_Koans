package hmJava3.kotlin.kotlin_koans.Collections.Sum

/*
Implement Customer.getTotalOrderPrice() using sum or sumBy.

listOf(1, 5, 3).sum() == 9
listOf("a", "b", "cc").sumBy { it.length() } == 4

if you want to sum the double values, use sumByDouble.
 */

// Return the sum of prices of all products that a customer has ordered.
// Note: the customer may order the same product for several times.
fun Customer.getTotalOrderPrice(): Double =
        orders.flatMap { it.products }.sumByDouble { it.price }

fun main(){

    println(customers["Lucas"]?.getTotalOrderPrice())

}