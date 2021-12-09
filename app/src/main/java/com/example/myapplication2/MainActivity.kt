package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add()
        next()
        previous()
        delete()
    }


    val addButton = findViewById<Button>(R.id.buttonAdd)
    val previousButton = findViewById<Button>(R.id.buttonPrevious)
    val nextButton = findViewById<Button>(R.id.buttonNext)
    var descTextView = findViewById<TextView>(R.id.DescTextView)
    var firstClick = true
    var iteration = 0


    fun add() {
        addButton.setOnClickListener {
            SingletonCollection.animalCollection.add(Leopard("Жёлтый", 80, "Лео", 65, 4))
            descTextView.text = "Животное добавлено!"
        }
    }

    fun next() {
        nextButton.setOnClickListener {
            if (SingletonCollection.animalCollection.size > 0) {
                if (firstClick) {
                    description(0)
                    firstClick = false
                } else {
                    if (iteration < SingletonCollection.animalCollection.size - 1) {
                        iteration++
                        description(iteration)
                    } else {
                        description(0)
                        iteration = 0
                    }
                }
            }
        }
    }

    fun previous() {
        previousButton.setOnClickListener {
            if (SingletonCollection.animalCollection.size > 0) {
                if (firstClick) {
                    description(0)
                    firstClick = false
                } else {
                    if (iteration == 0) {
                        iteration = SingletonCollection.animalCollection.size - 1
                        description(iteration)
                    } else {
                        iteration -= 1
                        description(iteration)
                    }
                }
            }
        }

    }

    fun description(num: Int) {
        val animal: WildAnimal = SingletonCollection.animalCollection[num]
        when (animal) {
            is Lion -> descTextView.text = animal.getLion()
            is Tiger -> descTextView.text = animal.getTiger()
            is Fox -> descTextView.text = animal.getFox()
            is Bear -> descTextView.text = animal.getBear()
            is Wolf -> descTextView.text = animal.geWolf()
            is Leopard -> descTextView.text = animal.getLeopard()
        }
    }

    fun delete() {
        val deleteButton = findViewById<Button>(R.id.deleteButton)
        deleteButton.setOnClickListener {
            descTextView = findViewById(R.id.DescTextView)
            if (SingletonCollection.animalCollection.size > 0 && SingletonCollection.animalCollection.isNotEmpty()) {
                SingletonCollection.animalCollection.removeAt(iteration)
            }
            descTextView.text = ""

        }
    }

}
