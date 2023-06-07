package com.example.myapplication.speaking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.myapplication.PreparingSections
import com.example.myapplication.R
import com.example.myapplication.utils.StartTextSizeAnimation

class SpeakingSection : AppCompatActivity() {
    private lateinit var backToPreparingsection: ImageButton
    private lateinit var openSpeakingSectionTask1: Button
    private lateinit var openSpeakingSectionTask2: Button
    private lateinit var openSpeakingSectionTask3: Button
    private lateinit var startTextSizeAnimation: StartTextSizeAnimation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_speaking_section)

        backToPreparingsection = findViewById(R.id.back_sections_menu_from_speaking_section_button)
        openSpeakingSectionTask1 = findViewById(R.id.speaking_section_task_1_button)
        openSpeakingSectionTask2 = findViewById(R.id.speaking_section_task_2_button)
        openSpeakingSectionTask3 = findViewById(R.id.speaking_section_task_3_button)
        startTextSizeAnimation = StartTextSizeAnimation(resources)

        backToPreparingsection.setOnClickListener {
            backToPreparingSection()
        }
        openSpeakingSectionTask1.setOnClickListener {
            startTextSizeAnimation.start(openSpeakingSectionTask1)
            openSpeakingSectionTask1()
        }
        openSpeakingSectionTask2.setOnClickListener {
            startTextSizeAnimation.start(openSpeakingSectionTask2)
            openSpeakingSectionTask2()
        }
        openSpeakingSectionTask3.setOnClickListener {
            startTextSizeAnimation.start(openSpeakingSectionTask3)
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