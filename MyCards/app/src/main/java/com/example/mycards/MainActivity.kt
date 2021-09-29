package com.example.mycards

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var front_anim:AnimatorSet
    lateinit var back_anim:AnimatorSet
    var isFront = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scale:Float = applicationContext.resources.displayMetrics.density
        card_front.cameraDistance = 10000 *scale
        card_back.cameraDistance = 10000 *scale


        back_anim = AnimatorInflater.loadAnimator(applicationContext,R.animator.back_animator) as AnimatorSet
        front_anim = AnimatorInflater.loadAnimator(applicationContext,R.animator.front_animator) as AnimatorSet

        card_front.setOnClickListener {
        if (isFront){
            front_anim.setTarget(card_front)
            back_anim.setTarget(card_back)
            back_anim.start()
            front_anim.start()
            isFront = false
        }else{
            front_anim.setTarget(card_back)
            back_anim.setTarget(card_front)
            back_anim.start()
            front_anim.start()
            isFront = true

        }
        }

    }

}