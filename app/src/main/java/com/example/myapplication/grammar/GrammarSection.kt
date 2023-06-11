package com.example.myapplication.grammar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.myapplication.PreparingSections
import com.example.myapplication.R
import com.example.myapplication.utils.StartTextSizeAnimation

class GrammarSection : AppCompatActivity() {
    private lateinit var backToPreparingsection: ImageButton
    private lateinit var openGrammarSectionTask1: Button
    private lateinit var openGrammarSectionTask2: Button
    private lateinit var startTextSizeAnimation: StartTextSizeAnimation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grammar_section)

        backToPreparingsection = findViewById(R.id.back_sections_menu_from_grammar_section_button)
        openGrammarSectionTask1 = findViewById(R.id.grammar_section_task_1_button)
        openGrammarSectionTask2 = findViewById(R.id.grammar_section_task_2_button)
        startTextSizeAnimation = StartTextSizeAnimation(resources)

        backToPreparingsection.setOnClickListener {
            backToPreparingSection()
        }
        openGrammarSectionTask1.setOnClickListener {
            startTextSizeAnimation.start(openGrammarSectionTask1)
            openGrammarSectionTask1()
        }
        openGrammarSectionTask2.setOnClickListener {
            startTextSizeAnimation.start(openGrammarSectionTask2)
            openGrammarSectionTask2()
        }
    }

    private fun backToPreparingSection() {
        var preparingSectionIntent = Intent(this, PreparingSections::class.java)
        startActivity(preparingSectionIntent)
    }

    private fun openGrammarSectionTask1() {
        var grammarSectionTask1Intent = Intent(this, GrammarSectionTask1::class.java)
        startActivity(grammarSectionTask1Intent)
    }

    private fun openGrammarSectionTask2() {
        var grammarSectionTask2Intent = Intent(this, GrammarSectionTask2::class.java)
        startActivity(grammarSectionTask2Intent)
    }
}