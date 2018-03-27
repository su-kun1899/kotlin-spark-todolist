package red.sukun1899.kotlin.todolist

import spark.Route

/**
 * @author su-kun1899
 */
class TaskController(private val taskRepository: TaskRepository) {

    fun index(): Route = Route { request, response ->
        taskRepository.findAll()
    }
}