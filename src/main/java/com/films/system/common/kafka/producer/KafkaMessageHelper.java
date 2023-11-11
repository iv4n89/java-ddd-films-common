package com.films.system.common.kafka.producer;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

import java.util.function.BiConsumer;

@Slf4j
@Component
public class KafkaMessageHelper {
  private final ObjectMapper objectMapper;

  public KafkaMessageHelper() {
    this.objectMapper = new ObjectMapper();
  }

  public <T> BiConsumer<SendResult<String, T>, Throwable> getKafkaCallback(
      String responseTopicName, T model, String id, String modelName) {
    return (result, exception) -> {
      if (exception == null) {
        RecordMetadata metadata = result.getRecordMetadata();
        log.info(
            "Received successful response from kafka with id: {} for model: {}, topic: {} partition: {} offset: {} timestamp: {}",
            id,
            modelName,
            metadata.topic(),
            metadata.partition(),
            metadata.offset(),
            metadata.timestamp());
      } else {
        log.error(
            "Error while sending {} with message: {} to topic {}",
            modelName,
            model.toString(),
            responseTopicName,
            exception);
      }
    };
  }
}
