public class VehicleTester {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(1500, "Mazda");
        System.out.println(v1);
        Car car1 = new Car(1200, "Holden", "sedan", "Barina");
        Car car2 = new Car(1500, "Mazda", "sports", "323");
        System.out.println(car1);
        System.out.println(car2);

    }
}
