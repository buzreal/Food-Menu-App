package com.buzreal.projects.food.service;

import com.buzreal.projects.food.mapper.FoodMapper;
import com.buzreal.projects.food.model.Food;
import org.springframework.stereotype.Service;

@Service
public class FoodService {

    private FoodMapper foodMapper;

    public FoodService(FoodMapper foodMapper) {
        this.foodMapper = foodMapper;
    }

    public int addFood(Food food){
        return foodMapper.insertFood(food);
    }

    public Food[] getFoods(){
        Food[] foods = foodMapper.selectFoods();
        return foods;
    }
}
