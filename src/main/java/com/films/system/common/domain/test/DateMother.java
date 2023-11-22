package com.films.system.common.domain.test;

import java.util.Date;

public class DateMother {
    public static Date random() {
        return MotherCreator.random().date().birthday();
    }
}
