package ru.netology.funref

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

    // with type inference
    val short = ::liked // function reference
    // without type inference
    val full: (post: Post) -> Boolean = ::liked // скобки обязательны
    // call
    println(short(list.first())) // () - оператор вызова
    println(full(list.first())) // () - оператор вызова
    println(short == full) // true
    println(short === full) // false
}

fun liked(post: Post) = post.likes > 0


