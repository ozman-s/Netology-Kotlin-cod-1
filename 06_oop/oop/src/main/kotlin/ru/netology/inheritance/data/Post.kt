package ru.netology.inheritance.data

open class Post(
    val id: Long,
    val authorId: Long,
    val authorName: String,
    val content: String,
    val created: Long,
    val likes: Int = 0
)



