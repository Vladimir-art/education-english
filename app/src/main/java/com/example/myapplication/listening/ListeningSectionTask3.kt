package com.example.myapplication.listening

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import android.animation.AnimatorInflater
import android.content.Intent
import android.content.res.ColorStateList
import android.media.MediaPlayer
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
class ListeningSectionTask3 : AppCompatActivity() {

    private lateinit var backListeningSection: ImageButton
    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var btnPlay: ImageButton
    private lateinit var btnPause: ImageButton
    private lateinit var btnStop: ImageButton
    private lateinit var btnShowAnswers: Button
    private lateinit var textTask2Answers: TextView
    private lateinit var mediaPlayerCardView: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listening_task3)

        backListeningSection = findViewById(R.id.back_listening_section_button_task_3)
        mediaPlayer = MediaPlayer.create(this, R.raw.listening_task_3)
        btnPlay = findViewById(R.id.listening_section_task_3_play)
        btnPause = findViewById(R.id.listening_section_task_3_pause)
        btnStop = findViewById(R.id.listening_section_task_3_stop)
        btnShowAnswers = findViewById(R.id.listening_task_3_check_button)
        textTask3Answers = findViewById(R.id.listening_section_answers_textView_task_3)
        mediaPlayerCardView = findViewById(R.id.listening_section_media_player_task_3)
        val scaleAnimation = AnimatorInflater.loadAnimator(this, R.animator.button_scale)
        val alphaAnimation = AnimatorInflater.loadAnimator(this, R.animator.button_alpha)
        var isButtonClicked = false

        backListeningSection.setOnClickListener {
            stop()
            openSpeakingSection()
            setInactiveColorElement(mediaPlayerCardView)
            setInactiveColorElement(btnShowAnswers)
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

        btnShowAnswers.setOnClickListener {
            if (isButtonClicked) {
                setInactiveColorElement(btnShowAnswers)
                textTask3Answers.visibility = View.GONE
            } else {
                setActiveColorElement(btnShowAnswers)
                textTask3Answers.visibility = View.VISIBLE
            }
            isButtonClicked = !isButtonClicked
        }
    }

    private fun openSpeakingSection() {
        var listeningSectionIntent = Intent(this, ListeningSection::class.java)
        startActivity(listeningSectionIntent)
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