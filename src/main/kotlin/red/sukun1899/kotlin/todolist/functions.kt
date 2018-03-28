package red.sukun1899.kotlin.todolist

import com.fasterxml.jackson.databind.ObjectMapper

/**
 * @author su-kun1899
 */
inline fun <reified T : Any> ObjectMapper.readValue(src: ByteArray): T? =
        try {
            readValue(src, T::class.java)
        } catch (e: Exception) {
            null
        }