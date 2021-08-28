package ru.netology.anonymous

import ru.netology.domain.Post

fun main() {
    val list = mutableListOf(
        Post(
            id = 2,
            authorId = 1,
            authorName = "Нетология",
            content = "Новая Нетология",
            created = 1590075360
        ),
        Post(
            id = 1,
            authorId = 1,
            authorName = "Нетология",
            content = "Обновлённая профессия Android",
            created = 1590055360,
            likes = 200
        )
    )

//    val predicate = fun(post: Post) = post.likes > 0
//    val predicate = fun(post: Post): Boolean { return post.likes > 0 }
//    val likedList = list.filter(predicate)
//    println(likedList)

    val likedList = list.filter(fun(post: Post) = post.likes > 0)
    println(likedList)
}

