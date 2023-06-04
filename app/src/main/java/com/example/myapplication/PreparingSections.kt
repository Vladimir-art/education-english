package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.reading.ReadingSection
import com.example.myapplication.utils.StartTextSizeAnimation
import com.example.myapplication.writing.WritingSection

class PreparingSections : AppCompatActivity() {
    private lateinit var backMainMenuButton: ImageButton
    private lateinit var goReadingSection: TextView
    private lateinit var goListeningSection: TextView
    private lateinit var goSpeakingSection: TextView
    private lateinit var goGrammarSection: TextView
    private lateinit var goWritingSection: TextView
    private lateinit var startTextSizeAnimation: StartTextSizeAnimation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preparing_sections)

        backMainMenuButton = findViewById(R.id.back_main_menu_button);
        goReadingSection = findViewById(R.id.textView_reading)
        goListeningSection = findViewById(R.id.textView_listening)
        goSpeakingSection = findViewById(R.id.textView_speaking)
        goGrammarSection = findViewById(R.id.textView_grammar)
        goWritingSection = findViewById(R.id.textView_writing)
        startTextSizeAnimation = StartTextSizeAnimation(resources)

        backMainMenuButton.setOnClickListener{
            openMainMenuSection();
        }
        goReadingSection.setOnClickListener {
            startTextSizeAnimation.start(goReadingSection)
            openReadingSection();
        }
        goListeningSection.setOnClickListener {
            startTextSizeAnimation.start(goListeningSection)
            openListeningSection();
        }
        goSpeakingSection.setOnClickListener {
            startTextSizeAnimation.start(goSpeakingSection)
            openSpeakingSection();
        }
        goGrammarSection.setOnClickListener {
            startTextSizeAnimation.start(goGrammarSection)
            openGrammarSection();
        }
        goWritingSection.setOnClickListener {
            startTextSizeAnimation.start(goWritingSection)
            openWritingSection();
        }
    }

    private final fun openMainMenuSection() {
        val mainMenuSectionIntent = Intent(this, MainActivity::class.java);
        startActivity(mainMenuSectionIntent);
    }

    private final fun openReadingSection() {
        // TODO: add Reading section class
//        val readingSectionIntent = Intent(this, ReadingSection::class.java);
//        startActivity(readingSectionIntent);
    }
    private final fun openListeningSection() {
        // TODO: add Listening section class
//        val readingSectionIntent = Intent(this, MainActivity::class.java);
//        startActivity(readingSectionIntent);
    }
    private final fun openSpeakingSection() {
        // TODO: add Speaking section class
//        val readingSectionIntent = Intent(this, MainActivity::class.java);
//        startActivity(readingSectionIntent);
    }
    private final fun openGrammarSection() {
        // TODO: add Grammar section class
//        val readingSectionIntent = Intent(this, MainActivity::class.java);
//        startActivity(readingSectionIntent);
    }
    private final fun openWritingSection() {
        val writingSectionIntent = Intent(this, WritingSection::class.java);
        startActivity(writingSectionIntent);
    }
}