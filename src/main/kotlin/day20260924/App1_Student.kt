package day20260924

import kotlin.collections.map

/*
RP S
8:06 PM

Student Result Management System
Create a program that:
Calculates total marks.
Calculates percentage.
Assigns grade.
Finds topper.
Finds failed students.
Finds subject-wise average.
Finds students who scored above class average.
*/


data class Student(val name: String, val maths: Maths, val physics: Physics, val chemistry: Chemistry)
data class Maths(val marks: Int, val maxMarks: Int)
data class Physics(val marks: Int, val maxMarks: Int)
data class Chemistry(val marks: Int, val maxMarks: Int)
data class SubjectAverage(val maths: Double, val physics: Double, val chemistry: Double)

val sunny = Student("SUNNY", Maths(70, 100), Physics(50, 100), Chemistry(70, 100))
val rohit = Student("ROHIT", Maths(73, 100), Physics(82, 100), Chemistry(80, 100))
val keerthi = Student("KEERTHI", Maths(63, 100), Physics(61, 100), Chemistry(71, 100))
val duffer = Student("Duffer", Maths(39, 100), Physics(80, 100), Chemistry(80, 100))
val duffer2 = Student("Duffer2", Maths(31, 100), Physics(90, 100), Chemistry(90, 100))

fun main() {
    println("Sunny's TotalMarks -> ${calculatesTotalMarks(sunny)}")
    println("Sunny's Percentage -> ${calculatesPercentage(sunny)}")
    println("Sunny's Grade -> ${assignsGrade(sunny)}")
    println("Finds topper -> ${findTopper(arrayOf(sunny, rohit, keerthi))}")
    println("Finds failed students -> ${findFailedStudents(arrayOf(sunny, rohit, keerthi, duffer, duffer2))}")
    println("Finds subject-wise average  -> ${findSubjectWiseAverage(arrayOf(sunny, rohit, keerthi, duffer, duffer2))}")
    println("Finds students who scored above class average.  -> ${findStudentsScoredAboveClassAvg(arrayOf(sunny, rohit, keerthi, duffer, duffer2)).map { it.name }}")
}

//Calculates total marks.
fun calculatesTotalMarks(student: Student): Int {
    return student.maths.marks + student.physics.marks + student.chemistry.marks
}

//Calculates percentage.
fun calculatesPercentage(student: Student): Int {
    return calculatesTotalMarks(student) * 100 / 300
}

//Assigns grade.
fun assignsGrade(student: Student): String {
    return when {
        calculatesPercentage(student) < 40 -> "F"
        calculatesPercentage(student) < 60 -> "D"
        calculatesPercentage(student) < 70 -> "C"
        calculatesPercentage(student) < 80 -> "B"
        else -> "A"
    }

}

//Finds topper.
fun findTopper(students: Array<Student>): String {
    return students.maxByOrNull { calculatesTotalMarks(it) }?.let {
        val calculatesTotalMarks = calculatesTotalMarks(it)
        "${it.name}, with total: $calculatesTotalMarks/${it.maths.maxMarks + it.chemistry.maxMarks + it.physics.maxMarks}, ${
            calculatesPercentage(
                it
            )
        }%"
    } ?: "No day20260924.Student"
}

//Finds failed students.
fun findFailedStudents(students: Array<Student>): List<String> {
    return students
        .filter { student -> (student.maths.marks < 40 || student.physics.marks < 40 || student.chemistry.marks < 40) }
        .map { it.name }
}

//Finds subject-wise average.
fun findSubjectWiseAverage(students: Array<Student>): SubjectAverage {
    return SubjectAverage(
        maths = students.map { it.maths.marks }.average(),
        physics = students.map { it.physics.marks }.average(),
        chemistry = students.map { it.chemistry.marks }.average()
    )
}

//Finds students who scored above class average.
fun findStudentsScoredAboveClassAvg(students: Array<Student>): List<Student> {
    val average: Double = students.map { calculatesTotalMarks(it) }.average()
    return students.filter { calculatesTotalMarks(it) > average }
}
