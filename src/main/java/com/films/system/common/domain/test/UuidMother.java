package com.films.system.common.domain.test;

import java.util.UUID;

public class UuidMother {
  public static String random() {
    return UUID.randomUUID().toString();
  }

  public static UUID randomUUID() {
    return UUID.randomUUID();
  }

  public static String from(String value) {
    return UUID.fromString(value).toString();
  }

  public static UUID fromUUID(String value) {
    return UUID.fromString(value);
  }
}
