package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var descTextView: TextView
    lateinit var textViewKatalog: TextView
    var firstClick = true
    var iteration = 0
    var katalog: Katalog<WildAnimal> = Katalog()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add()
//        next()
//        previous()
        delete()
        display()
        description()
    }

    fun display(){
        textViewKatalog = findViewById(R.id.textVIewKatalogDesc)
        var katalogText = ""
        for (animal in katalog.animals){
            katalogText = katalogText.plus(getInfo(animal))

        }
        textViewKatalog.text = katalogText

    }

    fun getInfo(AnimalCol: WildAnimal): String {
        var result = ""
        when (val animal: WildAnimal = AnimalCol) {
            is Tiger -> {
                result = animal.name + "\n"
            }
            is Lion -> {
                result = animal.name + "\n"
            }
            is Leopard -> {
                result = animal.name + "\n"
            }
            is Bear -> {
                result = animal.name + "\n"
            }
            is Fox -> {
                result = animal.name + "\n"
            }
            is Wolf -> {
                result = animal.name + "\n"
            }
        }
        return result
    }

    fun add() {
        val addButton = findViewById<Button>(R.id.buttonAdd)
        descTextView = findViewById(R.id.DescTextView)
        addButton.setOnClickListener {
        if(iteration < katalog.animals.size){
            SingletonCollection.animalCollection.add(katalog.animals[0])
        }
           // descTextView.text = "Животное добавлено!"
        }
        display()
    }

//    fun next() {
//        val nextButton = findViewById<Button>(R.id.buttonNext)
//        nextButton.setOnClickListener {
//            if (SingletonCollection.animalCollection.size > 0) {
//                if (firstClick) {
//                    description(0)
//                    firstClick = false
//                } else {
//                    if (iteration < SingletonCollection.animalCollection.size - 1) {
//                        iteration++
//                        description(iteration)
//                    } else {
//                        description(0)
//                        iteration = 0
//                    }
//                }
//            }
//        }
//    }

//    fun previous() {
//        val previousButton = findViewById<Button>(R.id.buttonPrevious)
//        previousButton.setOnClickListener {
//            if (SingletonCollection.animalCollection.size > 0) {
//                if (firstClick) {
//                    description(0)
//                    firstClick = false
//                } else {
//                    if (iteration == 0) {
//                        iteration = SingletonCollection.animalCollection.size - 1
//                        description(iteration)
//                    } else {
//                        iteration -= 1
//                        description(iteration)
//                    }
//                }
//            }
//        }
//
//    }

    fun description() {
        descTextView = findViewById(R.id.DescTextView)
        var text = ""
        for (animal in SingletonCollection.animalCollection) {
            when (animal) {
                is Lion -> {
                    text = text.plus(animal.getLion() + "\n")
                }
                is Tiger -> {
                    text = text.plus(animal.getTiger() + "\n")
                }
                is Fox -> {
                    text = text.plus(animal.getFox() + "\n")
                }
                is Bear -> {
                    text = text.plus(animal.getBear() + "\n")
                }
                is Wolf -> {
                    text = text.plus(animal.geWolf() + "\n")
                }
                is Leopard -> {
                    text = text.plus(animal.getLeopard() + "\n")
                }
            }
            descTextView.text = text
        }
    }

    fun delete() {
        descTextView = findViewById(R.id.DescTextView)
        val deleteButton = findViewById<Button>(R.id.deleteButton)
        deleteButton.setOnClickListener {
            if (SingletonCollection.animalCollection.size > 0 && SingletonCollection.animalCollection.isNotEmpty()) {
                SingletonCollection.animalCollection.removeAt(iteration)
            }
            descTextView.text = ""

        }
    }

}
