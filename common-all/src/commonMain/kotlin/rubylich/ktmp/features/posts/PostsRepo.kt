package rubylich.ktmp.features.posts

import rubylich.ktmp.base.IBaseRepo
import rubylich.ktmp.base.IBaseParser
import rubylich.ktmp.base.BaseRepo

const val REF_POSTS = "posts"

interface IPostBaseRepo : IBaseRepo<Post>

class PostsRepo : BaseRepo<Post>(REF_POSTS, PostParser()), IPostBaseRepo

expect class PostParser() : IBaseParser<Post>