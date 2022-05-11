package com.AdnanGondal.recipes.controllers;


import com.AdnanGondal.recipes.models.Category;
import com.AdnanGondal.recipes.models.UnitOfMeasure;
import com.AdnanGondal.recipes.repositories.CategoryRepository;
import com.AdnanGondal.recipes.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        System.out.println("Hello World I how long will this take");

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByUom("Cup");

        System.out.println(categoryOptional.get().getId());
        System.out.println(unitOfMeasureOptional.get().getId());
        return "index";
    }
}
