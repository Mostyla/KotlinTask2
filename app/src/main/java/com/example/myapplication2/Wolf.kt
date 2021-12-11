package com.example.myapplication2

class Wolf(speed: Int, name: String, countOfTeeth: Int, countOfPaws: Int, meat: Meat):WildAnimal(speed, name, countOfTeeth,
    countOfPaws)
{
    var coatColor: String? = null
    set(value){
        if (value == null) {
            field = value
        } else {
            field = "Серый"
        }
    }
    get() = field
}