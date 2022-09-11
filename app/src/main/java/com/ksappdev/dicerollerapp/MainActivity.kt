package com.ksappdev.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

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
        val diceRoll1 = dice.roll()
        val diceRoll2 = dice.roll()
        val imageview: ImageView = findViewById(R.id.IVdisplay)
        val imageview2: ImageView = findViewById(R.id.IVdisplay2)

        val drawableset1 = when (diceRoll1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableset2 = when (diceRoll2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imageview.setImageResource(drawableset1)
        imageview2.setImageResource(drawableset2)

        imageview.contentDescription = diceRoll1.toString()
        imageview2.contentDescription = diceRoll2.toString()
    }


}

class Dice(private val numslides: Int) {
    fun roll(): Int {
        return (1..numslides).random()
    }

}