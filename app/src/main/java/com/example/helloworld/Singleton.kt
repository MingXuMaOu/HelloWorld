package com.example.helloworld

object Singleton {
    lateinit var name: String
    fun singletonTest(){
        println("SingletonTest is called." + name)
    }
}