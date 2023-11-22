package com.films.system.common.kafka.consumer;


public interface KafkaConsumer <T> {
    void receive(T payload);
}
