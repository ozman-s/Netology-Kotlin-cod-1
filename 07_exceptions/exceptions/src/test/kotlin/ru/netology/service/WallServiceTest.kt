package ru.netology.service

import org.junit.Assert.*
import org.junit.Test
import ru.netology.PostNotFoundException
import ru.netology.data.Post

class WallServiceTest {
    @Test
    fun shouldUpdateExisting() {
//        val service = WallService()
//        service.add(Post(/* заполняете поля */))
//        service.add(Post(/* заполняете поля */))
//        val update = Post(/* */)
//
//        val result = service.update(update)
//
//        assertTrue(result)
    }

    // TODO: change to some meaningful exception
    @Test(expected = NotImplementedError::class)
    fun shouldThrow() {
        val service = WallService()
        val id = 1L
        service.removeById(id)
    }
}