package com.example.clase

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}
 */

fun main(){

    print("Ingrese un numero: ")
    var n1 = readLine()!!.toInt()

    if(n1 in 1..10){
        print("el numero $n1 esta dentro del rango")
    }else{
        print("el numero no esta dentro del rango")
    }
    /*
    print("Ingrese una letra: ")
    var l1 = readLine()!!.toString().uppercase()
    var char = "a"

    //Pasos

     */
}