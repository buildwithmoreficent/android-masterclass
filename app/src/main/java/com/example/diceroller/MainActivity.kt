package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AccelerateDecelerateInterpolator
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.Runnable
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    // add global variables here

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // setup views functionality here
    }

    private fun setOnClickListener() {

    }

    private fun setDiceNumber() {
        val number = (1..6).random() // use this random generated number
        // animate and rotate the view here

        // set dice text here through handler
    }

    private fun setupUi() {
        // fina Views By Ids here
    }
}