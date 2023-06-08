package com.example.myapplication.listening

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.myapplication.PreparingSections
import com.example.myapplication.R
import com.example.myapplication.speaking.SpeakingSectionTask1
import com.example.myapplication.speaking.SpeakingSectionTask2
import com.example.myapplication.speaking.SpeakingSectionTask3
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
        var speakingSectionTask1Intent = Intent(this, SpeakingSectionTask1::class.java)
        startActivity(speakingSectionTask1Intent)
    }

    private fun openSpeakingSectionTask2() {
        var speakingSectionTask2Intent = Intent(this, SpeakingSectionTask2::class.java)
        startActivity(speakingSectionTask2Intent)
    }

    private fun openSpeakingSectionTask3() {
        var speakingSectionTask3Intent = Intent(this, SpeakingSectionTask3::class.java)
        startActivity(speakingSectionTask3Intent)
    }
}

