package com.example.recipebook.repository

import androidx.lifecycle.map
import com.example.recipebook.dto.Category
import com.example.recipebook.dto.RecipeDto
import com.example.recipebook.model.*

class RoomRecipeRepositoryImpl(
    private val dao: RecipeDao
) : RecipeRepository {

    override var data = dao.getAll().map { entities ->
        entities.map { it.toModel() }
    }

    override fun save(recipe: RecipeDto) {
        dao.save(recipe.toEntity())
    }

    override fun delete(recipeId: Long) {
        dao.delete(recipeId)
    }

    override fun addToFavourites(recipeId: Long) {
        dao.addToFavourites(recipeId)
    }

    override fun search(recipeName: String) {
        dao.search(recipeName)
    }

    override fun getCategory(category: Category) {
        dao.getCategory(category)
    }

    override fun update() {
        dao.update()
    }
}