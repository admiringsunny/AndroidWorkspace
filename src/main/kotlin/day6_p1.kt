fun main() {
// Find the Sum of List Elements
//Given a list of integers, use a loop to calculate the sum of all elements.
// Input:  [10, 20, 30, 40]
//Output: 100
    val myList = listOf(10, 20, 30, 40)
    var sumMyList = 0
    for (i in myList)
        sumMyList += i
    println(sumMyList)
    println("-----------")


// Count Even and Odd Numbers
//Given a list of integers, count how many numbers are even and how many are odd.
    val evenOddList = listOf(2, 4, 23, 678, 21, 97, 100, 101)
    var evenCount = 0
    var oddCount = 0
    for (i in evenOddList) {
        if (i % 2 == 0) evenCount++
        else oddCount++
    }
    println("evenCount = $evenCount")
    println("oddCount = $oddCount")
    println("-----------")


//    Find Maximum and Minimum
//    Find the largest and smallest elements from a list without using maxOrNull() or minOrNull().
    val minMaxList = listOf(2, 4, 23, 678, 21, 97, 100, 101)
    var minItem = minMaxList[0]
    var maxItem = minMaxList[0]
    for (i in minMaxList) {
        if (i < minItem) minItem = i
        if (i > maxItem) maxItem = i
    }
    println("minItem = $minItem")
    println("maxItem = $maxItem")
    println("-----------")

//    Reverse a List
//    Reverse a list using a loop without using the built-in reversed() function.
    val fwdList = listOf(10, 20, 30, 40)
    var reverseList = ArrayList<Int>()
    for (i in fwdList.size - 1 downTo 0) {
        reverseList.add(fwdList[i])
    }
    println("reverseList = $reverseList")
    println("-----------")

//    Print Elements at Even Positions
//    Given a list, print elements present at indexes 0, 2, 4, 6....
    val evenPositionsList = listOf("A", "B", "C", "D", "E", "F")
    for (i in 0..(evenPositionsList.size - 1) step 2) {
        print("${evenPositionsList[i]}, ")
    }
    println()
    println("-----------")

//    Remove Duplicate Elements
//    Given a list of integers, create a new list containing only unique elements.
//    Input:  [10, 20, 10, 30, 20, 40]
//    Output: [10, 20, 30, 40]
    val duplicateElementsList = listOf(10, 20, 10, 30, 20, 40)
    var uniqElementsList = ArrayList<Int>()
    for (i in duplicateElementsList) {
        if (!uniqElementsList.contains(i)) {
            uniqElementsList.add(i)
        }
    }
    println("uniqElementsList = $uniqElementsList")
    println("-----------")

//    Find Duplicate Elements
//    Find all elements that appear more than once.
//    Input:  [1, 2, 3, 2, 4, 5, 1]
//    Output: [1, 2]
    val duplicateElementsList2 = listOf(1, 2, 3, 2, 4, 5, 1)
    var uniqElementsList2 = ArrayList<Int>()
    for (i in duplicateElementsList2) {
        if (uniqElementsList2.contains(i)) {
            print("$i, ")
        } else {
            uniqElementsList2.add(i)
        }

    }
    println()
    println("-----------")


//    Find Second Largest Number
//    Find the second-largest distinct number without sorting the list.
//    Input:  [10, 25, 5, 40, 40, 30]
//    Output: 30
    val secLargestNoList = listOf(10, 25, 5, 40, 40, 30)
    var largestNo = secLargestNoList[0]
    var secLargestNo = secLargestNoList[0]
    for (i in secLargestNoList) {
        if (i > largestNo) {
            secLargestNo = largestNo
            largestNo = i
        }
        if (i < largestNo && i > secLargestNo) {
            secLargestNo = i
        }
    }
    println("secLargestNo = $secLargestNo")
    println("-----------")

//    Count Frequency of Elements
//    Use a MutableMap to count how many times each number occurs.
    val freqCountList = listOf(1, 2, 3, 6, 4, 1, 2, 4, 5, 6, 6, 6)
    val freqCountMap = mutableMapOf<Int, Int>()
    for (i in freqCountList) {
        if (freqCountMap.containsKey(i)) {
            var count = freqCountMap.get(i)!! + 1
            freqCountMap[i] = count
        } else {
            freqCountMap[i] = 1
        }
    }
    println("freqCountMap = $freqCountMap")
    println("-----------")

//    Find Common Elements
//    Given two lists, find the elements that are present in both lists.
    val list1 = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val list2 = listOf(1, 8, 9, 10, 11)
    print("Common Elements = ")
    for (i in list1) {
        if (list2.contains(i)) {
            print("$i, ")
        }
    }
    println()
    println("-----------")
}