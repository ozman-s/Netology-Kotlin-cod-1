package ru.netology.ret

import ru.netology.domain.Post
import kotlin.random.Random

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

//    val likedList = list.filter { post ->
//        return
//    }
//    println(likedList)

//    val likedList = list.filter lambda@ { post ->
//        return@lambda post.likes > 0
//    }
//    println(likedList)

    val likedList = list.filter { post ->
        return@filter post.likes > 0
    }
    println(likedList)
}

