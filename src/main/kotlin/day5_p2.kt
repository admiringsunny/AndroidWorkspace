fun main() {
//    val fruits = listOf("apple", "banana", "orange", "grape")
//
//    println("First fruit: ${fruits[0]}")
//    println("Last fruit: ${fruits.last()}")
//    for (fruit in fruits) {
//        println(fruit)
//    }
//    val filtered = fruits.filter { it.contains("p") }
//    println("Filtered list: $filtered")

//    1. Immutable Collection
//    List
//    Set
//    Map


    println("------")
    println("Immutable List")
    val immutableList = listOf("Ram", "Raj", "Sita")
    println(immutableList[0])
    for (item in immutableList) {
        println(item)
    }

    println("------")
    println("Immutable Set")
    val immutableSet = setOf(6, 9, 9, 0, 0)
    for (item in immutableSet) {
        println(item)
    }

    println("------")
    println("Immutable Map")
    val immutableMap = mapOf(1 to "Ram", 2 to "Raj", 3 to "Sita")

    for (key in immutableMap.keys) {
        println(immutableMap[key])
    }
    //OR
    for (value in immutableMap.values) {
        println(value)
    }
}