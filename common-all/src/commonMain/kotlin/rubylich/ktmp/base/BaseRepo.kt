package rubylich.ktmp.base

import kotlinx.serialization.ImplicitReflectionSerializer
import kotlinx.serialization.Mapper
import rubylich.ktmp.features.posts.Post

expect abstract class BaseRepo<T : Any>(
    ref: String,
    parser: IBaseParser<T>
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

interface IBaseParser<T: Any> {
    fun parse(any: Any): T
    fun serialize(t: T): Map<String, Any> = (t as Post).serialize()
}

@UseExperimental(ImplicitReflectionSerializer::class)
//inline fun <reified T: Any> T.serialize(): Map<String, Any> = Mapper.map(this)
inline fun Post.serialize(): Map<String, Any> = Mapper.map(this)
