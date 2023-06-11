package com.example.myapplication.grammar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.myapplication.PreparingSections
import com.example.myapplication.R

class GrammarSection : AppCompatActivity() {
    private lateinit var backToPreparingsection: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grammar_section)

        backToPreparingsection = findViewById(R.id.back_sections_menu_from_grammar_section_button)

        backToPreparingsection.setOnClickListener {
            backToPreparingSection()
        }
    }

    private fun backToPreparingSection() {
        var preparingSectionIntent = Intent(this, PreparingSections::class.java)
        startActivity(preparingSectionIntent)
    }
}