package com.uhsnarp.spring5recipeapp.services;

import com.uhsnarp.spring5recipeapp.commands.RecipeCommand;
import com.uhsnarp.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
