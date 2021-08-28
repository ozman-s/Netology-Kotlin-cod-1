package ru.netology.swap

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
}

fun <E> MutableList<E>.swap(index1: Int, index2: Int) {
    val e1 = this[index1]
    val e2 = this[index2]
    this[index1] = e2
    this[index2] = e1
}
