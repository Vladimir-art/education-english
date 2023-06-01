package com.example.myapplication.writing

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.myapplication.PreparingSections
import com.example.myapplication.R

class WritingSection : AppCompatActivity() {
    private lateinit var backButtonWritingSection: ImageButton;
    private lateinit var task1WritingSection: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_writing_section)

        backButtonWritingSection = findViewById(R.id.back_to_preparing_section_menu_button)
        task1WritingSection = findViewById(R.id.writing_section_task_1_button)

        backButtonWritingSection.setOnClickListener {
            openPreparingSection();
        }
        task1WritingSection.setOnClickListener {
            openWritingSectionTask1()
        }
    }

    private fun openPreparingSection() {
        var preparingSectionIntent = Intent(this, PreparingSections::class.java)
        startActivity(preparingSectionIntent)
    }

    private fun openWritingSectionTask1() {
        var writingSectionTask1Intent = Intent(this, WritingSectionTask1::class.java)
        startActivity(writingSectionTask1Intent)
    }
}