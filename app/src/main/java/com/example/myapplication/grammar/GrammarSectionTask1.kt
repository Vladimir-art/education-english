package com.example.myapplication.grammar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TableRow
import com.example.myapplication.R
import com.example.myapplication.utils.VerifyGrammarSectionAnswer

class GrammarSectionTask1 : AppCompatActivity() {
    private lateinit var backGrammarSection: ImageButton
    private lateinit var editTextTask1A: EditText
    private lateinit var editTextTask1B: EditText
    private lateinit var editTextTask1C: EditText
    private lateinit var task1ARow: TableRow
    private lateinit var task1BRow: TableRow
    private lateinit var task1CRow: TableRow
    private lateinit var verifyAnswer: VerifyGrammarSectionAnswer
    private lateinit var rightAnswerTask1A: String
    private lateinit var rightAnswerTask1B: String
    private lateinit var rightAnswerTask1C: String
    private lateinit var keyTask1A: ImageButton
    private lateinit var keyTask1B: ImageButton
    private lateinit var keyTask1C: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grammar_section_task1)

        backGrammarSection = findViewById(R.id.back_grammar_sections_menu_from_task_1_button)
        editTextTask1A = findViewById(R.id.grammar_section_task_1_A_answer)
        editTextTask1B = findViewById(R.id.grammar_section_task_1_B_answer)
        editTextTask1C = findViewById(R.id.grammar_section_task_1_C_answer)
        task1ARow = findViewById(R.id.grammar_section_task_1_A_row)
        task1BRow = findViewById(R.id.grammar_section_task_1_B_row)
        task1CRow = findViewById(R.id.grammar_section_task_1_C_row)
        keyTask1A = findViewById(R.id.grammar_section_task_1_A_imageButton)
        keyTask1B = findViewById(R.id.grammar_section_task_1_B_imageButton)
        keyTask1C = findViewById(R.id.grammar_section_task_1_C_imageButton)

        verifyAnswer = VerifyGrammarSectionAnswer(this)
        rightAnswerTask1A = getString(R.string.grammar_section_exercise_A_answer)
        rightAnswerTask1B = getString(R.string.grammar_section_exercise_B_answer)
        rightAnswerTask1C = getString(R.string.grammar_section_exercise_C_answer)

        backGrammarSection.setOnClickListener {
            openGrammarSection()
        }

        editTextTask1A.setOnEditorActionListener { _, actionId, _ ->
            verifyAnswer.verify(actionId, editTextTask1A, rightAnswerTask1A, task1ARow)
        }
        editTextTask1B.setOnEditorActionListener { _, actionId, _ ->
            verifyAnswer.verify(actionId, editTextTask1B, rightAnswerTask1B, task1BRow)
        }
        editTextTask1C.setOnEditorActionListener { _, actionId, _ ->
            verifyAnswer.verify(actionId, editTextTask1C, rightAnswerTask1C, task1CRow)
        }

        keyTask1A.setOnClickListener {
            verifyAnswer.prompt(editTextTask1A, rightAnswerTask1A)
        }
        keyTask1B.setOnClickListener {
            verifyAnswer.prompt(editTextTask1B, rightAnswerTask1B)
        }
        keyTask1C.setOnClickListener {
            verifyAnswer.prompt(editTextTask1C, rightAnswerTask1C)
        }
    }

    private fun openGrammarSection() {
        var grammarSectionIntent = Intent(this, GrammarSection::class.java)
        startActivity(grammarSectionIntent)
    }
}
