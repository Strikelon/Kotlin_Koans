package hmJava3.kotlin.kotlin_koans.Collections.Sort

/*
Implement Shop.getCustomersSortedByNumberOfOrders() using sorted or sortedBy.

listOf("bbb", "a", "cc").sorted() == listOf("a", "bbb", "cc")
listOf("bbb", "a", "cc").sortedBy { it.length } == listOf("a", "cc", "bbb")
 */

// Return a list of customers, sorted by the ascending number of orders they made
fun Shop.getCustomersSortedByNumberOfOrders(): List<Customer> =
        customers.sortedBy { it.orders.size }

fun main(){

    println(shop.getCustomersSortedByNumberOfOrders())

}