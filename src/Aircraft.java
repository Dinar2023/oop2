public class Aircraft  extends Vehicle implements Flyable {
    public Aircraft(String name) {
        super(name);
    }
    int maxAltitude = 1000; //(максимальная высота полета),
    boolean isFlying = false; //(флаг состояния полета

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
        System.out.println(this.getName() + " Летит со скоростью " + getSpeed());
    }

    @Override
    void brake() {
        this.speed =0;
        System.out.println(this.getName() + " Остановился");
    }

    @Override
    void displayInfo() {
        System.out.println("ID  " + getID() + "\n" +
                "speed  " + this.speed + "\n" +
                "name  " + this.getName() + "\n");
    }


    @Override
    public void takeOff() {
        System.out.println(getName()+" Взлетает");
        isFlying = true;
    }

    @Override
    public void takeLand() {
        System.out.println(getName()+" Садится");
        isFlying = false;
    }
}
