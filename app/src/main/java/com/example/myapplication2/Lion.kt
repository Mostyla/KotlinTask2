package com.example.myapplication2

class Lion(speed: Int, name: String, countOfTeeth: Int, countOfPaws: Int): WildAnimal(speed, name, countOfTeeth,
    countOfPaws)
{
    var tailLength: Int = 0
    set(tailLength){
        if (tailLength > 0) {
            field = tailLength
        } else {
            field = 150
        }
    }
    get() = field

}