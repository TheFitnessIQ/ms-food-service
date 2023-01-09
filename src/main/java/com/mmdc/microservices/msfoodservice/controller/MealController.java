package com.mmdc.microservices.msfoodservice.controller;

import com.mmdc.microservices.msfoodservice.bean.Meal;
import com.mmdc.microservices.msfoodservice.exceptions.ResourceNotFoundException;
import com.mmdc.microservices.msfoodservice.repositories.MealRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;





import java.util.List;

@RestController
public class MealController {

    private final MealRepository mealRepository;

    public MealController(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    // Create a meal
    @PostMapping("/meals")
    public Meal createMeal(@RequestBody Meal meal) {
        return mealRepository.save(meal);
    }

    // Update a meal
    @PutMapping("/meals/{id}")
    public Meal updateMeal(@PathVariable Long id, @RequestBody Meal meal) throws ResourceNotFoundException {
        return mealRepository.findById(id)
                .map(existingMeal -> {
                    existingMeal.setName(meal.getName());
                    existingMeal.setIngredients(meal.getIngredients());
                    existingMeal.setQuantities(meal.getQuantities());
                    existingMeal.setProtein(meal.getProtein());
                    existingMeal.setCarbs(meal.getCarbs());
                    existingMeal.setFats(meal.getFats());
                    existingMeal.setCalories(meal.getCalories());
                    existingMeal.setTotalCalories(meal.getTotalCalories());
                    existingMeal.setInstructions(meal.getInstructions());
                    return mealRepository.save(existingMeal);
                })
                .orElseThrow(() -> new ResourceNotFoundException("Meal not found with id " + id));
    }

    // Delete a meal
    @DeleteMapping("/meals/{id}")
    public ResponseEntity<?> deleteMeal(@PathVariable Long id) throws ResourceNotFoundException {
        return mealRepository.findById(id)
                .map(meal -> {
                    mealRepository.delete(meal);
                    return ResponseEntity.ok().build();
                })
                .orElseThrow(() -> new ResourceNotFoundException("Meal not found with id " + id));
    }

    // Search for a single meal
    @GetMapping("/meals/{id}")
    public Meal getMealById(@PathVariable Long id) throws ResourceNotFoundException {
        return mealRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Meal not found with id " + id));
    }

    // Search for all meals
    @GetMapping("/meals")
    public List<Meal> getAllMeals() {
        return mealRepository.findAll();
    }
}

