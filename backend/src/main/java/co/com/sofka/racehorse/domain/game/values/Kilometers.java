package co.com.sofka.racehorse.domain.game.values;

import co.com.sofka.racehorse.domain.generic.ValueObject;

import java.util.Objects;

public class Kilometers implements ValueObject<Integer> {

    private final Integer value;

    public Kilometers(Integer value) {
        this.value = Objects.requireNonNull(value);

        if(this.value.toString().isBlank()){
            throw new IllegalArgumentException("EL numero de kilometros de la pista no puede estar vacio");
        }

        if(this.value<0 || this.value>1000){
            throw new IllegalArgumentException("Los kilometros no pueden ser negativo ni mayor a 1000 KM");
        }

    }

    @Override
    public Integer value() {
        return value;
    }
}
