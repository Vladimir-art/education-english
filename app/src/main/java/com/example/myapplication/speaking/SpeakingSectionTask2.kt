package com.example.myapplication.speaking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.myapplication.R

class SpeakingSectionTask2 : AppCompatActivity() {
    private lateinit var backSpeakingSection: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_speaking_section_task2)
        backSpeakingSection = findViewById(R.id.back_speaking_sections_menu_from_task_2_button)

        backSpeakingSection.setOnClickListener {
            openSpeakingSection()
        }
    }

    private fun openSpeakingSection() {
        var speakingSectionIntent = Intent(this, SpeakingSection::class.java)
        startActivity(speakingSectionIntent)
    }
}