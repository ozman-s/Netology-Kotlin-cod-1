package ru.netology.inheritance.java

import ru.netology.inheritance.domain.JavaPost

class Post(likes: Int = 0): JavaPost(/* нужно передавать likes и т.д. */) {
    private var _likes = likes

    override fun getLikes(): Int {
        return _likes + super.getLikes()
    }

    // только для примера (не используется)
    override fun setLikes(likes: Int) {
        super.setLikes(likes)
    }
}


