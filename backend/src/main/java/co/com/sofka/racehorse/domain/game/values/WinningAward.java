package co.com.sofka.racehorse.domain.game.values;

import co.com.sofka.racehorse.domain.generic.ValueObject;

import java.util.Objects;

public class WinningAward implements ValueObject<Double> {

    private final Double value;

    public WinningAward(Double value) {
        this.value = Objects.requireNonNull(value);

        if(this.value.toString().isBlank()){
            throw new IllegalArgumentException("EL premio no puede estar vacio");
        }

        if(this.value<0){
            throw new IllegalArgumentException("EL premio no puede tener un valor negativo");
        }
    }

    @Override
    public Double value() {
        return value;
    }
}
