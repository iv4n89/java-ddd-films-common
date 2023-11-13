package com.films.system.common.domain.test;

import java.util.Random;

public class RandomElementPicker {

  @SafeVarargs
  public static <T> T from(T... elements) {
    Random random = new Random();
    return elements[random.nextInt(elements.length)];
  }
}
