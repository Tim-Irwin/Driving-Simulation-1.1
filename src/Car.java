public class Car {

    //Attributes to define a car's attributes.
    String make;
    String model;
    String color;

    //using a no-argument constructor.
    public Car(){
        this.make = "Unknown";
        this.model = "Unknown";
        this.color = "Black";
    }

    //Using a parametrized constructor.
    public Car(String make, String model, String color){
        this.make = make;
        this.model = model;
        this.color = color;
    }

    //Car acceleration method.
    public void accelerate(){
        System.out.println("The car is accelerating!");
    }

    //Car turning method
    public void turn(){
        System.out.println("The car is trurning!");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
