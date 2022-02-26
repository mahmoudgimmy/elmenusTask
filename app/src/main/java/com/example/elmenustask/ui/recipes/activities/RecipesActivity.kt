package com.example.elmenustask.ui.recipes.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.elmenustask.databinding.ActivityMainBinding
import com.example.elmenustask.ui.recipedetails.activites.RecipeDetailsActivity
import com.example.elmenustask.ui.recipes.adapters.ItemsAdapter
import com.example.elmenustask.ui.recipes.adapters.TagsAdapter
import com.example.elmenustask.ui.recipes.viewmodels.RecipesViewModel
import com.example.elmenustask.ui.recipes.viewmodels.RecipesViewState
import kotlinx.coroutines.launch
import org.koin.android.viewmodel.ext.android.viewModel


class RecipesActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding get() = _binding!!
    private val viewModel: RecipesViewModel by viewModel()
    private lateinit var tagsAdapter: TagsAdapter
    private lateinit var itemsAdapter: ItemsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initializeVariables()
        prepareRecycleViews()
        bindObservers()
        initializeScreenView()
    }

    private fun initializeVariables() {
        tagsAdapter = TagsAdapter {
            viewModel.loadItems(it.tagName)
        }

        itemsAdapter = ItemsAdapter { item, imageView ->
            val intent = Intent(this, RecipeDetailsActivity::class.java)
            intent.putExtra(RecipeDetailsActivity.Item, item)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this, imageView, ViewCompat.getTransitionName(imageView)!!
            )
            startActivity(intent, options.toBundle())
        }
    }

    private fun initializeScreenView() {
        viewModel.loadTags()
    }

    private fun prepareRecycleViews() {
        binding.apply {
            rvTags.apply {
                layoutManager =
                    LinearLayoutManager(this@RecipesActivity, LinearLayoutManager.HORIZONTAL, false)
                adapter = tagsAdapter
            }

            rvItems.apply {
                layoutManager =
                    LinearLayoutManager(this@RecipesActivity, LinearLayoutManager.VERTICAL, false)
                adapter = itemsAdapter
            }

        }
    }

    private fun bindObservers() {
        viewModel.viewState.observe(this) {
            renderScreen(it)
        }
    }

    private fun renderScreen(viewState: RecipesViewState) {
        when (viewState) {
            is RecipesViewState.FAILURE -> Toast.makeText(
                this,
                viewState.errorMsg,
                Toast.LENGTH_SHORT
            ).show()
            is RecipesViewState.Items -> {
                binding.pbLoading.isVisible = false
                itemsAdapter.submitList(viewState.payload)
            }
            is RecipesViewState.LOADING -> {
                binding.pbLoading.isVisible = true
                itemsAdapter.submitList(emptyList())
            }
            is RecipesViewState.Tags -> {
                binding.pbLoading.isVisible = false
                lifecycleScope.launch {
                    tagsAdapter.submitData(viewState.payload)
                }

            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}