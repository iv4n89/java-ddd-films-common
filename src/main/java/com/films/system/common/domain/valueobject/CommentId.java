package com.films.system.common.domain.valueobject;

import com.films.system.common.domain.valueobject.BaseId;

import java.util.UUID;

public class CommentId extends BaseId<UUID> {
  public CommentId(UUID value) {
    super(value);
  }
}
