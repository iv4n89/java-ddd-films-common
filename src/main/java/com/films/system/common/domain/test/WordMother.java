package com.films.system.common.domain.test;

public class WordMother {
  public static String random() {
    return MotherCreator.random().lorem().word();
  }
}
