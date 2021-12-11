package com.example.myapplication2

class Fox(speed: Int, name: String, countOfTeeth: Int, countOfPaws: Int):WildAnimal(speed, name, countOfTeeth,
    countOfPaws)
{
    var color: String = ""
    set(color){
        if(color == "") {
            field = color
        } else {
            field = "Оранжевый"
        }
    }
    get() = field
}