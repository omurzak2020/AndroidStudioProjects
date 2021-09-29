package com.example.homeworkk1.ui.activity.question

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.PagerSnapHelper
import com.example.homeworkk1.data.QuestionModel
import com.example.homeworkk1.databinding.ActivityQuestionBinding
import com.example.homeworkk1.ui.activity.question.adapter.QuestionAdapter


class QuestionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = mutableListOf<QuestionModel>()

        for (n in 1..10) {
            list.add(QuestionModel("multiply", "Nazar $n"))
        }
        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(binding.rv)
        binding.rv.adapter = QuestionAdapter(list)

    }
}