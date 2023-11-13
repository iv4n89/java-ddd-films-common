package com.films.system.common.application.dto.message;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public final class CommentCreatedMessageDto implements Serializable {
    private CommentMessageDto comment;
    private Integer meanRating;
}
