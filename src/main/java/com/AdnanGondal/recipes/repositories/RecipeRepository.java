package com.AdnanGondal.recipes.repositories;

import com.AdnanGondal.recipes.models.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {

}
