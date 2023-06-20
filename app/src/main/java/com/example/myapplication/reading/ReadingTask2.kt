package com.example.myapplication.reading

import android.animation.AnimatorInflater
import android.content.Intent
import android.content.res.ColorStateList
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.myapplication.R
import com.example.myapplication.utils.StartTextSizeAnimation

class ReadingTask2 : AppCompatActivity() {
    private lateinit var btnShowQuestions: Button
    private lateinit var textTask2Questions: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reading_task2)
        val backButton = findViewById<ImageButton>(R.id.back_reading_section_button)
        btnShowQuestions = findViewById(R.id.reading_task_2_check_answer)
        textTask2Questions = findViewById(R.id.reading_section_answers_textView2)
        AnimatorInflater.loadAnimator(this, R.animator.button_scale)
        AnimatorInflater.loadAnimator(this, R.animator.button_alpha)
        var isButtonClicked = false
        backButton.setOnClickListener {
            openReadingSection()
        }
        btnShowQuestions.setOnClickListener {
            if (isButtonClicked) {
                setInactiveColorElement(btnShowQuestions)
                textTask2Questions.visibility = View.GONE
            } else {
                setActiveColorElement(btnShowQuestions)
                textTask2Questions.visibility = View.VISIBLE
            }
            isButtonClicked = !isButtonClicked
        }
    }
    private fun <T : View> setActiveColorElement(element: T) {
        element.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(this, R.color.opacity_medium_violet_red))
    }
    private fun <T : View> setInactiveColorElement(element: T) {
        element.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(this, R.color.opacity_pale_violet_red))
    }
    private fun openReadingSection() {
        val readingSectionIntent = Intent(this, ReadingSection::class.java)
        startActivity(readingSectionIntent)
    }
}