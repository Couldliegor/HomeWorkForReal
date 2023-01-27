package Drivers.transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class MechanicTeam<T extends Transport> {
    //один механик может работать с несколькими машинами.

    private final String NAME_AND_SURNAME;
    private String company;

    @Override
    public String toString() {
        return "MechanicTeam{" +
                "NAME_AND_SURNAME='" + NAME_AND_SURNAME + '\'' +
                '}';
    }

    public MechanicTeam(String NAME_AND_SURNAME) {
        this.NAME_AND_SURNAME = NAME_AND_SURNAME;
    }

    public MechanicTeam(String NAME_AND_SURNAME, String company) {
        this.NAME_AND_SURNAME = NAME_AND_SURNAME;
        this.company = company;

    }

    public void doTechCheckingForTransport() {
        System.out.println("Checking the transport " + Transport.class.getName());
    }

    public void fixTheTransport() {
        System.out.println("Transport has been fixed successfully!");
    }

    public String getNAME_AND_SURNAME() {
        return NAME_AND_SURNAME;
    }
}
