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

import java.util.*;

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
            DriverTypeD deniCopy = new DriverTypeD("Denis", 10);
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

            MechanicTeam pasha = new MechanicTeam("Павел Леонтьев");
            MechanicTeam aleks = new MechanicTeam("Aleksandr Shum");
            MechanicTeam max = new MechanicTeam("Maksimov Shum");
            MechanicTeam max2 = new MechanicTeam("Maksimov Shum");

            Map<Transport, MechanicTeam> hashMap = new HashMap<>(); // готово
            hashMap.put(ferrari, pasha);
            hashMap.put(ferrari, aleks);
            hashMap.put(lamborgini, aleks);
            hashMap.put(bmw, max2);
            hashMap.put(bmw, max);
            for (Map.Entry<Transport, MechanicTeam> entry : hashMap.entrySet()) {
                System.out.println("Машина " + entry.getKey() + " Механик " + entry.getValue());
            }


            Set<Driver> listOfDrivers = new HashSet<>();
            listOfDrivers.add(denis);
            listOfDrivers.add(afanasy);
            listOfDrivers.add(maxim);
            listOfDrivers.add(egor);
            listOfDrivers.add(kirill);
            listOfDrivers.add(alex);
            listOfDrivers.add(pavel);
            listOfDrivers.add(sveta);
            listOfDrivers.add(ivan);
            listOfDrivers.add(denis); // изначально показывался такой метод, когда повторы не выводятся в консоль
            listOfDrivers.add(deniCopy);//оп, но этого не было в задании


            for (Object ofDriver : listOfDrivers) {
                System.out.println(ofDriver.toString());
            }

//            System.out.println(blueBus.getDriverName());
//            greenBus.addMechanicForCar(max);
//            greenBus.addMechanicForCar(aleks);
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