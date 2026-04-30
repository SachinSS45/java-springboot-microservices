package Abstraction;
//Using Abstract class
public class Program01 {
    public static void main(String[] args) {
        Car c = new ElectricCar();
        c.start();
        c.accelerate();
        c.brake();

    }
}

abstract class Car{
    void start(){
        System.out.println("Car started");
    }

      abstract void accelerate();

    abstract void brake();
}

class FuelCar extends  Car{

    @Override
    void accelerate() {
        System.out.println("FuelCar is accelerating");
    }

    @Override
    void brake() {
        System.out.println("FuelCar is stopping");
    }
}

class ElectricCar extends Car{

    @Override
    void accelerate() {
        System.out.println("Electric car is accelerating");
    }

    @Override
    void brake() {
        System.out.println("Electric car is stopping");
    }
}