package com.example.helloworld

import kotlin.math.max
var content: String? = "hello"

fun main(){
//    println("Hello Kotlin!")
//    val a = 10
//    var a = 10
//    a = a * 10
//    println("a = " + a)
//    val a = 37
//    val b = 40
//    val number = largeNumber(a,b)
//    println("large number is " + number)
//    println(getScore("Tom"))
//    val a = 10L
//    checkNum(a)
//    println(getScore("Tom11"))
//    for (i in 10 downTo 1){
//        println(i)
//    }
//    val p = Person()
//    p.name = "Jack"
//    p.age = 19
//    p.eat()

//    val student1 = Student()
//    val student2 = Student("Jack",19)
//    val student = Student("a123",5,"Jack",19)

//    val student = Student("Jack",19)
//    doStudy(null)
//    val cell1 = CellPhone("SamSung",1299.99)
//    val cell2 = CellPhone("SamSung",1299.99)
//    println(cell1 == cell2)
//    Singleton.name = "dsfs"
//    Singleton.singletonTest()

//    val list = listOf("Apple","Banana","Orange","Pear","Grape")
//    val list = mutableListOf("Apple","Banana","Orange","Pear","Grape")
//    list.add("Watermelon")
//    val list = setOf("Apple","Banana","Orange","Pear","Grape")
//    for (fruit in list) {
//        println(fruit)
//    }
//    val map = mapOf("Apple" to 1,"Banana" to 2,"Orange" to 3,"Pear" to 4,"Grape" to 5)
//    for ((fruit, number) in map) {
//        println(fruit + " " + number)
//    }
//    val list = listOf("Apple","Banana","Orange","Pear","Grape")
//    val max = list.maxByOrNull { it.length }
//    println(max)
//    val map = list.map { it.uppercase() }
//    map.forEach { println(it) }
//    val map = list.filter { it.length <= 5 }.map { it.uppercase() }
//    map.forEach { println(it) }
//    val any = list.any { it.length < 5 }
//    val all = list.all { it.length < 5 }
//    println("$any $all")
//    Thread{
//        println("Thread is running")
//    }.start()
    if(content != null){
        printUpperCase()
    }
}
fun printUpperCase(){
    val upperCase = content!!.uppercase()
    println(upperCase)
}

fun doStudy(study: Study?){
    study?.doHomework()
    study?.readBooks()
}

fun getTextLength(text: String?) = text?.length ?: 0

//fun largeNumber(num1: Int,num2: Int): Int{
//    return max(num1,num2)
//}
//fun largeNumber(num1: Int,num2: Int) = max(num1,num2)
//fun largeNumber(num1: Int,num2: Int) = if(num1 > num2) num1 else num2

//fun getScore(name: String) = when(name){
//    "Tom" -> 86
//    "Jim" -> 77
//    "Jack" -> 95
//    "Lily" -> 100
//    else -> 0
//}

//fun checkNum(num: Number){
//    when(num){
//        is Int -> println("It is Int")
//        is Double -> println("It is Double")
//        else -> println("Not Support")
//    }
//}

fun getScore(name: String) = when{
    name.startsWith("Tom") -> 86
    name == "Jim" -> 77
    name == "Jack" -> 95
    name == "Lily" -> 100
    else -> 0
}
