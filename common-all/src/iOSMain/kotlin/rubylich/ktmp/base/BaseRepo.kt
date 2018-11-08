package rubylich.ktmp.base

actual abstract class BaseRepo<T : Any> actual constructor(
    ref: String,
    IBaseParser: IBaseParser<T>
) : IBaseRepo<T> {
    actual override suspend fun getAll(): List<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual override suspend fun get(id: String): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual override suspend fun set(id: String, t: T) {}
    actual override suspend fun delete(id: String) {}
    actual override suspend fun update(id: String, field: String, value: Any) {}
}