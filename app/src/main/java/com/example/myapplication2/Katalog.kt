package com.example.myapplication2

class Katalog< k : WildAnimal >
{
    val animals: ArrayList<WildAnimal> = arrayListOf(
        Lion(23,"Лев",65,4),
        Fox(20,"Лиса",38,4),
        Tiger(300,"Тигр",45,4),
        Bear(60,"Медведь",76,4),
        Wolf(30,"Волк",52,4,Meat()),
        Leopard(70,"Леопард",59,4)
    )
}