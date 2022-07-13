package com.example.testing

import androidx.recyclerview.widget.RecyclerView
import com.example.testing.databinding.MainTopBinding

class MainTop(val binding: MainTopBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: DTO.Top) {
        binding.tvTxt.text = item.main
    }
}