package GenericsPractice;

import java.util.List;

class Animal{
    public void sound(){
        System.out.println("Some Animal Sound");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println(" Dog Sound");
    }
}

class Cat extends Animal{
    public void sound(){
        System.out.println(" Cat Sound");
    }
}

public class AnimalDemo {
    public static void makeSound(List<?extends Animal > animals){
        for (Animal animal : animals){
            animal.sound();
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());
        makeSound(dogs);
        makeSound(cats);

    }
}
