package com.films.system.common.application.dto.message;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentCreatedMessageDto {
    private UUID filmId;
    private Integer meanRating;
}
