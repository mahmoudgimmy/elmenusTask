package com.example.elmenustask.ui.recipes.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.elmenustask.databinding.ItemTagBinding
import com.example.elmenustask.models.Tag

class TagsAdapter(private val clickedTag: (Tag) -> Unit) :
    PagingDataAdapter<Tag, TagsAdapter.TagViewHolder>(DiffCheck.TAG_DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TagViewHolder {


        return TagViewHolder(
            ItemTagBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: TagViewHolder, position: Int) {
        getItem(position)?.let { holder.bindTo(it, clickedTag) }
    }

    class TagViewHolder(private val binding: ItemTagBinding) : RecyclerView.ViewHolder(
        binding.root
    ) {
        fun bindTo(tag: Tag, clickedTag: (Tag) -> Unit) {
            binding.apply {
                this.tag = tag
                clTag.setOnClickListener {
                    clickedTag(tag)
                }
            }
        }
    }

}

object DiffCheck {
    var TAG_DIFF_CALLBACK: DiffUtil.ItemCallback<Tag> =
        object :
            DiffUtil.ItemCallback<Tag>() {
            override fun areItemsTheSame(oldItem: Tag, newItem: Tag): Boolean =
                oldItem.tagName == newItem.tagName

            override fun areContentsTheSame(oldItem: Tag, newItem: Tag): Boolean =
                oldItem == newItem

        }
}
