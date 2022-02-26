package com.example.elmenustask.ui.recipedetails.activites

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.elmenustask.databinding.ActivityRecipeDetailsBinding
import com.example.elmenustask.models.Item

class RecipeDetailsActivity : AppCompatActivity() {
    private var _binding: ActivityRecipeDetailsBinding? = null
    private val binding: ActivityRecipeDetailsBinding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityRecipeDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val item = intent.extras?.getParcelable<Item>(Item)
        binding.item = item

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding= null
    }
    companion object{
        const val Item = "Item"
    }
}