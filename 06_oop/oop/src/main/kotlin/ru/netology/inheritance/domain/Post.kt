package ru.netology.inheritance.domain

open class Post(
    val id: Long,
    val authorId: Long,
    val authorName: String,
    val content: String,
    val created: Long,
    likes: Int = 0
) {
    open var likes = likes
        set (value) {
            if (value < 0) {
                return
            }
            field = value
        }
}



