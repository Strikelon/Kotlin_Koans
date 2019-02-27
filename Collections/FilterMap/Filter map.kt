package hmJava3.kotlin.kotlin_koans.Collections.FilterMap

/*

Implement extension functions Shop.getCitiesCustomersAreFrom() and Shop.getCustomersFrom()
using functions map and filter.

val numbers = listOf(1, -1, 2)
numbers.filter { it > 0 } == listOf(1, 2)
numbers.map { it * it } == listOf(1, 1, 4)

 */

// Return the set of cities the customers are from
fun Shop.getCitiesCustomersAreFrom(): Set<City> =
        customers.map { it.city }.toSet()

// Return a list of the customers who live in the given city
fun Shop.getCustomersFrom(city: City): List<Customer> =
        customers.filter { it.city == city }

fun main(){

    val setOfCities = shop.getCitiesCustomersAreFrom()
    println(setOfCities)

    val customersOfTokyo = shop.getCustomersFrom(City("Tokyo"))
    val customersOfVancouver = shop.getCustomersFrom(City("Vancouver"))

    println(customersOfTokyo)
    println(customersOfVancouver)


}