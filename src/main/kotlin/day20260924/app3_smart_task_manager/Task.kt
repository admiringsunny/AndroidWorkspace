package day20260924.app3_smart_task_manager

data class Task(
    val id: Int,
    val title: String,
    val priority: Priority,
    var status: Status
)


val tasksList = mutableListOf<Task>()

fun addTask(id: Int, title: String, priority: Priority, status: Status) {
    tasksList.add(Task(id, title, priority, status))
}

fun deleteTask(id: Int) {
    tasksList.removeAll { it.id == id }
}

fun updateTask(
    id: Int,
    title: String,
    priority: Priority,
    status: Status
) {
    val existingTask = tasksList.find { it.id == id } ?: return
    val updatedTask = existingTask.copy(id = id, title = title, priority = priority, status = status)
    val i = tasksList.indexOf(existingTask)
    tasksList[i] = updatedTask
}

fun completeTask(id: Int) {
    val task: Task = tasksList.find { it.id == id } ?: return
    task.status = Status.COMPLETED
}
