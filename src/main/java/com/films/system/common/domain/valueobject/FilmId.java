package com.films.system.common.domain.valueobject;

import java.util.UUID;

public class FilmId extends BaseId<UUID> {

    public FilmId(UUID value) {
        super(value);
    }
}
