package red.sukun1899.kotlin.todolist

import spark.Request
import spark.Response
import spark.Route

/**
 * @author su-kun1899
 */
class TaskController {

    fun index(): Route = Route { request, response ->
        // ダミーデータを返す
        listOf(
                Task(1, "クリーニングに出す", false),
                Task(2, "住民票を取得する", true)
        )
    }
}