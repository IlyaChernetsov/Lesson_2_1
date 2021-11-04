package com.example.lesson_2_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity2 : AppCompatActivity() {
    companion object {
        val TOTAL_COUNT = "TOTAL_COUNT"
        var RANDOM_CONST:Int = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        ShowRandomNumber()
    }

    fun ShowRandomNumber() {
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        val random = Random()
        var randomInt: Int = 0
        if (count > 0)
            randomInt = random.nextInt(count + 1)
        RANDOM_CONST = randomInt
        val text_Random: TextView = findViewById(R.id.text_Random)
        text_Random.text = randomInt.toString()
        val text_Initial_main2: TextView = findViewById(R.id.text_Initial_main2)
        text_Initial_main2.text = getString(R.string.it_s_random_number,count)
    }

    fun SendBack(view: View){
        val randomIntent = Intent(this, MainActivity::class.java)
        randomIntent.putExtra(MainActivity.STR_FROM_SEC, RANDOM_CONST)
        startActivity(randomIntent)
    }
}