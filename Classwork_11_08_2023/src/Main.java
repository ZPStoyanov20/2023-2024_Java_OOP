import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Vehicle vehicle = new Vehicle(100,100);
        vehicle.drive(10);
        System.out.println(vehicle.getFuel());
        Car car = new Car(100,100);
        car.drive(10);
        System.out.println(car.getFuel());

        FamilyCar familyCar = new FamilyCar(100,100);
        familyCar.drive(10);
        System.out.println(familyCar.getFuel());

        SportCar sportCar = new SportCar(100,100);
        sportCar.drive(10);
        System.out.println(sportCar.getFuel());
    }
}