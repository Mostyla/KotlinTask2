package com.example.myapplication2

class Leopard(speed: Int, name: String, countOfTeeth: Int, countOfPaws: Int):WildAnimal(speed, name, countOfTeeth,
    countOfPaws)
{
    var eyeColor: String = ""
    set(value){
        if (value == "") {
            field = value
        } else {
            field = "Жёлтый"
        }
    }
    get() = field
}