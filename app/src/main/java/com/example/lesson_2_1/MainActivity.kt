package com.example.lesson_2_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun counter(view: View) {
        val temp1: TextView = findViewById(R.id.textView)
        val temp2: String = temp1.text.toString()
        var count: Int = Integer.parseInt(temp2)
        count++
        temp1.text = count.toString()

    }

    fun makeZero(view: View) {
        val temp1: TextView = findViewById(R.id.textView)
        val temp2: Int = 0
        temp1.text = temp2.toString()
    }

    fun randomNumber(view: View) {
        val randomIntent = Intent(this, MainActivity2::class.java)
        val countView: TextView = findViewById(R.id.textView)
        val countString: String = countView.text.toString()
        val count = Integer.parseInt(countString)
        randomIntent.putExtra(MainActivity2.TOTAL_COUNT, count)
        startActivity(randomIntent)
    }
}