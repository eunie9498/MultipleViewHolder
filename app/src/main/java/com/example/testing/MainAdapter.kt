package com.example.testing

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testing.databinding.MainSecondBinding
import com.example.testing.databinding.MainTopBinding

class MainAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    val itemList = mutableListOf<DTO>()

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is MainTop -> {
                holder.bind(itemList[position] as DTO.Top)
            }
            is MainSecond -> {
                holder.bind(itemList[position] as DTO.Item)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when (viewType) {
            TYPE.ZERO -> {
                return MainTop(
                    MainTopBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
            TYPE.ONE -> {
                return MainSecond(
                    MainSecondBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
            else -> {
                throw Exception("onCreateViewHolder Error")
            }
        }
    }

    fun addTops(item: DTO.Top) {
        this.itemList.add(item)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addItems(item: List<DTO.Item>) {
        this.itemList.addAll(item)
        notifyDataSetChanged()
    }

    override fun getItemCount() = itemList.size

    override fun getItemViewType(position: Int): Int {
        when (itemList[position]) {
            is DTO.Top -> {
                return TYPE.ZERO
            }
            is DTO.Item -> {
                return TYPE.ONE
            }
        }
    }
}