package com.example.myapplication

import android.animation.ValueAnimator
import android.content.res.Resources
import android.widget.TextView

class StartTextSizeAnimation(private val resources: Resources) {
        fun startTextSizeAnimation(textView: TextView, textSizeChange: Float) {
            val textSize = textView.paint.textSize
            val sp: Float = textSize / resources.displayMetrics.scaledDensity

            val valueAnimator = ValueAnimator.ofFloat(sp + textSizeChange, 0f)
            valueAnimator.duration = 500
            valueAnimator.addUpdateListener { animation ->
                val animatedValue = animation.animatedValue as Float
                textView.textSize = animatedValue
            }
            valueAnimator.start()
        }
}