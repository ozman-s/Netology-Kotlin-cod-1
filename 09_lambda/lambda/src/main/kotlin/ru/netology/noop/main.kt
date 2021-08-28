package ru.netology.noop

import ru.netology.domain.Post
import kotlin.collections.MutableList

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
    list.noop()

    list.lastIndex

    val collection: MutableCollection<Post> = list
    collection.noop()
}

fun <E> MutableList<E>.noop() {
    println("mutable list")
}

fun <E> MutableCollection<E>.noop() {
    println("mutable collection")
}

