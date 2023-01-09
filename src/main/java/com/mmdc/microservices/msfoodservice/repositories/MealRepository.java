package com.mmdc.microservices.msfoodservice.repositories;

import com.mmdc.microservices.msfoodservice.bean.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> { }
