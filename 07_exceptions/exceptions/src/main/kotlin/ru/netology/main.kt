package ru.netology

import ru.netology.service.WallService

//fun main() {
//    val service = WallService()
//    val post = service.findById(1)
//    println(post!!.id)
//    service.removeById(1)
//}

//fun main() {
//    val service = WallService()
//    try {
//        println("before exception")
//        val id = service.findById(1)!!.id
//        println("after exception")
//    } catch (e: RuntimeException) {
//        println("specific catch")
//    } catch (e: Exception) {
//        println("common catch")
//    } catch (e: Throwable) {
//        println("catch all")
//    }
//
//    println("main done")
//}

//fun main() {
//    val service = WallService()
//    try {
//        println("before exception")
//        val id = service.findById(1)!!.id
//        println("after exception")
//    } catch (e: RuntimeException) {
//        println("specific catch")
//    } catch (e: Exception) {
//        println("common catch")
//    } catch (e: Throwable) {
//        println("catch all")
//    } finally {
//        println("finally done")
//    }
//}

//fun main() {
//    val service = WallService()
//    try {
//        println("before exception")
//        val id = service.findById(1)!!.id
//        println("after exception")
//    } catch (e: NullPointerException) {   }
//}

//fun main() {
//    val service = ExceptionsService()
//    service.throwException()
//}

class PostNotFoundException(message: String): RuntimeException(message)

fun main() {
    val service = WallService()
    val id = 1L
    val author = service.findById(id)?.authorName ?: throw PostNotFoundException("no post with id $id")
    println(author)
}

