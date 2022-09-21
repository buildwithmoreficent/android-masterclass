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

    private lateinit var tvDice: TextView
    private lateinit var button: Button
    private lateinit var cvDice: CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupUi()
        setOnClickListener()
    }

    private fun setOnClickListener() {
        button = findViewById(R.id.btn_roll)
        button.setOnClickListener {
            setDiceNumber()
        }
    }

    private fun setDiceNumber() {
        val number = (1..6).random()
        cvDice.animate().rotationBy((((10..360).random().toFloat()) * (30..60).random()))
            .setDuration(1000L)
            .setInterpolator(AccelerateDecelerateInterpolator())
            .start()

        Handler(Looper.getMainLooper()).postDelayed(Runnable {
               tvDice.text = number.toString()
        }, 500L)
    }

    private fun setupUi() {
        tvDice = findViewById(R.id.tv_dice)
        cvDice = findViewById(R.id.cv_dice)
    }
}