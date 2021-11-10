package co.com.sofka.racehorse.domain.game.event;

import co.com.sofka.racehorse.domain.generic.DomainEvent;

public class ProgramCreated extends DomainEvent {

    private final String name;

    public ProgramCreated(String name) {
        super("sofkau.program.programcreated");
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
