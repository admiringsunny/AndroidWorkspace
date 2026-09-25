fun main() {
    println("factorial = ${factorial(5)}")
    println("isPrime = ${isPrime(6)}")
    println("reverseNumber = ${reverseNumber(1234)}")
    println("countDigits = ${countDigits(1234)}")
    println("findMaximum = ${findMaximum(intArrayOf(1, 3, 5, 12, 1, 0))}")
    println("calculateAverage = ${calculateAverage(intArrayOf(2, 3, 4, 5, 6))}")
    println("removeDuplicateChars = ${removeDuplicateChars("aqaqaqaaaqwe")}")
    println("firstNonRepeatingChar = ${firstNonRepeatingChar("swiss")}")
    println("checkAnagram = ${checkAnagram("listen", "silent")}")
    println("findMissingNo = ${findMissingNo(intArrayOf(1, 2, 3, 4, 5, 6, 8))}")
}

// Calculate Factorial
//Write a function factorial() that accepts an integer and returns its factorial.
fun factorial(n: Int): Int {
    if (n <= 0) return 1;
    if (n == 1)
        return 1
    return n * factorial(n - 1)
}

// Check Prime Number
//Write a function isPrime(n: Int): Boolean that checks whether a number is prime.
fun isPrime(n: Int): Boolean {
    for (i in 2..n / 2) {
        if (n % i == 0) return false;
    }
    return true;
}

// Reverse a Number
//Write a function reverseNumber() that accepts an integer and returns the reversed number.
fun reverseNumber(n: Int): Int {
    var num = n
    var reversedNum = 0
    while (num != 0) {
        var digit = num % 10
        num /= 10
        reversedNum = reversedNum * 10 + digit
    }
    return reversedNum
}

// Count Digits
//Write a function countDigits() that returns the number of digits in an integer.
fun countDigits(n: Int): Int {
    if (n == 0) return 1
    return n.toString().length

//    var num = n
//    var count = 0
//    while (num > 0) {
//        count++
//        num /= 10
//    }
//    return count
}

// Find Maximum in an Array
//Write a function findMaximum(numbers: IntArray) that returns the largest element in an array.
fun findMaximum(numbers: IntArray): Int {
    if (numbers.isEmpty())
        return -1

    var max = 0
    for (n in numbers) {
        if (n > max) max = n
    }

    return max
}

// Calculate Average
//Write a function calculateAverage(numbers: IntArray) that calculates and returns the average.
fun calculateAverage(numbers: IntArray): Int {
    if (numbers.isEmpty())
        return 0

    var sum = 0
    for (n in numbers)
        sum += n
    return sum / (numbers.size) // average = sum/size
}


//    Remove Duplicate Characters
//Write a Kotlin program/function to remove duplicate characters from a string while preserving their original order.
//Example:
//programming → progamin
fun removeDuplicateChars(str: String): String {
    if (str.length < 2) return str
    var result = ""
    for (c in str) {
        if (!result.contains(c))
            result += c
    }
    return result;
}


// Find First Non-Repeating Character
//Write a function to find the first character that occurs only once in a string.
//Example:
//swiss → w
fun firstNonRepeatingChar(str: String): String {
    for (c in str) {
        if (str.indexOf(c) == str.lastIndexOf(c)) {
            return c.toString()
        }
    }
    return ""
}

// Check Anagram
//Write a function to determine whether two strings are anagrams.
//Example:
//listen, silent → Anagram
fun checkAnagram(str1: String, str2: String): Boolean {
    return str1.toCharArray().sorted() == str2.toCharArray().sorted()
}

// Find Missing Number
//Given an array containing numbers from 1 to n+1 with one number missing, write a function to find the missing number.
//Example:
//[1, 2, 4, 5, 6] → 3
fun findMissingNo(intArray: IntArray): Int {
    for ((i, v) in intArray.withIndex()) {
        if((i+1 ) != v) return i+1
    }
    return -1
}