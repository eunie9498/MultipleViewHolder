package com.example.testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testing.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() = with(binding) {
        recyclerView.adapter = MainAdapter()
        (recyclerView.adapter as MainAdapter).addTops(DTO.Top("👍🏻 List of hobbies"))

        val items = arrayOf(
            DTO.Item(R.drawable.ic_and, "Android", "Android Develop"),
            DTO.Item(R.drawable.ic_music, "Music", "K-Pop"),
            DTO.Item(R.drawable.ic_swim, "Swim", "Enjoy Summer")
        )
        (recyclerView.adapter as MainAdapter).addItems(items.toList())
    }
}