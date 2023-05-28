package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var startPrepareButton: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startPrepareButton = findViewById(R.id.start_preparing_button);
        startPrepareButton.setOnClickListener{
            startPrepareButton.isSelected = !startPrepareButton.isSelected;

        }
    }
}