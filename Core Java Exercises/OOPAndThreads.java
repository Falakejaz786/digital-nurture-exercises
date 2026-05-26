class Car {
    String make;
    String model;
    int year;

    void displayDetails() {
        System.out.println(make + " " + model + " " + year);
    }
}

class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

interface Playable {
    void play();
}

class Cricket implements Playable {
    public void play() {
        System.out.println("Playing Cricket");
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class OOPAndThreads {
    public static void main(String[] args) {

        Car c = new Car();
        c.make = "Toyota";
        c.model = "Camry";
        c.year = 2022;
        c.displayDetails();

        Animal a = new Animal();
        a.makeSound();

        Dog d = new Dog();
        d.makeSound();

        Playable p = new Cricket();
        p.play();

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}
