// 19-Sep-2026
//RP S
//12:33 PM
fun main() {
    val arr = intArrayOf(1, 1, 998, 3, 3, 3, 4, 5, 6, 7, 8, 9, 10, 10, 99, 999)
    println(secondLargestElement(arr))

    for (i in removeDuplicates(arr)) {
        print("$i, ")
    }
    println()

    for (i in getFreqOfArrItems(arr).keys) {
        print("[ $i -> ${getFreqOfArrItems(arr)[i]} ], ")
    }
    println()

    val charArr = charArrayOf('a', 'a', 'b', 'c', 'd', 'e')
    println(firstNonRepeatingChar(charArr))

    println(isAnagram("silent", "listen"))
    println(isAnagram("hello", "there"))

    println()
    println("// 6. Reverse words in a sentence")
    println(reverseWords("i love kotlin"))

    println()
    val arrWithMissingNum = intArrayOf(1, 2, 3, 4, 6, 7)
    println("// 7. Find the missing number in an array: {${arrWithMissingNum.joinToString()}}:")
    println(findMissingNumber(arrWithMissingNum))

    println()
    println("// 8. Find the duplicate number in an array")
    val arrDup = intArrayOf(1, 3, 3, 3, 4, 5, 6, 7, 8, 9, 10, 10, 99, 999)
    println(getDuplicateNum(arrDup))

    println()
    val arrZeros = intArrayOf(1, 0, 3, 3, 4, 5, 0, 7, 8, 9, 0, 0, 99, 999)
    println("// 9. Move all zeros to the end of an array: {${arrZeros.joinToString()}}:")
    println((moveZerosToEnd(arrZeros)).joinToString())

    println()
    val arrPair = intArrayOf(3, 7, 4, 9, 2, 8, 6, 5)
    println("// 10. Find pairs with a given sum: {${arrPair.joinToString()}}:")
    println(pairsWithGivenSum(arrPair, 9).entries.joinToString { "${it.key} -> ${it.value} " })

    println()
    val comArr1 = intArrayOf(3, 7, 4, 9, 2, 8, 6, 5)
    val comArr2 = intArrayOf(0, 1, 3, 7, 4, 9, 2, 8)
    println("// 11. Find common elements between two arrays: {${comArr1.joinToString()}} and {${comArr2.joinToString()}}")
    println(commonArrayElements(comArr1, comArr2).joinToString())

    println()
    val longestWordSentence = "This is a longeeesssst Word Sentence"
    println("// 12. Find the longest word in a sentence: {${longestWordSentence}")
    println(getLongestWordSentence(longestWordSentence))

    println()
    val palindromeTestWord = "asdfggfdsa"
    println("// 13. Check whether a string is a palindrome: {${palindromeTestWord}}")
    println(isPalindrome(palindromeTestWord))

    println()
    val startNum = 5
    val endNum = 20
    println("// 14. Find prime numbers within a given range: {$startNum and $endNum")
    println(getAllPrimes(startNum, endNum))

    println()
    println("// 15. Generate Fibonacci series using recursion:")
    for (i in 1..10)
        print("${generateFibonacci(i)}, ")
    println()

    println()
    val sampleSentence = "This is is is a sample sample sentence for words count"
    println("// 16. Count the frequency of words in a sentence, for sentence:\n$sampleSentence:")
    println(countWords(sampleSentence))

    println()
    val employeesList = listOf(
        Employee("a", 100.0),
        Employee("b", 20.0),
        Employee("c", 10.0)
    )
    println("// 17. Sort a list of employees based on salary: ${employeesList.joinToString { "[${it.name} = ${it.salary}]" }}:")
    println(sortEmployeesList(employeesList).joinToString { "[${it.name} = ${it.salary}]" })
    println()


}


// 1. Find the second largest element in an array
fun secondLargestElement(arr: IntArray): Int {
    var largest = 0
    var secLargest = 0
    for (i in arr) {
        if (i > largest) {
            secLargest = largest
            largest = i
        }
        if (i < largest && i > secLargest)
            secLargest = i
    }
    return secLargest
}

// 2. Remove duplicate elements from an array
fun removeDuplicates(arr: IntArray): IntArray {
    val tempList = mutableListOf<Int>()
    for (i in arr) {
        if (!tempList.contains(i)) tempList.add(i)
    }
    return tempList.toIntArray()
}

// 3. Find the frequency of each character in a string
fun getFreqOfArrItems(arr: IntArray): Map<Int, Int> {
    val freqOfArrItems = mutableMapOf<Int, Int>()
    for (i in arr) {
        if (freqOfArrItems.keys.contains(i))
            freqOfArrItems[i] = freqOfArrItems[i]!! + 1
        else
            freqOfArrItems[i] = 1
    }
    return freqOfArrItems
}

// 4. Find the first non-repeating character
fun firstNonRepeatingChar(charArr: CharArray): Char {
    val charFreqMap = mutableMapOf<Char, Int>()
    for (c in charArr)
        charFreqMap[c] = charFreqMap.getOrDefault(c, 0) + 1
    for (c in charArr)
        if (charFreqMap[c] == 1) return c
    return '\u0000'
}


// 5. Check whether two strings are anagrams
fun isAnagram(str1: String, str2: String): Boolean {
    return str1.lowercase().toCharArray().sorted() ==
            str2.lowercase().toCharArray().sorted()
}


// 6. Reverse words in a sentence
fun reverseWords(sentence: String): String {
    val wordsArray = sentence.trim().split("\\s+".toRegex())
    val returnSentence = StringBuilder()
    for (i in wordsArray.size - 1 downTo 0) {
        returnSentence.append("${wordsArray[i]} ")
    }
    return returnSentence.toString().trim()
}

// 7. Find the missing number in an array
fun findMissingNumber(arr: IntArray): Int {
    val nThNum = arr[arr.size - 1]
    return (nThNum * (nThNum + 1) / 2) - arr.sum()
}

// 8. Find the duplicate number in an array
fun getDuplicateNum(arr: IntArray): Int? {
    val arrSet = HashSet<Int>()
    for (i in arr) {
        if (!arrSet.add(i)) return i
    }
    return null
}

// 9. Move all zeros to the end of an array
fun moveZerosToEnd(arrZeros: IntArray): IntArray {
    var index = 0
    for (num in arrZeros) {
        if (num != 0) {
            arrZeros[index] = num
            index++
        }
    }
    while (index < arrZeros.size) {
        arrZeros[index] = 0
        index++
    }
    return arrZeros
}

// 10. Find pairs with a given sum
fun pairsWithGivenSum(arr: IntArray, sum: Int): HashMap<Int, Int> {
    val pairs = HashMap<Int, Int>()
    for (num in arr) {
        val complement = sum - num
        if (arr.contains(complement)) {
            pairs[num] = complement
        }
    }
    return pairs
}

// 11. Find common elements between two arrays
fun commonArrayElements(arr1: IntArray, arr2: IntArray): IntArray {
    val comArr = mutableListOf<Int>()
    for (num in arr1) {
        if (arr2.contains(num)) comArr.add(num)
    }
    return comArr.toIntArray()
}

// 12. Find the longest word in a sentence
fun getLongestWordSentence(str: String): String {
    var longestWord = ""
    for (word in str.trim().split(" ")) {
        if (word.length > longestWord.length)
            longestWord = word
    }
    return longestWord
}

// 13. Check whether a string is a palindrome
fun isPalindrome(str: String): Boolean {
    return str == str.reversed()
}

// 14. Find prime numbers within a given range
fun isNumPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2..num / 2) {
        if (num % i == 0)
            return false
    }
    return true
}

fun getAllPrimes(start: Int, end: Int): List<Int> {
    val primeNumbers = mutableListOf<Int>()
    if (end <= start) return primeNumbers
    for (num in start..end) {
        if (isNumPrime(num))
            primeNumbers.add(num)
    }
    return primeNumbers
}

// 15. Generate Fibonacci series using recursion
fun generateFibonacci(num: Int): Int {
    if (num <= 1) return num
    return generateFibonacci(num - 1) + generateFibonacci(num - 2)
}

// 16. Count the frequency of words in a sentence
fun countWords(sentence: String): Map<String, Int> {
    val wordCountMap = mutableMapOf<String, Int>()
    for (word in sentence.trim().split(" ")) {
        if (wordCountMap.keys.contains(word))
            wordCountMap[word] = wordCountMap[word]!! + 1
        else
            wordCountMap[word] = 1
    }
    return wordCountMap
}

// 17. Sort a list of employees based on salary
data class Employee(val name: String, val salary: Double)

fun sortEmployeesList(employeesList: List<Employee>): List<Employee> {
    return employeesList.sortedBy { it.salary }
}

// 18. Filter and transform a list of products


// 19. Create a calculator using higher-order functions
// 20. Find the most frequently occurring element in an array
// 21. Find the largest and smallest element without using built-in functions
// 22. Find the intersection and union of two arrays
// 23. Rotate an array left/right by k positions
// 24. Find the longest substring without repeating characters
// 25. Check whether parentheses/brackets are balanced
// 26. Find the maximum and minimum sum subarray
// 27. Merge two sorted arrays
// 28. Find the top three largest numbers in an array
// 29. Group strings by their length using groupBy()
// 30. Find duplicate words in a sentence
