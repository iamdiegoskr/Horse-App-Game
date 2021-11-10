package co.com.sofka.racehorse.domain.game.values;

import co.com.sofka.racehorse.domain.generic.ValueObject;

import java.util.Objects;

public class StateLane implements ValueObject<Boolean> {

    private final Boolean value;

    public StateLane(Boolean value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Boolean value() {
        return value;
    }
}
