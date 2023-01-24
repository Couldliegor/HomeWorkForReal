package Drivers.transport.driver;

import Drivers.transport.driver.Exceptions.DiagnosticException;

import java.util.LinkedList;

public abstract class Driver{
    private final String fullName;
    private boolean havingRights; //реализуем это поле.
    private int yearsOfDriving;
    protected String typeOfDriver;
    public Driver(String fullName, int yearsOfDriving, String typeOfDriver) throws DiagnosticException {
        if (yearsOfDriving <= 0 || typeOfDriver.isEmpty() || typeOfDriver.isBlank() || typeOfDriver == null && (!typeOfDriver.equals("B") || !typeOfDriver.equals("C"))) {
            havingRights = false;
            throw new DiagnosticException("Укажите тип прав!");
        } else {
            this.yearsOfDriving = yearsOfDriving;
            havingRights = true;
            this.typeOfDriver = typeOfDriver;
        }
        this.fullName = fullName;
    }
    public Driver(String fullName, int yearsOfDriving) {
        if (yearsOfDriving <= 0) {
            havingRights = false;
        } else {
            this.yearsOfDriving = yearsOfDriving;
            havingRights = true;
        }
        this.fullName = fullName;
    }

    public abstract void startMoving();
    public abstract void stopMoving();

    public abstract void refuel();
    public String getFullName() {
        return fullName;
    }

    public boolean isHavingRights() {
        return havingRights;
    }

    public void setHavingRights(boolean havingRights) {
        this.havingRights = havingRights;
    }

    public int getYearsOfDriving() {
        return yearsOfDriving;
    }

    public void setYearsOfDriving(int yearsOfDriving) {
        this.yearsOfDriving = yearsOfDriving;
    }
    public String getTypeOfDriver() {
        return typeOfDriver;
    }

    public void setTypeOfDriver(String typeOfDriver) {
        this.typeOfDriver = typeOfDriver;
    }
}
