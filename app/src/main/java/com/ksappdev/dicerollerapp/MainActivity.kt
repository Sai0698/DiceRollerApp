package com.ksappdev.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //First we find a button and call Roll dice function
        val button: Button = findViewById(R.id.BTroll)
        button.setOnClickListener { rolldice() }
    }

    private fun rolldice() {
//        created instance and call class function
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val textview: TextView = findViewById(R.id.TvDisplay)
        textview.text = diceRoll.toString()

    }
}

class Dice(private val numslides: Int) {
    fun roll(): Int {
        return (1..numslides).random()
    }

}