package com.example.myapplication.writing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.myapplication.R

class WritingSectionTask2 : AppCompatActivity() {
    private lateinit var backToWritingSection: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_writing_section_task2)

        backToWritingSection = findViewById(R.id.back_writing_section_button_t2)
        backToWritingSection.setOnClickListener {
            openWritingSection()
        }
    }

    private fun openWritingSection() {
        var writingSectionIntent = Intent(this, WritingSection::class.java)
        startActivity(writingSectionIntent)
    }

}