package com.films.system.common.domain.valueobject;

import java.util.Date;
import java.util.Objects;

public abstract class DateValueObject extends ValueObject {
  private final Date value;

  protected DateValueObject(Date value) {
    this.value = value;
  }

  public Date getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DateValueObject that = (DateValueObject) o;
    return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }
}
