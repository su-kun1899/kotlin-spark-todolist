package red.sukun1899.kotlin.todolist

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @author su-kun1899
 */
data class TaskCreateRequest(
        @JsonProperty("content", required = true) val content: String
)