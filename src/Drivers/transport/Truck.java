package Drivers.transport;

import Drivers.transport.driver.DriverTypeC;

public class Truck extends Transport<DriverTypeC> {

    enum WeightTo {
        N1(3.5f),
        N2(3.5f, 12.0f),
        N3(12.0f),
        ;
        private final float startWeight;
        private final float endWeight;
        private final String startWeightString;

        WeightTo(float startWeight, float endWeight) {
            this.startWeight = startWeight;
            this.endWeight = endWeight;
            startWeightString = "not counted";
        }

        WeightTo(float endWeight) {
            this.startWeightString = "null";
            this.endWeight = endWeight;
            this.startWeight = 0.0f;
        }

        @Override
        public String toString() {
            if (startWeightString.equals("null")) {
                return "up to " + endWeight + " tonn";
            }
            return "from " + startWeight + "up to " + endWeight + " tonn";
        }
    }

    private WeightTo weight;

    public Truck(String brand, String model, double engineVolume, DriverTypeC driverTypeC) {
        super(brand, model, engineVolume, driverTypeC);
    }

    public Truck(String brand, String model, double engineVolume, DriverTypeC driverTypeC, WeightTo weight) {
        super(brand, model, engineVolume, driverTypeC);
        this.weight = weight;
    }

    @Override
    public void printType() {
        if (!weight.equals("null")) {
            System.out.println("Transport " + getModel() + " has type: " + weight + ".");
        } else {
            System.out.println("Not enough info about " + getModel());
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Changing huge wheels");
        System.out.println("Succesfully finished!");
    }

    @Override
    public void theBestTimeCircle(int circleTimeNum) {
        System.out.println("Finding the best circle time");
        System.out.println("The best circle time is " + circleTimeNum);
    }

    @Override
    public void maxSpeed(int speed) {
        System.out.println("...Watching the database ...");
        System.out.println("Your max speed was: " + speed);
    }

    public WeightTo getWeight() {
        return weight;
    }

    public void setWeight(WeightTo weight) {
        this.weight = weight;
    }

    @Override
    public void startDiagnostics() {
        super.startDiagnostics();
    }
}
