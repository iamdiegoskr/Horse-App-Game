package co.com.sofka.racehorse.domain.game.values;


import co.com.sofka.racehorse.domain.generic.ValueObject;

public class Podium implements ValueObject<Podium.Props> {


    @Override
    public Props value() {
        return new Props() {
            @Override
            public Podiums firstPlace() {
                return Podiums.FIRST_PLACE;
            }

            @Override
            public Podiums secondPlace() {
                return Podiums.SECOND_PLACE;
            }

            @Override
            public Podiums thirdPlace() {
                return Podiums.THIRD_PLACE;
            }
        };
    }

    public interface Props{
        Podiums firstPlace();
        Podiums secondPlace();
        Podiums thirdPlace();
    }

    public enum Podiums{
        FIRST_PLACE,SECOND_PLACE,THIRD_PLACE;
    }


}
