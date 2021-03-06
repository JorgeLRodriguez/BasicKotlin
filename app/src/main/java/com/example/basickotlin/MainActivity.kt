package com.example.basickotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //variablesAndConstants()
        //typeOfData()
        ifStatement()
    }

    /* example comment */

    //Variables and Constants
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

    //Type of Data
    private fun typeOfData(){
        //String
        val myString = "My String"
        val myString2 = "My Second String"
        val myString3 = myString + " " + myString2
        println(myString3)

        //Int (Byte, Short, Int, Long)
        val myInt = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        //Decimal (Float, Double)
        val myFloat : Float = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1
        val myDouble4 = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        //Boolean (Bool)
        val myBool = true
        val myBool2 = false
        println(myBool == myBool2)
        println(myBool && myBool2)
    }

    //If
    private fun ifStatement(){
        val myNumber = 60

        /*
        Conditional operators
        > greater than
        < less than
        >= greater or equal than
        <= less or equal than
        = equal than
        != different than
         */

        if(myNumber < 10){
            println("$myNumber is less than 10")
        }
        else{
            println("$myNumber is greater than 10")
        }

        /*
        Logical operators
        && "and" operator
        || "or" operator (Alt + 124)
        ! "no" operator
         */

        if (!(myNumber in 6..9 || myNumber == 53)){
            println("$myNumber is less than or equal to 10 and greater than 5 or equals 53")
        }
        else if(myNumber == 60){
            println("$myNumber equals 60")
        }
        else if(myNumber != 70){
            println("$myNumber is not the same as 70")
        }
        else {

            println("$myNumber es greater than 10 or less or equals 5 and is not the same as 53")
        }

    }
}