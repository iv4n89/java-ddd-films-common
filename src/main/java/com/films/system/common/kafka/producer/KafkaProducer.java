package com.films.system.common.kafka.producer;

import org.springframework.kafka.support.SendResult;

import java.io.Serializable;
import java.util.function.BiConsumer;

public interface KafkaProducer<K extends Serializable, V extends Serializable> {
    void send(String topicName, K key, V message, BiConsumer<SendResult<K, V>, Throwable> callback);
}
