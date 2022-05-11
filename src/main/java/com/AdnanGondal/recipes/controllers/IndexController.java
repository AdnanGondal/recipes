package com.AdnanGondal.recipes.controllers;


import com.AdnanGondal.recipes.models.Category;
import com.AdnanGondal.recipes.models.UnitOfMeasure;
import com.AdnanGondal.recipes.repositories.CategoryRepository;
import com.AdnanGondal.recipes.repositories.UnitOfMeasureRepository;
import com.AdnanGondal.recipes.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){
        System.out.println("Hello World I how long will this take");

        model.addAttribute("recipes",recipeService.getRecipes());


        return "index";
    }
}
