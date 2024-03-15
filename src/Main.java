//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aircraft samolet1 = new Aircraft("Самолет №1");
        samolet1.startEngine();
        samolet1.takeOff();
        samolet1.accelerate(100);
        samolet1.displayInfo();
        samolet1.takeLand();
        samolet1.stopEngine();

        Car car1 = new Car("Машина №1");
        System.out.println(car1.currentFuelLevel());
        car1.refuel(6);
        car1.refuel(3);
        System.out.println(car1.currentFuelLevel());
        car1.startEngine();
        car1.accelerate(40);
        car1.brake();
        car1.startEngine();

        Boat boat1 = new Boat("Лодка №1");
        boat1.startEngine();
        boat1.startSwimming();
        boat1.accelerate(5);
        System.out.println(boat1.isSailing);
        boat1.stopSwimming();
        System.out.println(boat1.isSailing);
        boat1.stopEngine();
    }
}