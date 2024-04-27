public class Vehicle {  // parent class
    public int engineCapacity;
    public String make;

    public Vehicle(int engineCapacity, String make) {
        this.engineCapacity = engineCapacity;
        this.make = make;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String toString() {
        String st1 = "Vehicle Info:\n";
        String st2 = "  engine capacity = ";
        String st3 = "  make = ";
        return st1 + st2 + getEngineCapacity() + "cc\n" + st3 + getMake();
    }
}
