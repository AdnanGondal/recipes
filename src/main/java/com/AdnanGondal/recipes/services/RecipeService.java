package com.AdnanGondal.recipes.services;

import com.AdnanGondal.recipes.commands.RecipeCommand;
import com.AdnanGondal.recipes.models.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long l);

    void deleteById(Long idToDelete);
}
