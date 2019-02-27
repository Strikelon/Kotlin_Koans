package hmJava3.kotlin.kotlin_koans.Collections.CompoundTasks

/*

Implement Customer.getMostExpensiveDeliveredProduct() and Shop.getNumberOfTimesProductWasOrdered()
using functions from the Kotlin standard library.

 */

// Return the most expensive product among all delivered products
// (use the Order.isDelivered flag)
fun Customer.getMostExpensiveDeliveredProduct(): Product? {
    val(delivered, undelivered) = orders.partition { it.isDelivered }
    return delivered.flatMap { it.products }.maxBy { it.price }
}

// Return how many times the given product was ordered.
// Note: a customer may order the same product for several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    val products = customers.flatMap { it.orders }.flatMap { it.products }
    return products.count { it == product }
}


fun main(){

    println(customers["Lucas"]?.getMostExpensiveDeliveredProduct())

    println(shop.getNumberOfTimesProductWasOrdered(webStorm))

}