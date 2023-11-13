package com.films.system.common.domain.test;

public class IntegerMother {
  public static Integer random() {
    return MotherCreator.random().number().randomDigit();
  }
}
