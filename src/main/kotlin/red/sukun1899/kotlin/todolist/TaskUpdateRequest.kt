package red.sukun1899.kotlin.todolist

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @author su-kun1899
 */
data class TaskUpdateRequest(@JsonProperty("content") val content: String?,
                             @JsonProperty("done") val done: Boolean?)