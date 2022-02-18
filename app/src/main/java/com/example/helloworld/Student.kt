package com.example.helloworld

class Student(val sno: String,val grade: Int,name: String,age: Int): Person(name,age),Study {
    init {
        println("sno is " + sno)
        println("grade is " + grade)
    }
    constructor(name: String,age: Int): this("",0,name,age)
    constructor(): this("",0)

    override fun readBooks() {
        println(name + " is reading book")
    }

//    override fun doHomework() {
//        println(name + " is doing homework")
//    }

}

//class Student: Person{
//    constructor(name: String,age: Int): super(name,age){
//        println(name + " is eating.he is " + age + " old")
//    }
//}