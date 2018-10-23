package features.posts

import common.Parser
import common.Repo

const val REF_POSTS = "posts"

class PostsRepo : Repo<Post>(REF_POSTS, PostParser())

expect class PostParser() : Parser<Post>