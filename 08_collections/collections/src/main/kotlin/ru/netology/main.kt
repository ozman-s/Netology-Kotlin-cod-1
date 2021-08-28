package ru.netology

import ru.netology.domain.Post
import java.util.*
import kotlin.collections.Collection
import kotlin.collections.Iterable
import kotlin.collections.List
import kotlin.collections.MutableCollection
import kotlin.collections.MutableIterator
import kotlin.collections.MutableList

//data class GenericPair<A, B>(var first: A, var second: B)
//
//data class MonoPair<T>(val first: T, val second: T)
//
//open class Pair<A, B>(var first: A, var second: B)
//
//class Coords(first: Double, second: Double): Pair<Double, Double>(first, second)
//
//fun main() {
//    // для этого конкретного объекта A = Double, B = Double
//    // val coords = GenericPair<Double, Double>(55.7879, 49.1233)
//    // компилятор сам может выводить типы A и B:
//    // val coords = GenericPair(55.7879, 49.1233)
//    // для этого конкретного объекта A = String, B = GenericPair<Double, Double>
//    // val city = GenericPair("Kazan", coords)
//}
//
//open class Parent
//class Child : Parent()
//class GenericPair<A, B>(var first: A, var second: B)
//
////fun main() {
////    val child: GenericPair<Child, Child> = GenericPair(Child(), Child())
////    val parent: GenericPair<out Parent, out Parent> = child
////    val first = parent.first
////    parent.first = Child()
////}
//
//
//fun main() {
//    val parent: GenericPair<Parent, Parent> = GenericPair(Parent(), Parent())
//    val child: GenericPair<in Child, in Child> = parent
//    child.first = Child()
//    val first = child.first // Any?
//}

fun main() {
    val immutable = listOf(
            Post(
                    id = 1,
                    authorId = 1,
                    authorName = "Нетология",
                    content = "Новая Нетология",
                    created = 1590075360
            ),
            Post(
                    id = 1,
                    authorId = 1,
                    authorName = "Нетология",
                    content = "Новая Нетология",
                    created = 1590075360
            )
    )
    val mutable = mutableListOf(
            Post(
                    id = 1,
                    authorId = 1,
                    authorName = "Нетология",
                    content = "Новая Нетология",
                    created = 1590075360
            )
    )
}


public fun <T> listOf(vararg elements: T): List<T> =
        if (elements.size > 0) elements.asList() else emptyList()

