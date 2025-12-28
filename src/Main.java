public class Main {

    public static void main(String[] args){
        //Create car 1.
        Car colorado = new Car();
        colorado.make = "Chevrolet";
        colorado.model = "Colorado";
        colorado.color = "Red";

        //Create car 2
        Car mustang = new Car();
        mustang.make = "Ford";
        mustang.model = "Mustang";
        mustang.color = "Blue";

        //Accelerate the Colorado.
        colorado.accelerate();

        //Turn the mustang.
        mustang.turn();

        Car defaultCar = new Car();

        Car xC60 = new Car("Volvo", "xC60", "Gold");

        //print the cars using toString() in the Car class.
        System.out.println(colorado);
        System.out.println(mustang);
        System.out.println(defaultCar);
        System.out.println(xC60);
    }
}
