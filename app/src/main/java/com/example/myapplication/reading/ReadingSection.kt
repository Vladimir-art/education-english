package com.example.myapplication.reading
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.example.myapplication.utils.StartTextSizeAnimation
class ReadingSection : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_section_reading)
        val back = findViewById<ImageButton>(R.id.back_sections_menu_button)
        val task1Button = findViewById<Button>(R.id.reading_section_task_1_button)
        val task2Button = findViewById<Button>(R.id.reading_section_task_2_button)
        val task3Button = findViewById<Button>(R.id.reading_section_task_3_button)
        val startTextSizeAnimation = StartTextSizeAnimation(resources)
        task1Button.setOnClickListener {
            startTextSizeAnimation.start(task1Button)
            openReadingTask1();
        }
        task2Button.setOnClickListener {
            startTextSizeAnimation.start(task2Button)
            openReadingTask2();
        }
        task3Button.setOnClickListener {
            startTextSizeAnimation.start(task2Button)
            openReadingTask3();
        }
    }

    private fun openReadingTask1() {
        TODO("Not yet implemented")
        val readingTask1Intent = Intent(this, ReadingTask1::class.java);
        startActivity(readingTask1Intent);
    }

    private fun openReadingTask2() {
        TODO("Not yet implemented")
        val readingTask2Intent = Intent(this, ReadingTask2::class.java);
        startActivity(readingTask2Intent);
    }

    private fun openReadingTask3() {
        TODO("Not yet implemented")
        val readingTask3Intent = Intent(this, ReadingTask3::class.java);
        startActivity(readingTask3Intent);

    }
}