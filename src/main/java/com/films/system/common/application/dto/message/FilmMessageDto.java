package com.films.system.common.application.dto.message;

import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class FilmMessageDto implements Serializable {
    private UUID id;
    private String title;
    private Date launchDate;
    private Integer meanRating;
    private UUID imageId;

}
