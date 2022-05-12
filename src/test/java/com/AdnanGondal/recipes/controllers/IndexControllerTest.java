package com.AdnanGondal.recipes.controllers;

import com.AdnanGondal.recipes.services.RecipeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static javax.management.Query.geq;
import static javax.management.Query.times;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

class IndexControllerTest {

    @Mock
    RecipeService recipeService;

    @Mock
    Model model;

    IndexController controller;

    @BeforeEach
    void setUp() {

        MockitoAnnotations.openMocks(this);

        controller = new IndexController(recipeService);
    }

    @Test
    void getIndexPage() {

        String viewName = controller.getIndexPage(model);
        assertEquals("index",viewName);

        verify(recipeService, Mockito.times(1)).getRecipes();
        verify(model, Mockito.times(1)).addAttribute(eq("recipes"), anySet());
    }
}