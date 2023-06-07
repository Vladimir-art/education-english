package com.example.myapplication.writing

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.myapplication.PreparingSections
import com.example.myapplication.R
import com.example.myapplication.utils.StartTextSizeAnimation

class WritingSection : AppCompatActivity() {
    private lateinit var backButtonWritingSection: ImageButton;
    private lateinit var task1WritingSection: Button;
    private lateinit var task2WritingSection: Button;
    private lateinit var startTextSizeAnimation: StartTextSizeAnimation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_writing_section)

        startTextSizeAnimation = StartTextSizeAnimation(resources)
        backButtonWritingSection = findViewById(R.id.back_to_preparing_section_menu_button)
        task1WritingSection = findViewById(R.id.writing_section_task_1_button)
        task2WritingSection = findViewById(R.id.writing_section_task_2_button)

        backButtonWritingSection.setOnClickListener {
            openPreparingSection();
        }
        task1WritingSection.setOnClickListener {
            startTextSizeAnimation.start(task1WritingSection)
            openWritingSectionTask1()
        }
        task2WritingSection.setOnClickListener {
            startTextSizeAnimation.start(task2WritingSection)
            openWritingSectionTask2()
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

    private fun openWritingSectionTask2() {
        var writingSectionTask2Intent = Intent(this, WritingSectionTask2::class.java)
        startActivity(writingSectionTask2Intent)
    }
}