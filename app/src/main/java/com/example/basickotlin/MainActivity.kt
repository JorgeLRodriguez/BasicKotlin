package com.example.basickotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variablesAndConstants()
    }

    /* example comment */

    private fun variablesAndConstants(){
        //variables

        //CamelCase
        var myVariable = "Hello Kotlin"
        var myNumber = 1;
        var myAnotherVariable = "Second String Variable"


        //Constant
        val myConstant = "My first constant"
        val mySecondConstant = myAnotherVariable

        println(myVariable)
        myVariable = "New Value"
        println(myVariable)
        println(myAnotherVariable)
        println("$myVariable $myAnotherVariable")

        println( myConstant)
        println(mySecondConstant)
    }
}