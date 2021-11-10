package co.com.sofka.racehorse.domain.game.values;

import co.com.sofka.racehorse.domain.generic.ValueObject;

import java.util.Objects;

public class Position implements ValueObject<Integer> {

    private final Integer value;

    public Position(Integer value) {
        this.value = Objects.requireNonNull(value);

        if(this.value.toString().isBlank()){
            throw new IllegalArgumentException("La posicion no puede estar vacia");
        }

        if(this.value<0){
            throw new IllegalArgumentException("La posicion no puede ser negativa");
        }

    }


    @Override
    public Integer value() {
        return value;
    }
}
