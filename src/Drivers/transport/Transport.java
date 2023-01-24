package Drivers.transport;

import Drivers.transport.driver.Driver;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;


public abstract class Transport <T extends Driver> implements Racing {
    //можно указать implements в родительском классе, тогда они будут реализованы в наследниках.
    private final String brand;
    private final String model;
    private double engineVolume;
    private final T driver;
    protected List<MechanicTeam> listOfMechanics = new ArrayList<MechanicTeam>(2);
    public Transport(String brand, String model, double engineVolume, T driver) {
        if (brand != null && !brand.isBlank() && !brand.isEmpty()) {
            this.brand = brand;
        } else {
            throw new RuntimeException("ERROR IN BRAND");
        }
        if (model != null && !model.isBlank() && !model.isEmpty()) {
            this.model = model;
        } else {
            throw new RuntimeException("ERROR IN MODEL");
        }
        if (engineVolume > 1.0) {
            this.engineVolume = engineVolume;
        } else {
            throw new RuntimeException("ERROR IN ENGINE VOLUME");
        }
        this.driver = driver;

    }

    public abstract void printType();

    public void movingStart() {
        System.out.println("Moving has been started!");
    }

    public void movingEnd() {
        System.out.println("The moving have been ended!");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    public T getDriver() {
        return driver;
    }
    public String getDriverName() {
        return getDriver().getFullName();
    }


    public void startDiagnostics() {
        System.out.println("...Starting Diagnosics");
        System.out.println("...Everything is fine");
    }
    public void addMechanicForCar(MechanicTeam thisObj) {
        if (listOfMechanics.size() > 2) {
            System.out.println("Вы можете добавить до двух механиков.");
        } else {
            listOfMechanics.add(thisObj);
            System.out.println("Механик " + thisObj.getNAME_AND_SURNAME() + " был добавлен в команду." );
        }
    }
}

