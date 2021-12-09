package com.example.myapplication2

object SingletonCollection {

    var animalCollection: ArrayList<WildAnimal> = arrayListOf(
        Lion(23,34,"Лев",56,4),
        Fox("Оранжевый",20,"Лиса",43,4),
        Tiger(300,40,"Тигр",45,4),
        Bear(6,60,"Медведь",47,4),
        Wolf("Серый",30,"Волк",40,4,Meat()),
        Leopard("Жёлтый",70,"Леопард",52,4)

    )
}