package com.example.myapplication.utils

import android.content.Context
import android.graphics.Color
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.TableRow
import androidx.core.content.ContextCompat
import com.example.myapplication.R

class VerifyGrammarSectionAnswer(private val context: Context) {
    private var rightColorText: Int = 0
    private var wrongColorText: Int = 0
    private var rightColorBackground: Int = 0
    private var promptTextColor: Int = 0

    init {
        rightColorText = ContextCompat.getColor(context, R.color.medium_sea_green)
        wrongColorText = ContextCompat.getColor(context, R.color.medium_violet_red)
        rightColorBackground = ContextCompat.getColor(context, R.color.opacity_medium_sea_green)
        promptTextColor = ContextCompat.getColor(context, R.color.dark_purple)
    }

    fun verify(
        actionId: Int,
        editTextElement: EditText,
        rightAnswer: String,
        taskTableRow: TableRow
    ): Boolean {
        if (actionId == EditorInfo.IME_ACTION_DONE || actionId == EditorInfo.IME_NULL) {
            val enteredText = editTextElement.text.toString().lowercase()
            if (enteredText.isNotEmpty() && enteredText == rightAnswer) {
                editTextElement.setTextColor(rightColorText)
                taskTableRow.setBackgroundColor(rightColorBackground)
            }
            if (enteredText.isNotEmpty() && enteredText != rightAnswer) {
                taskTableRow.setBackgroundColor(Color.TRANSPARENT)
                editTextElement.setTextColor(wrongColorText)
            }
            return true
        } else {
            return false
        }
    }

    fun prompt(elem: EditText, rightAnswer: String) {
        elem.setText(rightAnswer)
        elem.setTextColor(promptTextColor)
    }
}