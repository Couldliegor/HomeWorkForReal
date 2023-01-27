package Drivers.transport;

import Drivers.transport.driver.DriverTypeB;
import Drivers.transport.driver.DriverTypeC;
import Drivers.transport.driver.DriverTypeD;

public class Bus extends Transport<DriverTypeD> implements Racing {
    enum Capacity {
        VERY_LIL(10, "null"),
        LIL(25, "null"),
        MIDDLE(40, 50),
        BIG(60, 80),
        VERY_BIG(100, 120),
        ;
        private final int starterCapacity;
        private final int endCapacity;

        private String noStart;

        Capacity(int starterCapacity, int endCapacity) {
            this.starterCapacity = starterCapacity;
            this.endCapacity = endCapacity;
        }

        Capacity(int endCapacity, String noStart) {
            this.endCapacity = endCapacity;
            this.starterCapacity = -100;
            noStart = "nully";
        }

        @Override
        public String toString() {
            if (noStart.equals("nully")) {
                return "up to " + endCapacity + " places";
            }
            return "Capacity " + starterCapacity + " - " + endCapacity + " places";
        }
    }

    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, DriverTypeD driverTypeD) {
        super(brand, model, engineVolume, driverTypeD);
    }

    public Bus(String brand, String model, double engineVolume, DriverTypeD driverTypeD, Capacity capacity) {
        super(brand, model, engineVolume, driverTypeD);
        this.capacity = capacity;
    }

    @Override
    public void pitStop() {
        System.out.println("Method works");
    }

    @Override
    public void theBestTimeCircle(int timeCircle) {
        System.out.println("Method works, the best timeCircle is " + timeCircle);
    }

    @Override
    public void maxSpeed(int speed) {
        System.out.println("Your max speed was: " + speed);
    }

    @Override
    public void printType() {
        if (!capacity.equals("null")) {
            System.out.println("Transport " + getModel() + " has type: " + capacity + ".");
        } else {
            System.out.println("Not enough info about " + getModel());
        }
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void startDiagnostics() {
        throw new RuntimeException("Sorry, we cant make Diagnostic for you transport");
    }
}
