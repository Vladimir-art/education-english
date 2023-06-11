package com.example.myapplication.grammar

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TableRow
import androidx.core.content.ContextCompat
import com.example.myapplication.R
import com.example.myapplication.utils.VerifyGrammarSectionAnswer
import kotlin.properties.Delegates

class GrammarSectionTask1 : AppCompatActivity() {
    private lateinit var backGrammarSection: ImageButton
    private lateinit var editTextTask1A: EditText
    private lateinit var task1ARow: TableRow
    private lateinit var task1BRow: TableRow
    private lateinit var task1CRow: TableRow
    private var rightColorText by Delegates.notNull<Int>()
    private var wrongColorText by Delegates.notNull<Int>()
    private var rightColorBackground by Delegates.notNull<Int>()
    private lateinit var verifyAnswer: VerifyGrammarSectionAnswer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grammar_section_task1)

        backGrammarSection = findViewById(R.id.back_grammar_sections_menu_from_task_1_button)
        editTextTask1A = findViewById(R.id.grammar_section_task_1_A_answer)
        task1ARow = findViewById(R.id.grammar_section_task_1_A_row)
        task1BRow = findViewById(R.id.grammar_section_task_1_B_row)
        task1CRow = findViewById(R.id.grammar_section_task_1_C_row)
        rightColorText = ContextCompat.getColor(this, R.color.medium_sea_green)
        wrongColorText = ContextCompat.getColor(this, R.color.medium_violet_red)
        rightColorBackground = ContextCompat.getColor(this, R.color.opacity_medium_sea_green)
        verifyAnswer = VerifyGrammarSectionAnswer(this)

        backGrammarSection.setOnClickListener {
            openGrammarSection()
        }

        editTextTask1A.setOnEditorActionListener { _, actionId, _ ->
            val rightAnswer = getString(R.string.grammar_section_exercise_A_answer)
            verifyAnswer.verify(actionId, editTextTask1A, rightAnswer, task1ARow)
        }
    }

    private fun openGrammarSection() {
        var grammarSectionIntent = Intent(this, GrammarSection::class.java)
        startActivity(grammarSectionIntent)
    }
}
