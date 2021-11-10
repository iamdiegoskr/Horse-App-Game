package co.com.sofka.racehorse.domain.game.values;

import co.com.sofka.racehorse.domain.generic.ValueObject;

import java.util.Objects;

public class NameHorseRider implements ValueObject<String> {

    private final String value;

    public NameHorseRider(String value) {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("EL nombre del jinete no puede estar vacio");
        }

        if(this.value.length()>50){
            throw new IllegalArgumentException("El nombre del jinete no puede ser tan extenso");
        }

    }

    @Override
    public String value() {
        return value;
    }
}
