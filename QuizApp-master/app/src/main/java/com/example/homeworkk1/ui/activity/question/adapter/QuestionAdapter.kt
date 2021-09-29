package com.example.homeworkk1.ui.activity.question.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homeworkk1.data.QuestionModel
import com.example.homeworkk1.databinding.ListQuestionBinding

class QuestionAdapter(private var list: MutableList<QuestionModel>) :
    RecyclerView.Adapter<QuestionAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: ListQuestionBinding) :
        RecyclerView.ViewHolder(binding.root) {

        private val btnMultiply =
            listOf(
                binding.btnFirst,
                binding.btnSecond,
                binding.btnThird,
                binding.btnFourth
            )
        private val btnBooleans =
            listOf(
                binding.btnFifth,
                binding.btnSixth
            )

        fun bind(model: QuestionModel) {
            if (model.type.equals("boolean")) {
                for (n in 0..btnMultiply.size) {
                    btnMultiply[n].text = model.answers!!
                }
            } else {
                for (n in 0..btnBooleans.size) {
                    btnMultiply[n].text = model.answers!!
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemBinding =
            ListQuestionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount() = list.size

}