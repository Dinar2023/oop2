public class Boat extends Vehicle implements Swimmable{
    public Boat(String name){
        super(name);
    }
    int maxSpeed = 100; // (максимальная скорость на воде),
    boolean isSailing = false; // (флаг состояния движения по воде).
    @Override
    public void startSwimming() {
        isSailing=true;
        System.out.println(getName() + " Начал плыть");
    }

    @Override
    public void stopSwimming() {
        isSailing=false;
        System.out.println(getName() + " Остановился");
    }

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
        this.speed =0;
        System.out.println(this.getName() + " Остановился");
    }

    @Override
    void displayInfo() {
        System.out.println("ID  "+getID()+"\n" +
                "speed  " + this.speed +"\n"+
                "name  " + this.getName() +"\n");
    }
}
