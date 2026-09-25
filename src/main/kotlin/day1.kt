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


    val a: Int = 1  // Explicit type declaration
    val b = 1       // Type is inferred by the compiler

    //Immutable and Mutable Variables

    //Immutable Variables :-  Read Only Variables val a =10 (U will not be able to change the value.)
    //Mutable Variables:- Changeable Variables var a= 10 (U can change the value of variable)

    fun a (){
        var sum = 20

    }
//    sum  =30 // -> c.t.error


    println("Hello World!")

    var myArray = arrayOf("this", "is", "good")
    for (i in myArray)
        println(i)

    print("Enter text: ")
    var input = readLine()
    print("You entered: $input")
}