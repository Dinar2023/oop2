public class Swimmable extends Vehicle{

    public Swimmable(String name){
        super(name);
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
        System.out.println(this.getName() + " Плывет со скоростью "+ getSpeed());
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
    void startSwimming(){
        System.out.println(getName()+" Начал плыть");
    }

    void stopSwimming(){
        System.out.println(getName()+" Остановился");
    }
}
