package Drivers.transport.driver;

import Drivers.transport.driver.Exceptions.DiagnosticException;

public class DriverTypeC extends Driver {
    public DriverTypeC(String fullName, int yearsOfDriving, String typeOfDriver) throws DiagnosticException {
        super(fullName, yearsOfDriving, typeOfDriver);
        setTypeOfDriver("C");
    }

    @Override
    public void startMoving() {
        System.out.println("Moving has been started");
    }

    @Override
    public void stopMoving() {
        System.out.println("Moving of transport by the driver: " + getFullName() + " has been stopped.");
    }

    @Override
    public void refuel() {
        System.out.println("Starting to refuel");
        System.out.println("Refuel finished");
    }
}
