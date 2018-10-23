package features.posts

import common.Parser
import common.Repo
import db.FirebaseDbRefs.REF_POSTS

class PostRepo : Repo<Post>(REF_POSTS, PostParser())

expect class PostParser() : Parser<Post>