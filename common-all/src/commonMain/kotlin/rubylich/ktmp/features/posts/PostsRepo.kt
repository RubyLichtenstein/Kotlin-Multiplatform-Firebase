package rubylich.ktmp.features.posts

import rubylich.ktmp.repo.IRepo
import rubylich.ktmp.repo.Parser
import rubylich.ktmp.repo.Repo

const val REF_POSTS = "posts"

interface IPostRepo : IRepo<Post>

class PostsRepo : Repo<Post>(REF_POSTS, PostParser()), IPostRepo

expect class PostParser() : Parser<Post>