/**

 Interview Questions Till What we have read


 Kotlin Fundamentals
 1. What is Kotlin?
 Kotlin is a statically typed, general-purpose programming language developed by JetBrains for the Java Virtual Machine (JVM). It is designed to be fully interoperable with Java while offering modern language features.

 2. What are the day20260924.main features of Kotlin?
 Statically typed: means the type of every variable and expression is known at compile-time, does not require to explicitly specify the type of variable

 Data Classes: which lead to auto-generation of boilerplate like equals, hashCode, toString, getters/setters and much more.

 Concise: It drastically reduces the extra code written in other object-oriented programming languages.

 Null Safety: It provides the safety from most annoying and irritating NullPointerExceptions by supporting nullability as part of its system. Every variable in Kotlin is non-null by default.

 Interoperable with Java: Kotlin runs on Java Virtual Machine(JVM) so it is totally interoperable with java. We can easily access java code from Kotlin and Kotlin code from Java.

 Functional and Object Oriented Capabilities: Kotlin has a rich set of many useful methods which including, higher-order functions, lambda expressions, operator overloading, lazy evaluation and much more.

 Smart Cast: It explicitly typecasts the immutable values and inserts the value in its safe cast automatically. If we try to access a nullable type of String ( String? = "BYE") without a safe cast, it will generate a compile error.

 Fast Compilation time: It has higher performance and a fast compilation time.



 3. What are the advantages of Kotlin over Java?
 4. Is Kotlin a statically typed language?
 5. What is the difference between Kotlin and Java?  // <----
 6. What is the .kt file extension?  // <----
 7. What is the day20260924.main() function in Kotlin?
 8. How do you write a comment in Kotlin?
 9. What is type inference in Kotlin?
 10. Is semicolon ; mandatory in Kotlin?


 Variables and Data Types
 11. What is the difference between val and var?
 12. Can a val variable be changed after initialization?
 13. What are the basic data types in Kotlin?
 14. What is the difference between Int, Long, Float, and Double?
 15. What is the Boolean data type?
 16. How do you declare a String variable?
 17. What is type inference?
 Example:
 val name = "Ravi"
 var age = 20
 18. What happens if you try to assign a new value to a val?
 19. Can the data type of a var change after initialization?
 20. What is type conversion in Kotlin?


 3. Operators
 21. What are arithmetic operators in Kotlin?
 22. What are comparison operators?
 23. What are logical operators?
 24. What is the difference between == and ===? // <----
 25. What does the % operator do?
 26. What is the difference between ++i and i++?
 27. What are assignment operators?


 4. Conditional Statements
 28. What is an if statement?
 29. How is if different in Kotlin compared with Java?
 30. Can if return a value in Kotlin?
 31. What is an if-else expression?
 32. What is the when expression?
 33. Why is when commonly used instead of multiple if-else statements?
 34. Can when return a value?
 Example:
 val result = when (marks) {
 in 90..100 -> "A"
 in 75..89 -> "B"
 in 50..74 -> "C"
 else -> "Fail"
 }


 Loops
 35. What types of loops are available in Kotlin?
 36. How do you write a for loop?
 37. What is the difference between .. and until?  // <----
 38. What does downTo do?
 39. What does step do?
 40. What is a while loop?
 41. What is a do-while loop?
 42. What is the difference between while and do-while?
 43. What are break and continue?
 Example:
 for (i in 1..5) {
 println(i)
 }


 Functions ⭐
 44. What is a function in Kotlin?
 45. How do you define a function?
 46. What are function parameters?
 47. What is a return type?
 48. What is the difference between a function with and without a return value?
 49. What is the Unit type?
 50. Can a Kotlin function have multiple parameters?
 51. Can a function have a default parameter value?
 52. What are named arguments?
 53. What is a single-expression function?
 Example:
 fun add(a: Int, b: Int): Int {
 return a + b
 }
 54. How can the above function be written using a single expression?
 fun add(a: Int, b: Int) = a + b
 55. What is the difference between parameters and arguments?  // <----
 *
 * */