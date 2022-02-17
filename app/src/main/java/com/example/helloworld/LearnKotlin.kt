package com.example.helloworld

import kotlin.math.max

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

    val student = Student("Jack",19)

}

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
