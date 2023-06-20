package com.example.myapplication.reading

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import com.example.myapplication.PreparingSections
import com.example.myapplication.R
import com.example.myapplication.utils.StartTextSizeAnimation
import android.animation.AnimatorInflater
import android.content.res.ColorStateList
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
class ReadingTask1 : AppCompatActivity() {
    private lateinit var btnShowQuestions: Button
    private lateinit var textTask1Questions: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reading_task1)
        val backButton = findViewById<ImageButton>(R.id.back_reading_section_button)
        btnShowQuestions = findViewById(R.id.reading_task_1_check_answer)
        textTask1Questions = findViewById(R.id.reading_section_answers_textView1)
        AnimatorInflater.loadAnimator(this, R.animator.button_scale)
        AnimatorInflater.loadAnimator(this, R.animator.button_alpha)
        var isButtonClicked = false
        backButton.setOnClickListener {
            openReadingSection()
        }
        btnShowQuestions.setOnClickListener {
            if (isButtonClicked) {
                setInactiveColorElement(btnShowQuestions)
                textTask1Questions.visibility = View.GONE
            } else {
                setActiveColorElement(btnShowQuestions)
                textTask1Questions.visibility = View.VISIBLE
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