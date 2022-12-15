package Polymorphism;

public class MyMain {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();

        Animal myPig = new Pig();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        myCat.animalSound();


        System.out.println(myAnimal instanceof Animal);
        System.out.println(myAnimal instanceof Pig);
        System.out.println(myPig instanceof Pig);
        System.out.println(myPig instanceof Animal);
        System.out.println(myAnimal instanceof Cat);
        System.out.println(myAnimal instanceof Dog);
        System.out.println(myDog instanceof Animal);

    }
}
