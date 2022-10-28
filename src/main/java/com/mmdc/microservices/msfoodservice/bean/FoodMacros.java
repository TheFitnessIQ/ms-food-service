package com.mmdc.microservices.msfoodservice.bean;

public class FoodMacros {
    String foodName;
    String foodImagePath;
    float proteinQty;
    float carbsQty;
    float fatsQty;
    float calories;

    public FoodMacros() {
        super();
    }

    public FoodMacros(String foodName, String foodImagePath, float proteinQty, float carbsQty, float fatsQty, float calories) {
        this.foodName = foodName;
        this.foodImagePath = foodImagePath;
        this.proteinQty = proteinQty;
        this.carbsQty = carbsQty;
        this.fatsQty = fatsQty;
        this.calories = calories;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodImagePath() {
        return foodImagePath;
    }

    public void setFoodImagePath(String foodImagePath) {
        this.foodImagePath = foodImagePath;
    }

    public float getProteinQty() {
        return proteinQty;
    }

    public void setProteinQty(float proteinQty) {
        this.proteinQty = proteinQty;
    }

    public float getCarbsQty() {
        return carbsQty;
    }

    public void setCarbsQty(float carbsQty) {
        this.carbsQty = carbsQty;
    }

    public float getFatsQty() {
        return fatsQty;
    }

    public void setFatsQty(float fatsQty) {
        this.fatsQty = fatsQty;
    }

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }
}
