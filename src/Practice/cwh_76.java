package Practice;
 abstract class Health{
    protected int health;
    protected int power;
    public Health(int health, int power) {
        this.health = health;
        this.power = power;
    }
    void displayHealth(){
        System.out.println("Health: " + this.health);
        System.out.println("Power: " + this.power);
    }
    public abstract void defend();
}
class Warior extends Health{
    public Warior(int health, int power) {
        super(health, power);
    }
    @Override
    public void defend() {
        System.out.println("Defending Warrior");

    }
}

public class cwh_76 {
    static void main() {
    Health health = new Warior(10, 20);
    health.displayHealth();
    health.defend();
    }
}
