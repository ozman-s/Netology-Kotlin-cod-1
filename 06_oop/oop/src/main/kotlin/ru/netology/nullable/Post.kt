package ru.netology.nullable

class Post(
    val id: Long,
    val authorId: Long,
    val authorName: String,
    val content: String,
    val created: Long,
    val original: Post?,
    likes: Int = 0
) {
    var likes = likes
        set (value) {
            if (value < 0) {
                return
            }
            field = value
        }
        get() = field + (original?.likes ?: 0)
        //get() = field + original!!.likes
//        get() = field + original.likes
}














class WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post
        return posts.last()
    }

    fun repost(post: Post): Post {
        val original = post.original ?: post
        TODO()
    }
}



