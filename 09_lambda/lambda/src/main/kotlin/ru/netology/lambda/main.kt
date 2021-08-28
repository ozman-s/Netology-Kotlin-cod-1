package ru.netology.lambda

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

//    val likedList = list.filter { post: Post ->
//        post.likes > 0
//    }
//    println(likedList)
//
//    val otherLikedList = list.filterIndexed { index: Int, post: Post ->
//        post.likes > 0
//    }
//    println(otherLikedList)

//    val likedList = list.filter { post ->
//        post.likes > 0
//    }
//    println(likedList)
//
//    val otherLikedList = list.filterIndexed { index, post ->
//        post.likes > 0
//    }
//    println(otherLikedList)

//    val predicate = {post: Post -> post.likes > 0}

//    val otherLikedList = list.filterIndexed { _, post ->
//        post.likes > 0
//    }
//    println(otherLikedList)

//    val randomList = list.filter {
//        Random.nextBoolean()
//    }
//    println(randomList)

//    val likedList = list.filter({
//        it.likes > 0
//    })
//    println(likedList)

    val likedList = list.filter { post ->
        return@filter post.likes > 0
    }
    println(likedList)
}

