package com.mmdc.microservices.msfoodservice.bean;

import lombok.Data;

import java.util.List;

@Data
public class Meal {
    private String name;
    private List<String> ingredients;
    private List<Integer> quantities;
    private List<Integer> protein;
    private List<Integer> carbs;
    private List<Integer> fats;
    private List<Integer> calories;
    private int totalCalories;
    private String instructions;
}

