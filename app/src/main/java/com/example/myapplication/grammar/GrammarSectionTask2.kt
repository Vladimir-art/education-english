package com.example.myapplication.grammar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.myapplication.R

class GrammarSectionTask2 : AppCompatActivity() {
    private lateinit var backGrammarSection: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grammar_section_task2)

        backGrammarSection = findViewById(R.id.back_grammar_sections_menu_from_task_2_button)

        backGrammarSection.setOnClickListener {
            openGrammarSection()
        }
    }

    private fun openGrammarSection() {
        var grammarSectionIntent = Intent(this, GrammarSection::class.java)
        startActivity(grammarSectionIntent)
    }
}