import Drivers.transport.Transport;
import Drivers.transport.driver.Driver;
import Drivers.transport.driver.DriverTypeB;
import Drivers.transport.Bus;
import Drivers.transport.LightCar;
import Drivers.transport.Truck;
import Drivers.transport.driver.DriverTypeC;
import Drivers.transport.driver.DriverTypeD;
import Drivers.transport.driver.Exceptions.DiagnosticException;
import Drivers.transport.MechanicTeam;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

import static java.sql.DriverManager.getDriver;

public class Main {
    public static void main(String[] args) {
        DriverTypeB maxim = null;
        try {
            maxim = new DriverTypeB("maxim", 3, "B");
            DriverTypeB alex = new DriverTypeB("Alex", 4, "B");
            DriverTypeB george = new DriverTypeB("George", 6, "B");
            DriverTypeB ivan = new DriverTypeB("Ivan", 15, "B");
            Transport ferrari = new LightCar("Ferrari", "Spider", 3.0, alex);
            LightCar lamborgini = new LightCar("Lamborgini", "Turbo ", 3.0, george);
            LightCar bmw = new LightCar("BMW", "V8", 5.0, maxim);
            LightCar audi = new LightCar("AUDI", "R8", 4.3, ivan);

            DriverTypeC alexey = new DriverTypeC("Alexey", 30, "C");
            DriverTypeC sveta = new DriverTypeC("Alexey", 13, "C");
            DriverTypeC pavel = new DriverTypeC("Alexey", 2, "C");
            DriverTypeC vlad = new DriverTypeC("Alexey", 1, "C");
            Truck kamaz = new Truck("Kamaz", "Destroyer", 10.0, vlad);
            Truck ural = new Truck("URAL", "Nightmare", 12.0, pavel);
            Truck gazelle = new Truck("Gazelle", "Perevoschik", 9.4, sveta);
            Truck volvo = new Truck("Volvo", "Party Bomb v2.0", 9.0, alexey);

            DriverTypeD denis = new DriverTypeD("Denis", 10);
            DriverTypeD egor = new DriverTypeD("Egor", 9);
            DriverTypeD kirill = new DriverTypeD("Kirill", 15);
            DriverTypeD afanasy = new DriverTypeD("Afanasy", 20);
            Bus blueBus = new Bus("Mercedec", "C56", 6, denis);
            Bus greenBus = new Bus("Volvo", "DT 356", 4.5, egor);
            Bus yellowBus = new Bus("Skoda", "445d3", 5.6, kirill);
            Bus criminalBus = new Bus("Volvo", "9990", 7.0, afanasy);
            //
            ArrayDeque<Transport> transportsList = new ArrayDeque<Transport>();
            //
            transportsList.offer(ferrari);
            transportsList.offer(lamborgini);
            transportsList.offer(bmw);
            transportsList.offer(audi);
            transportsList.offer(kamaz);
            transportsList.offer(ural);
            transportsList.offer(gazelle);
            transportsList.offer(volvo);
            transportsList.offer(blueBus);
            transportsList.offer(greenBus);
            transportsList.offer(yellowBus);
            transportsList.offer(criminalBus);
            //getting list of racing transports
            //как некий метод по сути своей.
            //
            MechanicTeam pasha = new MechanicTeam("Павел Леонтьев", "Ferrari");
            MechanicTeam aleks = new MechanicTeam("Aleksandr Shum", "Lamboorgini");
            MechanicTeam max = new MechanicTeam("Maksimov Shum", "Lamb2orgini");



            System.out.println(blueBus.getDriverName());
            greenBus.addMechanicForCar(max);
            greenBus.addMechanicForCar(aleks);
//            greenBus.addMechanicForCar(pasha);


//            printInfo(blueBus);
//            printInfo(lamborgini);
//            printInfo(kamaz);
        } catch (DiagnosticException e) {
            throw new RuntimeException(e);
        }
    }
    private static void printInfo(Transport<?> transport) { // разные водители
        System.out.println("Водитель " + transport.getDriver().getFullName() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel()
                + " и будет участвовать в заезде");
    }
}