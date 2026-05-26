class Car {
    String make;
    String model;
    int year;

    void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class CarDemo {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.make = "Toyota";
        c1.model = "Camry";
        c1.year = 2022;

        Car c2 = new Car();
        c2.make = "Honda";
        c2.model = "Civic";
        c2.year = 2021;

        c1.displayDetails();
        System.out.println();
        c2.displayDetails();
    }
}
