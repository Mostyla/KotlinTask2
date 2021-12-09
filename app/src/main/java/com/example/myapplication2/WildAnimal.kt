package com.example.myapplication2

open class WildAnimal(val speed: Int, val name: String, val countOfTeeth: Int, val countOfPaws: Int) {

  open fun run() {
      println("$name is running! ")
   }

   open fun eat(){
      println("$name is eating! ")
   }



}