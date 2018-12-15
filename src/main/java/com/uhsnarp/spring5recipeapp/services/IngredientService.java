package com.uhsnarp.spring5recipeapp.services;

import com.uhsnarp.spring5recipeapp.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeIdToDelete, Long idToDelete);
}