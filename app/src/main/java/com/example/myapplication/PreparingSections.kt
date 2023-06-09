package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.grammar.GrammarSection
import com.example.myapplication.speaking.SpeakingSection
import com.example.myapplication.reading.ReadingSection
import com.example.myapplication.utils.StartTextSizeAnimation
import com.example.myapplication.writing.WritingSection
import com.example.myapplication.listening.ListeningSection

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
     val readingSectionIntent = Intent(this, ReadingSection::class.java);
        startActivity(readingSectionIntent);
    }
    private final fun openListeningSection() {
       val listeningSectionIntent = Intent(this, ListeningSection::class.java);
       startActivity(listeningSectionIntent);
    }
    private final fun openSpeakingSection() {
        val speakingSectionIntent = Intent(this, SpeakingSection::class.java);
        startActivity(speakingSectionIntent);
    }
    private final fun openGrammarSection() {
        val grammarSectionIntent = Intent(this, GrammarSection::class.java);
        startActivity(grammarSectionIntent);
    }
    private final fun openWritingSection() {
        val writingSectionIntent = Intent(this, WritingSection::class.java);
        startActivity(writingSectionIntent);
    }
}