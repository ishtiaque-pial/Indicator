package com.android.indicator

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.indicator.databinding.RowItemViewpagerBinding

class OnboardingAdapter() : RecyclerView.Adapter<OnboardingAdapter.ViewHolder>() {
    class ViewHolder(val binding: RowItemViewpagerBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        RowItemViewpagerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            binding.apply {
                valueText.text=""+position

                when(position%3){
                    0-> root.setBgColor(R.color.red)
                    1-> root.setBgColor(R.color.blue)
                    else->root.setBgColor(R.color.green)
                }

            }
        }
    }

    override fun getItemCount() = 5
}