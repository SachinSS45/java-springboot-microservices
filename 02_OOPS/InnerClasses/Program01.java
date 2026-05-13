package InnerClasses;
//Static Inner class : Used for Builder Design Pattern
/*
    Why Static Inner Class Here?
    1.The CarBuilder doesn’t need an instance of Car to exist—it just prepares data to construct one.

    2.It keeps the builder tightly coupled with Car, but avoids unnecessary references to outer class instances
 */

/*
    A static inner class in Java is a nested class declared with the static keyword inside another class.
    Unlike regular inner classes, it does not hold a reference to the outer class instance.
    This makes it useful when the nested class is more like a helper or utility that doesn’t
    need access to the outer class’s instance variables.

🔑 Use Cases
        1.Grouping related classes together

        Keeps helper classes logically tied to their parent class without cluttering the package.

        2.Utility or builder classes

        Often used for implementing the Builder Pattern or other helper logic.

        3.Improved encapsulation

        The static inner class can access private members of the outer class, but it doesn’t require an outer class object.

        4.Memory efficiency

        Since it doesn’t hold a reference to the outer class, it avoids unnecessary memory usage.
 */
public class Program01 {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setBrand("Tesla")
                .setModel("Model S")
                .setYear(2025)
                .build();

        System.out.println(car);
    }
}

class Car {
    private String brand;
    private String model;
    private int year;

    // Private constructor
    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
    }

    // Static inner class as Builder
    public static class CarBuilder {
        private String brand;
        private String model;
        private int year;

        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + year + ")";
    }
}


