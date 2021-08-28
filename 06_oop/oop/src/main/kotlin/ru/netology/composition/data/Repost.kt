package ru.netology.composition.data

class Repost(
        val id: Long,
        val authorId: Long,
        val authorName: String,
        val created: Long,
        val original: Post
)


