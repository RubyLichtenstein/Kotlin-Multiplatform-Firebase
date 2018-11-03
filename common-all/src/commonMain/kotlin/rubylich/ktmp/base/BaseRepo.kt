package rubylich.ktmp.base

expect abstract class BaseRepo<T : Any>(
    ref: String,
    IBaseParser: IBaseParser<T>
) : IBaseRepo<T> {
    override suspend fun getAll(): List<T>
    override suspend fun get(id: String): T
    override suspend fun set(id: String, t: T)
    override suspend fun delete(id: String)
    override suspend fun update(id: String, field: String, value: Any)
}

interface IBaseRepo<T : Any> {
    suspend fun getAll(): List<T>
    suspend fun get(id: String): T
    suspend fun set(id: String, t: T)
    suspend fun delete(id: String)
    suspend fun update(id: String, field: String, value: Any)
}

interface IBaseParser<T> {
    fun parse(any: Any): T
}
