package com.example.elmenustask.ui.recipes.adapters


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.elmenustask.databinding.ItemItemBinding
import com.example.elmenustask.models.Item

class ItemsAdapter(private val itemClick: (Item, View) -> Unit) :
    ListAdapter<Item, ItemsAdapter.ItemViewHolder>(ItemDiffCheck.Item_DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {


        return ItemViewHolder(
            ItemItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bindTo(getItem(position), itemClick)
    }

    class ItemViewHolder(private val binding: ItemItemBinding) : RecyclerView.ViewHolder(
        binding.root
    ) {
        fun bindTo(item: Item, itemClick: (Item, View) -> Unit) {
            binding.apply {
                this.item = item
                cvItem.setOnClickListener {
                    itemClick(item, binding.ivItemImage)
                }
            }

        }
    }

}

object ItemDiffCheck {
    var Item_DIFF_CALLBACK: DiffUtil.ItemCallback<Item> =
        object :
            DiffUtil.ItemCallback<Item>() {

            override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean =
                oldItem == newItem
        }
}
