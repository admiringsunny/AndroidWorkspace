fun main() {

    val name: String? = "null"
    val result: Int? = name?.let {
        println(it)
        it.length
    }
    println(result.let { it!!::class })
    var a = result
}