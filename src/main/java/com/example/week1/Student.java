package com.example.week1;

import lombok.Getter;

@Getter
public class Student {

  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
