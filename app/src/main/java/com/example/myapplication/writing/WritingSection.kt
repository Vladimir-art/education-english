package com.example.myapplication.writing

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.myapplication.PreparingSections
import com.example.myapplication.R

class WritingSection : AppCompatActivity() {
    private lateinit var backButtonWritingSection: ImageButton;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_writing_section)

        backButtonWritingSection = findViewById(R.id.back_to_preparing_section_menu_button)
        backButtonWritingSection.setOnClickListener {
            openPreparingSection();
        }
    }

    private fun openPreparingSection() {
        var preparingSectionIntent = Intent(this, PreparingSections::class.java)
        startActivity(preparingSectionIntent)
    }
}