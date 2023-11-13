package com.films.system.common.domain.test;

import java.time.Instant;
import java.util.Date;

public class DateMother {
    public static Date random() {
        return MotherCreator.random().date().between(Date.from(Instant.MIN), Date.from(Instant.MAX));
    }
}
