package com.example.lesson_2_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.PackageManagerCompat.LOG_TAG

import android.util.Log
import androidx.core.content.PackageManagerCompat


class MainActivity : AppCompatActivity() {
    companion object {
        val STR_FROM_SEC = "STR_FROM_SEC"
        private val LOG_TAG: String = MainActivity::class.java.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startedValue()
        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");

    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
    }
    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "onStart")
    }
    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "onPause")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_TAG, "onRestart")
    }
    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "onResume")
    }
    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "onDestroy")
    }
    fun startedValue(){
        val count:Int = intent.getIntExtra(STR_FROM_SEC, 0)
        val temp:TextView = findViewById(R.id.textView)
        temp.text = count.toString()
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