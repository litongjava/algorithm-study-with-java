package com.litongjava.algorithm.beginner.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
  private int id;
  private String name;
  private int age;

  @Override
  public String toString() {
    return "{" + id + "," + name + "," + age + '}';
  }
}