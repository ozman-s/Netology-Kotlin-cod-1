package ru.netology.composition.iface

interface Post {
    val id: Long
    val authorId: Long
    val authorName: String
    val content: String
    val created: Long
    val likes: Int

    val infoAsProp: String
        get() = "#$id by $authorName at $created"

    fun infoAsFun() = "#$id by $authorName at $created"
}

class RegularPost(
    override val id: Long,
    override val authorId: Long,
    override val authorName: String,
    override val content: String,
    override val created: Long,
    override val likes: Int
) : Post

class Repost(
    override val id: Long,
    override val authorId: Long,
    override val authorName: String,
    override val content: String,
    override val created: Long,
    override val likes: Int,
    val original: Post
) : Post {
}

class WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post
        return posts.last()
    }

    fun repost(post: Post): Post {
        if (post !is Repost) {
            TODO()
        }

        val original = post.original
        TODO()
    }
}



