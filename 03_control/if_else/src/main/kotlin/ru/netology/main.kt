package ru.netology

fun main() {
    val itemPrice = 100
    val itemCount = 11
    val discount = 100
    val discountStart = 1_000

//    var totalPrice = itemPrice * itemCount
//    if (totalPrice >= discountStart) {
//        totalPrice -= discount
//    }
//    println("Total Price: $totalPrice")

//    val totalPrice = itemPrice * itemCount
//    val result = if (totalPrice > discountStart) totalPrice - discount else totalPrice
//    println("Total Price: $result")

    val totalPrice = itemPrice * itemCount
    val result = if (totalPrice > discountStart) {
        println("INFO: add discount")
        totalPrice - discount
    } else {
        println("INFO: no discount")
        totalPrice
    }
    println("Total Price: $result")
}



