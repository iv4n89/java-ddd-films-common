package com.films.system.common.domain.valueobject;

import java.util.Objects;

public class IntValueObject {
  private final Integer value;

  public IntValueObject(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IntValueObject that = (IntValueObject) o;
    return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }
}
