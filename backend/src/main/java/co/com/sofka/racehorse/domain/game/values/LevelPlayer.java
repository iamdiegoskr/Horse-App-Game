package co.com.sofka.racehorse.domain.game.values;

import co.com.sofka.racehorse.domain.generic.ValueObject;

import java.util.Objects;

public class LevelPlayer implements ValueObject<String> {

    private final String value;

    public LevelPlayer(String value) {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("El nivel del jugador no puede estar vacio");
        }

    }

    @Override
    public String value() {
        return value;
    }
}
