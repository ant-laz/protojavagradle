package com.tonyzaro.application;

import com.tonyzaro.model.Person;

public class Application {

  public static void main(String[] args) {
    System.out.println("still working?");
    Person person = Person.newBuilder()
        .setAge(23)
        .setName("123")
        .build();
    System.out.println(person.toString());
  }

}
