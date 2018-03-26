package red.sukun1899.kotlin.todolist

import com.fasterxml.jackson.databind.ObjectMapper
import spark.ResponseTransformer

/**
 * @author su-kun1899
 */
class JsonTransformer(private val objectMapper: ObjectMapper) : ResponseTransformer {

    override fun render(model: Any?): String =
            objectMapper.writeValueAsString(model)
}