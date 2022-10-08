package com.buzreal.projects.food.mapper;

import com.buzreal.projects.food.model.Food;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FoodMapper {

    @Select("SELECT * FROM FOOD")
    Food[] selectFoods();

    @Insert("INSERT INTO FOOD(name, price) VALUES(#{name}, #{price})")
    int insertFood(Food food);
}
