package com.example.myapplication.listening

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.myapplication.PreparingSections
import com.example.myapplication.R
//import com.example.myapplication.listening.ListeningSectionTask1
//import com.example.myapplication.listening.ListeningSectionTask2
//import com.example.myapplication.listening.ListeningSectionTask3
import com.example.myapplication.utils.StartTextSizeAnimation

class ListeningSection : AppCompatActivity() {
    private lateinit var backToPreparingsection: ImageButton
    private lateinit var openListeningSectionTask1: Button
    private lateinit var openListeningSectionTask2: Button
    private lateinit var openListeningSectionTask3: Button
    private lateinit var startTextSizeAnimation: StartTextSizeAnimation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listening_section)

        backToPreparingsection = findViewById(R.id.back_sections_menu_from_listening_button)
        openListeningSectionTask1 = findViewById(R.id.listening_section_button_T1)
        openListeningSectionTask2 = findViewById(R.id.listening_section_button_T2)
        openListeningSectionTask3 = findViewById(R.id.listening_section_button_T3)
        startTextSizeAnimation = StartTextSizeAnimation(resources)

        backToPreparingsection.setOnClickListener {
            backToPreparingSection()
        }
        openListeningSectionTask1.setOnClickListener {
            startTextSizeAnimation.start(openListeningSectionTask1)
            openSpeakingSectionTask1()
        }
        openListeningSectionTask2.setOnClickListener {
            startTextSizeAnimation.start(openListeningSectionTask2)
            openSpeakingSectionTask2()
        }
        openListeningSectionTask3.setOnClickListener {
            startTextSizeAnimation.start(openListeningSectionTask3)
            openSpeakingSectionTask3()
        }
    }

    private fun backToPreparingSection() {
        var preparingSectionIntent = Intent(this, PreparingSections::class.java)
        startActivity(preparingSectionIntent)
    }

    private fun openSpeakingSectionTask1() {
        var listeningSectionTask1Intent = Intent(this, ListeningSectionTask1::class.java)
        startActivity(listeningSectionTask1Intent)
    }

    private fun openSpeakingSectionTask2() {
        var listeningSectionTask2Intent = Intent(this, ListeningSectionTask2::class.java)
        startActivity(listeningSectionTask2Intent)
    }

    private fun openSpeakingSectionTask3() {
        var listeningSectionTask3Intent = Intent(this, ListeningSectionTask3::class.java)
        startActivity(listeningSectionTask3Intent)
    }
}

