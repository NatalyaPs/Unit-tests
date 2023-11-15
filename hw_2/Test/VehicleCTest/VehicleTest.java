package VehicleCTest;

import static org.assertj.core.api.Assertions.*;

import VehicleC.Car;
import VehicleC.Motorcycle;
import VehicleC.Vehicle;
import org.junit.jupiter.api.*;


//Написать следующие тесты:
//        - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
//        - проверка того, объект Car создается с 4-мя колесами
//        - проверка того, объект Motorcycle создается с 2-мя колесами
//        - проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
//        - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
//        - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
//        - проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
public class VehicleTest {

    // проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    void testCarInstanceOfVehicle() {
        Car car = new Car("GAZ", "gaz", 2020);
        assertThat(car instanceof Vehicle);
    }

    // проверка того, объект Car создается с 4-мя колесами
    @Test
    void testCarHasFourWheels() {
        Car car = new Car("GAZ", "gaz", 2020);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    // проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Jawa", "jawa", 1980);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    // проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    void testCarSpeedTestDriving() {
        Car car = new Car("GAZ", "gaz", 2020);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    // проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    void testMotorcycleSpeedTestDriving() {
        Motorcycle motorcycle = new Motorcycle("Jawa", "jawa", 1980);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    // проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    void testCarSpeedParking() {
        Car car = new Car("GAZ", "gaz", 2020);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    // проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    void testMotorcycleParking() {
        Motorcycle motorcycle = new Motorcycle("Jawa", "jawa", 1980);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}
