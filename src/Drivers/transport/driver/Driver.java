package Drivers.transport.driver;

import Drivers.transport.driver.Exceptions.DiagnosticException;

import java.util.LinkedList;
import java.util.Objects;

public abstract class Driver{
    @Override
    public String toString() {
        return "Driver" +
                "fullName " + fullName + '\'' +
                ", havingRights" + havingRights +
                ", yearsOfDriving " + yearsOfDriving +
                ", typeOfDriver " + typeOfDriver + '\'';
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return havingRights == driver.havingRights && yearsOfDriving == driver.yearsOfDriving && Objects.equals(fullName, driver.fullName) && Objects.equals(typeOfDriver, driver.typeOfDriver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, havingRights, yearsOfDriving, typeOfDriver);
    }
}
