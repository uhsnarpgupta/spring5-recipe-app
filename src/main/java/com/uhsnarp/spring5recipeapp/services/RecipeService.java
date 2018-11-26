package com.uhsnarp.spring5recipeapp.services;

import com.uhsnarp.spring5recipeapp.domain.Recipe;
import com.uhsnarp.spring5recipeapp.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    RecipeRepository recipeRepository;

    public List<Recipe> recipeList() {
        return null;
    }
}
