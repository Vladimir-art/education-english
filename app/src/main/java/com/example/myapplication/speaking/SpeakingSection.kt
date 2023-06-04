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
    private lateinit var startTextSizeAnimation: StartTextSizeAnimation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_speaking_section)

        backToPreparingsection = findViewById(R.id.back_sections_menu_from_speaking_section_button)
        openSpeakingSectionTask1 = findViewById(R.id.speaking_section_task_1_button)
        startTextSizeAnimation = StartTextSizeAnimation(resources)

        backToPreparingsection.setOnClickListener {
            backToPreparingSection()
        }
        openSpeakingSectionTask1.setOnClickListener {
            startTextSizeAnimation.start(openSpeakingSectionTask1)
            openSpeakingSectionTask1()
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
}