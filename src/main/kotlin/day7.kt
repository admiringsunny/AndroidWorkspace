import java.lang.invoke.SerializedLambda

// 'operation' is a parameter that accepts a function.
// (Int, Int) -> Int means: a function that takes two integers and returns an integer.

fun main() {
    // Pass a lambda function that adds two numbers
    calculate(5, 3, { x, y -> x + y }) // Prints: The result is: 8

    // Pass a lambda function that multiplies two numbers
    calculate(5, 3, { x, y -> x * y }) // Prints: The result is: 15

    calculate(2, 3) { x, y -> x * y }

    higherOrdFunPrint("Sunny", ::printMe)

    higherOrdFunLambda(2, 4, myLambda)

    println(higherOrderFun2(2, 3))

    // todo
//    highOrderSum{() -> }

}

fun calculate(i: Int, i2: Int, operation: (Int, Int) -> Int) {
    println("Result is ${operation(i, i2)}")
}

fun printMe(s: String){
    println("Hello $s")
}

fun higherOrdFunPrint(s: String, myFunc: (String) -> Unit){
    myFunc(s)
}

var myLambda = {a: Int, b: Int -> a + b}

fun higherOrdFunLambda(a: Int, b: Int, inFun: (Int, Int) -> Int ) {
    println("The sum of $a and $b is: ${myLambda(a, b)}")
}

fun returnFun(a:Int, b: Int): Int {
    return a*b
}

fun higherOrderFun2(a:Int, b: Int): ((Int, Int) -> Int) {
    return ::returnFun
}

fun sumOf2Nums(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun highOrderSum(myFun : (Int, Int) -> Int) {
    println(myFun)
}