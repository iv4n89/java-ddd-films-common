package com.films.system.common.application.dto.message;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FilmImageMessageDto {

  private String imageId;
  private byte[] imageData;
  private String filename;
  private String mimeType;

}
