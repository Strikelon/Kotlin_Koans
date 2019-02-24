package hmJava3.kotlin.kotlin_koans.Introduction

//Rewrite the following Java code to Kotlin:

// public class Person {
//     private final String name;
//     private final int age;
//
//     public Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }
//
//     public String getName() {
//         return name;
//     }
//
//     public int getAge() {
//         return age;
//     }
// }

//Then add a modifier data to the resulting class.
// This annotation means the compiler will generate a bunch of useful
// methods in this class: equals/hashCode, toString and some others.
// The getPeople function should start to compile.
//
//Read about classes, properties and data classes.

fun main(){
    println(getPeople().joinToString())
}

data class Person(val name: String, val age: Int)

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}