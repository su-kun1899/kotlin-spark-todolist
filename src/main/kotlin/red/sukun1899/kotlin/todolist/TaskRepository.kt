package red.sukun1899.kotlin.todolist

/**
 * @author su-kun1899
 */
class TaskRepository {
    private val tasks: MutableList<Task> = mutableListOf()

    private val maxId: Long
        get() = tasks.map(Task::id).max() ?: 0

    fun findAll(): List<Task> = tasks.toList()

    fun findById(id: Long): Task? = tasks.find { it.id == id }

    fun create(content: String): Task {
        val id = maxId + 1
        val task = Task(id, content, false)
        tasks += task
        return task
    }

    fun update(task: Task) {
        tasks.replaceAll { t ->
            if (t.id == task.id) task
            else t
        }
    }

    fun delete(task: Task): Unit {
        tasks.removeIf { (id) -> id == task.id }
    }
}