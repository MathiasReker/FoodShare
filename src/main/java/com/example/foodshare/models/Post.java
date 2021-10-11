package com.example.foodshare.models;

import java.awt.*;
import java.time.LocalDate;

public class Post {

  private final Image img;
  private final String description;
  private final String foodType;
  private final int quantity;
  private final String user;
  private final String location;
  private final LocalDate creationDate;
  private final LocalDate expiringDate;

  public Post(
      Image img,
      String description,
      String foodType,
      int quantity,
      String user,
      String location,
      LocalDate creationDate,
      LocalDate expiringDate) {
    this.img = img;
    this.description = description;
    this.foodType = foodType;
    this.quantity = quantity;
    this.user = user;
    this.location = location;
    this.creationDate = creationDate;
    this.expiringDate = expiringDate;
  }

  public Image getImg() {
    return img;
  }

  public String getDescription() {
    return description;
  }

  public String getFoodType() {
    return foodType;
  }

  public int getQuantity() {
    return quantity;
  }

  public String getUser() {
    return user;
  }

  public String getLocation() {
    return location;
  }

  public LocalDate getCreationDate() {
    return creationDate;
  }

  public LocalDate getExpiringDate() {
    return expiringDate;
  }
}
