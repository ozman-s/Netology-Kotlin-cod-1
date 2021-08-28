package ru.netology.inheritance.data

class Repost(
        id: Long,
        authorId: Long,
        authorName: String,
        created: Long,
        val original: Post
) : Post(id, authorId, authorName, "", created) {
    override fun toString(): String {
        return "Repost id: $id, original Post id: ${original.id}"
    }
}


