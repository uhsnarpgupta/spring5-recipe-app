package com.uhsnarp.spring5recipeapp.services;

import com.uhsnarp.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
