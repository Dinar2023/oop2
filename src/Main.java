//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Swimmable vertik1 = new Swimmable("Вертик");
 vertik1.accelerate(5);
 vertik1.displayInfo();
        Swimmable vertik2 = new Swimmable("Вертик2");
        vertik2.accelerate(5);
        vertik2.displayInfo();
    }
}