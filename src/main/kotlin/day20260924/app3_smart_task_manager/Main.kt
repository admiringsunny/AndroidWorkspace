package day20260924.app3_smart_task_manager

/*
RP S
8:09 PM
Smart Task Manager 📋   Create a task management application.

data class Task(
    val id: Int,
    val title: String,
    val priority: Priority,
    var status: Status
)

Enums:
enum class Priority {
    LOW,
    MEDIUM,
    HIGH
}enum class Status {
    TODO,
    IN_PROGRESS,
    COMPLETED
}

Implement:
Add task
Delete task
Update task
Complete task
Filter by priority
Filter by status
Sort by priority
Search task  Advanced Challenge

Display:
Total Tasks
Completed
Pending
High Priority
Completion %

*/

fun main() {

//Add task
    addTask(
        id = tasksList.size + 1,
        title = "First",
        Priority.LOW,
        Status.TODO
    )
    addTask(
        id = tasksList.size + 1,
        title = "First",
        Priority.HIGH,
        Status.TODO
    )
    addTask(
        id = tasksList.size + 1,
        title = "First",
        Priority.LOW,
        Status.TODO
    )
    addTask(
        id = tasksList.size + 1,
        title = "First",
        Priority.HIGH,
        Status.TODO
    )
    println("-----")

//Delete task
    deleteTask(tasksList.first().id)
    println("-----")

//Update task
    updateTask(
        id = tasksList.first().id,
        title = "First-Edited",
        Priority.MEDIUM,
        Status.TODO
    )
    println("-----")

//Complete task
    completeTask(tasksList.last().id)
    println("-----")

//Filter by priority
    println("Filter by priority == Priority.HIGH")
    tasksList.filter { it.priority == Priority.HIGH }
        .forEach { task -> println("${task.id}, ${task.title}, ${task.priority}, ${task.status}") }
    println("-----")

//Filter by status
    println("Filter by status == Status.COMPLETED")
    tasksList.filter { it.status == Status.COMPLETED }
        .forEach { task -> println("${task.id}, ${task.title}, ${task.priority}, ${task.status}") }
    println("-----")

//Sort by priority
    println("Sort by priority")
    tasksList.sortedBy { it.priority }
        .forEach { task -> println("${task.id}, ${task.title}, ${task.priority}, ${task.status}") }
    println("-----")

//Search task  Advanced Challenge
    println("Search task  Advanced Challenge")
    val task = tasksList.find { it.title.contains("Second") }
    println("${task?.id}, ${task?.title}, ${task?.priority}, ${task?.status}")
    println("-----")

//Display:
//Total Tasks
    println("Total Tasks:")
    println(tasksList.size)
    tasksList.forEach { task -> println("${task.id}, ${task.title}, ${task.priority}, ${task.status} ") }
    println("---------")

//Completed
    println("Completed")
    tasksList
        .filter { it.status == Status.COMPLETED }
        .forEach { task -> println("${task.id}, ${task.title}, ${task.priority}, ${task.status} ") }
    println("---------")

//Pending
    println("Pending")
    tasksList
        .filter { it.status == Status.IN_PROGRESS }
        .forEach { task -> println("${task.id}, ${task.title}, ${task.priority}, ${task.status} ") }
    println("---------")

//High Priority
    println("High Priority")
    tasksList
        .filter { it.priority == Priority.HIGH }
        .forEach { task -> println("${task.id}, ${task.title}, ${task.priority}, ${task.status} ") }
    println("---------")

//Completion %
    println("Completion %")
    val completePercent =
        100 * tasksList.filter { it.status == Status.COMPLETED }.size / tasksList.size
    println("$completePercent%")
    println("---------")
}