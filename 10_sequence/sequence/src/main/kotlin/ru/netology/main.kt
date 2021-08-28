package ru.netology

import java.util.*

enum class PostType {
    AUDIO, PHOTO, VIDEO, DIGEST,
}

data class Post(
        val id: Long,
        val type: PostType,
        val content: String,
        val likes: Int = 0
)

fun main() {
    val posts = sequenceOf(
            Post(6, PostType.PHOTO, "...", 2),
            Post(5, PostType.VIDEO, "...", 30),
            Post(4, PostType.PHOTO, "...", 2),
            Post(3, PostType.AUDIO, "...", 5),
            Post(2, PostType.VIDEO, "...", 60),
            Post(1, PostType.AUDIO, "...", 1)
    )

    val topBoundary = 10
    val topCount = 5
    val emptyDigestContent = "Digest is empty"

    val topDigest = posts
        .filter { it.likes >= topBoundary }
        .take(topCount)
        .map { it.content }
        .joinToString("\n")
        .ifEmpty { emptyDigestContent }
        .let { Post(0, PostType.DIGEST, it) }


    println(topDigest)


//    var content = "";
//    var count = 0
//    for (post in posts) {
//        if (post.likes < topBoundary) {
//            continue
//        }
//
//        count++
//        content += "${post.content}\n"
//
//        if (count == topCount) {
//            break
//        }
//    }
//
//    if (content.isBlank()) {
//        content = emptyDigestContent
//    }
//
//    val topDigest = Post(0, PostType.DIGEST, content)
//
//    println(topDigest)
}


