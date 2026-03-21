package Test;
abstract class Animal{
    private String name;
    private String age;
    Animal(String name,String age)
    {
        this.name=name;
        this.age=age;
    }
    abstract void makeSound();
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);

    }
}
class Lion extends Animal{
    Lion(String name,String age)
    {
        super(name,age);
    }
    @Override
    void makeSound() {
        System.out.println("Lion Roarrr....");
    }
}
class Monkey extends Animal{
    Monkey(String name,String age)
    {
        super(name,age);
    }
    @Override
    void makeSound() {
        System.out.println("Monkey Oo..Aaaaa,,,Ooo.. Aaaa....");
    }
}
class Elephant extends Animal{
    Elephant(String name,String age)
    {
        super(name,age);
    }
    @Override
    void makeSound() {
        System.out.println("Pawoooo.....");
    }
}
public class Quest4 {
    public static void main(String[] args) {
    Animal a1 = new  Lion("Lion","5");
    Animal a2 = new  Monkey("Monkey","2");
    Animal a3 = new  Elephant("Elephant","10");
    a1.makeSound();
    a2.makeSound();
    a3.makeSound();

    }
}
