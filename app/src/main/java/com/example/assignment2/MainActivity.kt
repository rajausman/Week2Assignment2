package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val addFoodET = findViewById<EditText>(R.id.addfood_et)
        val addFoodBtn = findViewById<Button>(R.id.addfood_btn)
        val decideBtn = findViewById<Button>(R.id.decide_btn)
        val foodSelectedTV = findViewById<TextView>(R.id.foodSelectedTV)

        val array: MutableList<String> = mutableListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")

        decideBtn.setOnClickListener {
            val randomIndex = Random.nextInt(array.size);
            val randomElement = array[randomIndex]
            foodSelectedTV.text = randomElement
        }

        addFoodBtn.setOnClickListener {
            if(addFoodET.text.isNotEmpty())
            addFoodET.text?.let {
                array.add(addFoodET.text.toString())
                addFoodET.text.clear()
            }
        }
    }
}