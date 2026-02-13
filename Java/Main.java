// Abstract base class
abstract class Vehicle {
    String model;
    String company;

    Vehicle(String model, String company) {
        this.model = model;
        this.company = company;
    }

    // Abstract method
    abstract void display();
}

// Car class extending Vehicle
class Car extends Vehicle {
    int dno;
    String fuelType;

    Car(String model, String company, int dno, String fuelType) {
        super(model, company);
        this.dno = dno;
        this.fuelType = fuelType;
    }

    // Overriding abstract method
    @Override
    void display() {
        System.out.println("Car Model: " + model);
        System.out.println("Company: " + company);
        System.out.println("Door No: " + dno);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Electric class extending Car
class Electric extends Car {
    int batteryCapacity;

    Electric(String model, String company, int dno, int batteryCapacity) {
        super(model, company, dno, "Electric");
        this.batteryCapacity = batteryCapacity;
    }

    // Method overriding (dynamic method dispatch)
    @Override
    void display() {
        super.display();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Main class to demonstrate dynamic method dispatch
public class Main {
    public static void main(String[] args) {
        Vehicle v;                 // base class reference
        v = new Electric("Model S", "Tesla", 4, 100);

        // Dynamic method dispatch
        v.display();
    }
}
