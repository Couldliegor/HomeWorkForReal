package Drivers.transport;

public class MechanicTeam<T extends Transport> {
    //один механик может работать с несколькими машинами.

    private final String nameSurname;
    private String company;

    @Override
    public String toString() {
        return "MechanicTeam{" +
               "NAME_AND_SURNAME='" + nameSurname + '\'' +
               '}';
    }

    public MechanicTeam(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public MechanicTeam(String nameSurname, String company) {
        this.nameSurname = nameSurname;
        this.company = company;

    }

    public void doTechCheckingForTransport() {
        System.out.println("Checking the transport " + Transport.class.getName());
    }

    public void fixTheTransport() {
        System.out.println("Transport has been fixed successfully!");
    }

    public String getNameSurname() {
        return nameSurname;
    }
}
