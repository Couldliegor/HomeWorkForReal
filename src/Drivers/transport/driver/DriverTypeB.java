package Drivers.transport.driver;


import Drivers.transport.driver.Exceptions.DiagnosticException;

public class DriverTypeB extends Driver {
    public DriverTypeB(String fullName, int yearsOfDriving, String typeOfDriver) throws DiagnosticException {
        super(fullName, yearsOfDriving, typeOfDriver);
        setTypeOfDriver("B");
    }

    @Override
    public void startMoving() {
        System.out.println("Driver " + getFullName() + " has been started moving");
    }

    @Override
    public void stopMoving() {
        System.out.println("Driver " + getFullName() + " has been stopped moving");
    }

    @Override
    public void refuel() {
        System.out.println("Starting to refuel");
        System.out.println("Refuel finished");
    }
}
