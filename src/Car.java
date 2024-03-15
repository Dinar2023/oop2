public class Car extends Vehicle{
    public Car(String name) {
        super(name);
    }
    int fuelTank = 10;  //емкость бака
    int fuelLevel = 6; //уровень топлива
    @Override
    void startEngine() {
        System.out.println(this.getName() + " Двигатель запущен");
    }

    @Override
    void stopEngine() {
        System.out.println(this.getName() + " Двигатель заглушен");
    }

    @Override
    void accelerate(int speed) {
        this.speed += speed;
        System.out.println(this.getName() + " Едет со скоростью "+ getSpeed());
    }

    @Override
    void brake() {
        System.out.println(this.getName() + " Остановился");
    }

    @Override
    void displayInfo() {
        System.out.println("ID  "+getID()+"\n" +
                "speed  " + this.speed +"\n"+
                "name  " + this.getName() +"\n");
    }
    int fuelCapacity(){
        return fuelTank;
    }
    int  currentFuelLevel(){
        return fuelLevel;
    }
    void refuel(int liters){
        fuelLevel += liters;
    }


}
