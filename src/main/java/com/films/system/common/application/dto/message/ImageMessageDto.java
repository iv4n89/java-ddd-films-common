package com.films.system.common.application.dto.message;

import com.films.system.common.domain.valueobject.ImageId;

public class ImageMessageDto {
  private final ImageId imageId;

  public ImageMessageDto(ImageId imageId) {
    this.imageId = imageId;
  }

  public ImageId getImageId() {
    return imageId;
  }
}
