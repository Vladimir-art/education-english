package com.example.myapplication.reading
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
class ReadingSection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_section_reading)
    }

    private final fun openReadingTask1() {
        val readingTask1Intent = Intent(this, ReadingTask1::class.java);
        startActivity(readingTask1Intent);
    }
}