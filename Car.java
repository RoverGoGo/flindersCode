public class Car extends Vehicle {
    // ... extra code here ...
    public String type;
    public String model;

    public Car(int engineCapacity, String make, String type, String model) {
        super(engineCapacity, make);
        this.type = type;
        this.model = model;
    }

    @Override
    public String toString() {
        String st1 = "  type = ";
        String st2 = "  model = ";
        return super.toString() + "\n" + st1 + type + "\n" + st2 + model;

    }
}
