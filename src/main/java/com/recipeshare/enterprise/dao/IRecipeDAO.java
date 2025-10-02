package com.recipeshare.enterprise.dao;

import com.recipeshare.enterprise.dto.RecipeDTO;

import java.util.List;

public interface IRecipeDAO {
    List<RecipeDTO> getAllRecipes();
    RecipeDTO fetchById(int id);
    void deleteById(int id);
    boolean save(RecipeDTO recipe);
}
