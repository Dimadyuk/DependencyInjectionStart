package com.example.dependencyinjectionstart.exampel1

class Activity {

   lateinit var computer: Computer
   lateinit var keyboard: Keyboard

   init {
       Component().inject(this)
   }
}