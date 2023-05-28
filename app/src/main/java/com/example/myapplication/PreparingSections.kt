package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.StartTextSizeAnimation

class PreparingSections : AppCompatActivity() {
    private lateinit var backMainMenuButton: ImageButton
    private lateinit var goReadingSection: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preparing_sections)

        backMainMenuButton = findViewById(R.id.back_main_menu_button);
        goReadingSection = findViewById(R.id.textView_reading)

        backMainMenuButton.setOnClickListener{
            openMainMenuSection();
        }
        goReadingSection.setOnClickListener {
            val startTextSizeAnimation = StartTextSizeAnimation(resources)
            startTextSizeAnimation.startTextSizeAnimation(goReadingSection, 3f)
            openReadingSection();
        }
    }

    private final fun openMainMenuSection() {
        val mainMenuSectionIntent = Intent(this, MainActivity::class.java);
        startActivity(mainMenuSectionIntent);
    }

    private final fun openReadingSection() {
        // TODO: add Reading section class
//        val readingSectionIntent = Intent(this, MainActivity::class.java);
//        startActivity(readingSectionIntent);
    }
}