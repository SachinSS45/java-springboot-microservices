package Abstraction;
//Using interface
public class Program02 {
    public static void main(String[] args) {
        Car1 car = new ElectricCar1();
        car.accelerate();
        car.brake();
        car.start();
        Car1 car1 = new FuelCar1();
        car1.start();
        car1.brake();
        car1.accelerate();
    }
}

interface Car1{
    void start();
    void accelerate();
    void brake();
}
class FuelCar1 implements   Car1{

    @Override
    public void start(){
        System.out.println("Fuelcar is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("FuelCar is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("FuelCar is stopping");
    }
}

class ElectricCar1 implements Car1{


    @Override
    public void start(){
        System.out.println("Electric car is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Electric car is stopping");
    }
}

