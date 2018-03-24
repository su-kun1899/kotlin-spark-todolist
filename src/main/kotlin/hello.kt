import spark.Spark.get
/**
 * @author su-kun1899
 */
fun main(args: Array<String>) {
    get("/hello") { request, response ->
        val name: String? = request.queryParams("name")
        "Hello, ${name ?: "world"}!"
    }
}