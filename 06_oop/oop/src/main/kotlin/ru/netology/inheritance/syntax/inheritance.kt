package ru.netology.inheritance.syntax

//open class Parent(val parentProp: String)
//
//class Child (prop: String, val ownProp: String) : Parent(prop)

//open class Parent(open val prop: String)
//open class Child (final override val prop: String) : Parent(prop)
//class GrandChild (override val prop: String) : Child(prop)

open class Parent(open val prop: String) {
    val value = prop.toUpperCase()

    init {
        println(value)
    }
}

class Child: Parent("") {
    override val prop = "Child"
}





