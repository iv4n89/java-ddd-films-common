package com.films.system.common.domain.valueobject;

import java.util.Objects;

public abstract class StringValueObject extends ValueObject {
  private final String value;

  protected StringValueObject(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StringValueObject that = (StringValueObject) o;
    return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return this.value;
  }
}
