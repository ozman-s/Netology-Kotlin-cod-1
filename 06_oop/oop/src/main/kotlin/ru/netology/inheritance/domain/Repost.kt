package ru.netology.inheritance.domain

class Repost(
    id: Long,
    authorId: Long,
    authorName: String,
    created: Long,
    val original: Post,
    likes: Int = 0
): Post(id, authorId, authorName, "", created) {
    override var likes = likes
        set (value) {
            if (value < 0) {
                return
            }
            field = value
        }
        get() = field + super.likes
}



