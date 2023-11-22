package com.films.system.common.kafka.consumer;

import org.springframework.kafka.support.SendResult;

import java.util.function.BiConsumer;

public interface KafkaConsumerCallback<T> {
  void receive(T payload, BiConsumer<SendResult<String, T>, Throwable> callback);
}
