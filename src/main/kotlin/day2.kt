import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Hello, world!!!")
//     var a= 10
//     var b = 20
//     var c = 10+20

    //println(c)

    //To Detect The Type of the variable from its value

    //In Java we used to write int a =10 ,string a = "Hello "

    //For eg:

//     var a = "Hello"
//     var b = 10
//     var c = 20.06f
//     var d = 20.9999

//     println(a::class)
// 	println(b::class)
//     println(c::class)
//     println(d::class)

    //Null Safety

//    var s :String = null

//     !! ?

    // Kotlin Provides Other Features

    //Data Classes (Replica of Pojo/Model Class in Java)
    //Extension Functions (Add a new function to an existing class without modifying the class)
    //Inline Functions (It tells the kotlin compiler to copy the function code directly into the calling code instead of creating a
    //separate funtion call)
    //High-Order Functions (Functions which take another function as  a parameter or return the function as a result)


    // Q1 :-  Create a Project in Android . ("Kotlin Workspace") Write a Hello World Program in Kotlin .


//     val a: Int = 1  // Explicit type declaration
// 	val b = 1       // Type is inferred by the compiler

    //Immutable and Mutable Variables

    //Immutable Variables :-  Read Only Variables val a =10 (U will not be able to change the value.)
    //Mutable Variables:- Changeable Variables var a= 10 (U can change the value of variable)

//     fun a (){
//         var sum = 20

//     }
//     sum  =30

    //IF-Else Expression
//     var sum =10+5
//     if(sum>20)
//      print("True")
//     else if(sum == 15)
//      print("Sum is 15")
//     else
//      print("False")

    //Nested IF
//      var month ="JAN"
//      var date = 12
//      var year = 1990

//       if(month == "JAN")
//         if(date == 12)
//           if(year == 1990)
//             println("Nested IF Case:---")
//             println ("DOB IS  $date-$month-$year")


//     var e=10
//     var flag = true
//     println("First print then increment: "+ e++)
//     println("New Value OF E"+e)
//     println("First increment then print: "+ ++e)
//     println("First print then decrement: "+ e--)
//     println("New Value OF E after decrement :- $e")
//     println("First decrement then print: "+ --e)

    //println("Sum of {$a} and {$b} is : ${sum(a,b)}")


//Loops
// var ab = 0
// while(ab<=5){
//     println("While Loop Testing")
//     println("$ab")
//     ab++
// }


//For Loop Testing
// for (ab in 1..5){
//     println("For Loop Testing")
//     println("$ab")
// }

// var names = arrayOf("Praveen","Gaurav","Akash","Sidhant","Abhi","Mayank")
// for(name in names){
//     println("Names is $name")
// }
// //For Loop When YOU Want to SKIP A NUMBER
// for(ab in 1..10 step 2){
//     println("For Loop Testing")
//     println("$ab")
// }

// var number = 6
//     var factorial = 1
//     do {
//         factorial *= number
//         number--
//     }while(number < 0)
//     println("Factorial of 6 is $factorial")

// for (i in 5 downTo 1) {
//         print("$i ")
//     }
//Traverse an array without using the index property
// var numbers = arrayOf(1,2,3,4,5,6,7,8,9,10)

// 	for (num in numbers){
//         if(num%2 == 0){
//             print("$num ")
//         }
//     }

// var planets = arrayOf("Earth", "Mars", "Venus", "Jupiter", "Saturn")

//     for (i in planets.indices) {
//         println(planets[i])
//     }

    //Traverse an array using withIndex() Library Function


    //Array consists of 2 things Index and Value


//     var planets = arrayOf("Earth", "Mars", "Venus", "Jupiter", "Saturn")


//     for ((index,v) in planets.withIndex()) {
//         println("Element at $index th index is $v")
//     }

// WHEN EXPRESSION


// var month = "Jan"

// when(month){
//     "Jan","Apr","XYZ" -> print("January,APRIL,XYZ") break
//     "Feb" -> print("February")
//     "Mar" -> print("March")

//     else ->print("None")
// }



/////////
//    for (i in 5 downTo 1 step 2){
//        println(i)
//    }
//
//    val abc = arrayOf("a", "b", "c")
//    for(i in abc.indices){
//        println(abc[i])
//    }
//    for ((i,v) in abc.withIndex()){
//        println(i)
//        println(v)
//    }

    var month = 5
    when (month) {
        1 -> println("jan")
        2 -> println("feb")
        3 -> println("mar")

        else -> println("incorrect month no.")
    }
}