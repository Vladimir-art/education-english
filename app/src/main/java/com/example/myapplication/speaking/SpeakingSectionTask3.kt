package com.example.myapplication.speaking

import android.animation.AnimatorInflater
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.myapplication.R

class SpeakingSectionTask3 : AppCompatActivity() {
    private lateinit var backSpeakingSection: ImageButton
    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var btnPlay: ImageButton
    private lateinit var btnPause: ImageButton
    private lateinit var btnStop: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_speaking_section_task3)

        backSpeakingSection = findViewById(R.id.back_speaking_sections_menu_from_task_3_button)
        mediaPlayer = MediaPlayer.create(this, R.raw.speaking_task_3)
        btnPlay = findViewById(R.id.speaking_section_task_3_play)
        btnPause = findViewById(R.id.speaking_section_task_3_pause)
        btnStop = findViewById(R.id.speaking_section_task_3_stop)
        val scaleAnimation = AnimatorInflater.loadAnimator(this, R.animator.button_scale)
        val alphaAnimation = AnimatorInflater.loadAnimator(this, R.animator.button_alpha)

        backSpeakingSection.setOnClickListener {
            openSpeakingSection()
        }
        btnPlay.setOnClickListener {
            scaleAnimation.setTarget(btnPlay)
            scaleAnimation.start()
            play()
        }
        btnPause.setOnClickListener {
            scaleAnimation.setTarget(btnPause)
            scaleAnimation.start()
            pause() }
        btnStop.setOnClickListener {
            alphaAnimation.setTarget(btnStop)
            alphaAnimation.start()
            stop() }
    }

    private fun openSpeakingSection() {
        var speakingSectionIntent = Intent(this, SpeakingSection::class.java)
        startActivity(speakingSectionIntent)
    }

    private fun play() {
        if (!mediaPlayer.isPlaying) {
            mediaPlayer.start()
        }
    }

    private fun pause() {
        if (mediaPlayer.isPlaying) {
            mediaPlayer.pause()
        }
    }

    private fun stop() {
        if (mediaPlayer.isPlaying) {
            mediaPlayer.stop()
            mediaPlayer.prepare()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.release()
    }
}