package com.films.system.common.application.dto.message;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CommentMessageDto implements Serializable {
  private UUID id;
  private String description;
  private Integer rating;
  private UUID filmId;
  private UUID userId;
  private LocalDateTime createdAt;
}
