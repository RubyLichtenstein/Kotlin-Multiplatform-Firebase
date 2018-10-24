package rubylich.ktmp.features.posts

import rubylich.ktmp.repo.Parser
import rubylich.ktmp.repo.Repo

const val REF_POSTS = "posts"

class PostsRepo : Repo<Post>(REF_POSTS, PostParser())

expect class PostParser() : Parser<Post>