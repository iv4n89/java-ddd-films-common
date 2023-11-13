package com.films.system.common.domain.test;

public class EmailMother {
  public static String random() {
    return MotherCreator.random().internet().emailAddress();
  }
}
