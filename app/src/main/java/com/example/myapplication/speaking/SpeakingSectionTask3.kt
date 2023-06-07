package com.example.myapplication.speaking

import android.animation.AnimatorInflater
import android.content.Intent
import android.content.res.ColorStateList
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.example.myapplication.R

class SpeakingSectionTask3 : AppCompatActivity() {
    private lateinit var backSpeakingSection: ImageButton
    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var btnPlay: ImageButton
    private lateinit var btnPause: ImageButton
    private lateinit var btnStop: ImageButton
    private lateinit var btnShowQuestions: Button
    private lateinit var textTask3Questions: TextView
    private lateinit var mediaPlayerCardView: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_speaking_section_task3)

        backSpeakingSection = findViewById(R.id.back_speaking_sections_menu_from_task_3_button)
        mediaPlayer = MediaPlayer.create(this, R.raw.speaking_task_3)
        btnPlay = findViewById(R.id.speaking_section_task_3_play)
        btnPause = findViewById(R.id.speaking_section_task_3_pause)
        btnStop = findViewById(R.id.speaking_section_task_3_stop)
        btnShowQuestions = findViewById(R.id.speaking_section_task_3_answers_button)
        textTask3Questions = findViewById(R.id.speaking_section_answers_textView)
        mediaPlayerCardView = findViewById(R.id.speaking_section_media_player)
        val scaleAnimation = AnimatorInflater.loadAnimator(this, R.animator.button_scale)
        val alphaAnimation = AnimatorInflater.loadAnimator(this, R.animator.button_alpha)
        var isButtonClicked = false

        backSpeakingSection.setOnClickListener {
            stop()
            openSpeakingSection()
            setInactiveColorElement(mediaPlayerCardView)
            setInactiveColorElement(btnShowQuestions)
        }

        btnPlay.setOnClickListener {
            scaleAnimation.setTarget(btnPlay)
            scaleAnimation.start()
            setActiveColorElement(mediaPlayerCardView)
            play()
        }

        btnPause.setOnClickListener {
            scaleAnimation.setTarget(btnPause)
            scaleAnimation.start()
            setInactiveColorElement(mediaPlayerCardView)
            pause()
        }

        btnStop.setOnClickListener {
            alphaAnimation.setTarget(btnStop)
            alphaAnimation.start()
            setInactiveColorElement(mediaPlayerCardView)
            stop()
        }

        btnShowQuestions.setOnClickListener {
            if (isButtonClicked) {
                setInactiveColorElement(btnShowQuestions)
                textTask3Questions.visibility = View.GONE
            } else {
                setActiveColorElement(btnShowQuestions)
                textTask3Questions.visibility = View.VISIBLE
            }
            isButtonClicked = !isButtonClicked
        }
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

    private fun <T : View> setActiveColorElement(element: T) {
        element.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(this, R.color.opacity_medium_violet_red))
    }

    private fun <T : View> setInactiveColorElement(element: T) {
        element.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(this, R.color.opacity_pale_violet_red))
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.release()
    }
}