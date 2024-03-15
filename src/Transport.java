public abstract class Transport {
    private int IDc = 1;
    private int ID;
    private String name = "";
    private String brand;
    private String model;
    int speed;
    private int year;
    public Transport (String name){
        this.ID = IDc;
        IDc +=1;
        this.name = name;
        this.speed = 0;
        this.year = 0;
    }
    int getID(){
        return ID;
    }
    Integer getSpeed(){
        return this.speed;
    }
    String getName (){
        return name;
    }
    abstract void startEngine();
    abstract void stopEngine();
    abstract void accelerate(int speed);
    abstract void brake();
    abstract void displayInfo();
}
