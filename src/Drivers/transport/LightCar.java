package Drivers.transport;

import Drivers.transport.driver.DriverTypeB;


public class LightCar extends Transport <DriverTypeB> {

    enum LightCarType {
        CEDAN("Седан"),
        HATCHBACK("Хетч бек"),
        CUPE("Купе"),
        UIVERSAL("Универсал"),
        OFF_ROAD("Офф - райд"),
        CROSSOVER("Кросс-овер"),
        PICK_UP("Пик ап"),
        FOURGON("Фургон"),
        MINI_VAN("Мини-Вен"),
        ;
        private final String typeOnRussian;
        LightCarType(String typeOnRussian) {
            this.typeOnRussian = typeOnRussian;
        }

        @Override
        public String toString() {
            return "Тип кузова " + typeOnRussian;
        }
    }
    private LightCarType type;
    public LightCar(String brand, String model, double engineVolume, DriverTypeB driverTypeB) {
        super(brand, model, engineVolume, driverTypeB);
    }
    public LightCar(String brand, String model, double engineVolume, DriverTypeB driverTypeB, LightCarType type) {
        super(brand, model, engineVolume, driverTypeB);
        this.type = type;
    }

    @Override
    public void printType() {
        if (!type.equals("null")) {
            System.out.println("Transport " + getModel() + " has type: " + type + ".");
        } else {
            System.out.println("Not enough info about " + getModel());
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Method works");
    }

    @Override
    public void theBestTimeCircle(int circleTime) {
        System.out.println("Watching information...");
        System.out.println("The best circle time is " + circleTime);
    }

    @Override
    public void maxSpeed(int speed) {
        System.out.println("Asking a database...");
        System.out.println("Your max speed was: " + speed);
    }

    public LightCarType getType() {
        return type;
    }

    public void setType(LightCarType type) {
        this.type = type;
    }

    @Override
    public void startDiagnostics() {
        super.startDiagnostics();
    }
}