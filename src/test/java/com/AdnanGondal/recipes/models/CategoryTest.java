package com.AdnanGondal.recipes.models;

import org.junit.jupiter.api.Test;
import org.junit.Before;
//import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.Assert.*;



import static org.junit.jupiter.api.Assertions.*;

public class CategoryTest {


    Category category;

    @BeforeEach
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getId() {
        Long idValue = 4L;
        category.setId(idValue);

        assertEquals(idValue, category.getId());
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}