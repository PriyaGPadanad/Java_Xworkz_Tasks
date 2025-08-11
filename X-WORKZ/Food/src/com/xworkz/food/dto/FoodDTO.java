package com.xworkz.food.dto;

import java.io.Serializable;

public class FoodDTO implements Serializable {
  private int foodId;
  private String name;
  private String description;
  private String category;
  private double price;
  private boolean availability;
  private boolean type;

  public FoodDTO(int foodId,String name,String description,String category,double price,boolean availability,boolean type){
      this.foodId=foodId;
      this.name=name;
      this.description=description;
      this.category=category;
      this.price=price;
      this.availability=availability;
      this.type=type;
  }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "FoodDTO{" +
                "foodId=" + foodId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", availability=" + availability +
                ", type=" + type +
                '}';
    }
}
