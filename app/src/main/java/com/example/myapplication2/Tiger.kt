package com.example.myapplication2

class Tiger(speed: Int, name: String,
            countOfTeeth: Int, countOfPaws: Int) : WildAnimal
    (speed, name, countOfTeeth,
    countOfPaws)
{
    val meat: Meat = Meat()

    var weight: Int = 0
        set(weight) {
            if (weight > 0) {
                field = weight
            } else {
                field = 300
            }
        }
        get() = field

}