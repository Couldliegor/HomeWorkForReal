package Drivers.transport.driver;

import Drivers.transport.driver.Driver;
import Drivers.transport.driver.Exceptions.DiagnosticException;

public class DriverTypeD extends Driver {
    public DriverTypeD(String fullName, int yearsOfDriving) {
        super(fullName, yearsOfDriving);
        setTypeOfDriver("D");
    }

    @Override
    public void startMoving() {
        System.out.println("Moving by " + getFullName() + " has been started !");
    }

    @Override
    public void stopMoving() {
        System.out.println("The " + getFullName() + " has been stopped");
    }

    @Override
    public void refuel() {
        System.out.println("Starting to refuel");
        System.out.println("Refuel finished");
    }
}
