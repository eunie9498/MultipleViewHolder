package com.example.testing

import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.testing.databinding.MainSecondBinding

class MainSecond(val binding: MainSecondBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: DTO.Item) = with(binding) {
        tvTxt.text = item.title
        imgCon.background = ContextCompat.getDrawable(root.context, item.img)
        tvComment.text = item.msg
    }
}