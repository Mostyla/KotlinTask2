package com.example.myapplication2

class Bear(speed: Int, name: String, countOfTeeth: Int, countOfPaws: Int):WildAnimal(speed, name, countOfTeeth,
    countOfPaws)
{
    var timeToSleep: Int = 0
    set(timeToSleep){
        if (timeToSleep > 0) {
            field = timeToSleep
        } else {
            field = 10
        }
    }
    get() = field
}