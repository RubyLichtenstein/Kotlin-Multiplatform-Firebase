package rubylich.ktmp.repo

expect abstract class Repo<T : Any>(
    ref: String,
    parser: Parser<T>
) {
    suspend fun getAll(): List<T>
    suspend fun get(id: String): T
    suspend fun set(id: String, t: T)
    suspend fun delete(id: String)
    suspend fun update(id: String, field: String, value: Any)
}

interface Parser<T> {
    fun parse(any: Any): T
}
