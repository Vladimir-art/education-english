package com.example.myapplication.grammar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TableRow
import com.example.myapplication.R
import com.example.myapplication.utils.VerifyGrammarSectionAnswer

class GrammarSectionTask2 : AppCompatActivity() {
    private lateinit var backGrammarSection: ImageButton
    private lateinit var editTextTask2A: EditText
    private lateinit var editTextTask2B: EditText
    private lateinit var editTextTask2C: EditText
    private lateinit var task2ARow: TableRow
    private lateinit var task2BRow: TableRow
    private lateinit var task2CRow: TableRow
    private lateinit var verifyAnswer: VerifyGrammarSectionAnswer
    private lateinit var rightAnswerTask2A: String
    private lateinit var rightAnswerTask2B: String
    private lateinit var rightAnswerTask2C: String
    private lateinit var keyTask2A: ImageButton
    private lateinit var keyTask2B: ImageButton
    private lateinit var keyTask2C: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grammar_section_task2)

        backGrammarSection = findViewById(R.id.back_grammar_sections_menu_from_task_2_button)
        editTextTask2A = findViewById(R.id.grammar_section_task_2_A_answer)
        editTextTask2B = findViewById(R.id.grammar_section_task_2_B_answer)
        editTextTask2C = findViewById(R.id.grammar_section_task_2_C_answer)
        task2ARow = findViewById(R.id.grammar_section_task_2_A_row)
        task2BRow = findViewById(R.id.grammar_section_task_2_B_row)
        task2CRow = findViewById(R.id.grammar_section_task_2_C_row)
        keyTask2A = findViewById(R.id.grammar_section_task_2_A_imageButton)
        keyTask2B = findViewById(R.id.grammar_section_task_2_B_imageButton)
        keyTask2C = findViewById(R.id.grammar_section_task_2_C_imageButton)

        verifyAnswer = VerifyGrammarSectionAnswer(this)
        rightAnswerTask2A = getString(R.string.grammar_section_task_2_exercise_A_answer)
        rightAnswerTask2B = getString(R.string.grammar_section_task_2_exercise_B_answer)
        rightAnswerTask2C = getString(R.string.grammar_section_task_2_exercise_C_answer)

        backGrammarSection.setOnClickListener {
            openGrammarSection()
        }
        editTextTask2A.setOnEditorActionListener { _, actionId, _ ->
            verifyAnswer.verify(actionId, editTextTask2A, rightAnswerTask2A, task2ARow)
        }
        editTextTask2B.setOnEditorActionListener { _, actionId, _ ->
            verifyAnswer.verify(actionId, editTextTask2B, rightAnswerTask2B, task2BRow)
        }
        editTextTask2C.setOnEditorActionListener { _, actionId, _ ->
            verifyAnswer.verify(actionId, editTextTask2C, rightAnswerTask2C, task2CRow)
        }

        keyTask2A.setOnClickListener {
            verifyAnswer.prompt(editTextTask2A, rightAnswerTask2A)
        }
        keyTask2B.setOnClickListener {
            verifyAnswer.prompt(editTextTask2B, rightAnswerTask2B)
        }
        keyTask2C.setOnClickListener {
            verifyAnswer.prompt(editTextTask2C, rightAnswerTask2C)
        }
    }

    private fun openGrammarSection() {
        var grammarSectionIntent = Intent(this, GrammarSection::class.java)
        startActivity(grammarSectionIntent)
    }
}