package com.films.system.common.kafka.producer;

public interface KafkaProducer<T> {
    void send(String topic, T payload);
}
