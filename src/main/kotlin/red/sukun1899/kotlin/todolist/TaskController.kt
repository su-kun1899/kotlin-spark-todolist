package red.sukun1899.kotlin.todolist

import com.fasterxml.jackson.databind.ObjectMapper
import spark.Route
import spark.Spark.halt

/**
 * @author su-kun1899
 */
class TaskController(private val objectMapper: ObjectMapper,
                     private val taskRepository: TaskRepository) {

    fun index(): Route = Route { request, response ->
        taskRepository.findAll()
    }

    fun create(): Route = Route { request, response ->
        val taskCreateRequest: TaskCreateRequest =
                objectMapper.readValue(request.bodyAsBytes()) ?: throw halt(400)

        val task = taskRepository.create(taskCreateRequest.content)
        response.status(201)

        task
    }
}