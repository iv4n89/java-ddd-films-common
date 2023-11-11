package com.films.system.common.domain.events.publisher;

import com.films.system.common.domain.events.DomainEvent;

public interface DomainPublisher<T extends DomainEvent<?>> {
  void publish(T domainEvent);
}
