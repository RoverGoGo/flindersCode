## Inheritance

### Aims and Objectives

The aim of the practical is to provide a basis for experimentation with basic forms of inheritance

On successful completion of the practical you will have the ability to construct Java classes which extend/modify the
behaviour of existing classes by overriding (redefining) existing methods or including new methods.

### Task 1 - Checkpoint 42

1. Complete the definition of the `Vehicle` class by:
   1. adding an instance variable of type `int` named `engineCapacity`
   2. adding an instance variable of type `String` named `make`
   3. creating a constructor that takes two formal parameters and assigns the values to the instance variables
   4. create getters and setters for all instance variables
   5. adding a `toString` method that returns information about the vehicle (see example output below)
   6. add the following to the `main` method in `VehicleTester`:
      ```java
           Vehicle v1 = new Vehicle(1500, "Mazda");
           System.out.println(v1);
       ```

      The following output should be produced when the program is run (the indents are 2 spaces):  <br><br>
      **<tt>Vehicle Info:  
      &ensp; engine capacity = 1500cc  
      &ensp; make = Mazda</tt>**
      <br><br>
      **Note**, The program will not run until the definition of the `Car` class has been completed as well (second part of this task)  



2. Complete the definition of the class `Car`
   1. by adding instance variables to store the `type` and `model` (both `Strings`) of the car
   2. by adding a constructor with the following header:

      ```java
      public Car(int engineCapacity, String make, String type, String model)
	  ```  

      and which assigns the respective instance variables.  
      **Note**, the first statement in the constructor should be a call to the constructor of the super
      class (`Vehicle`):
      ```java
      super( ...
	  ```
   3. by adding getters and setters for all instance variables
   4. by adding a `toString` method which invokes its parent’s `toString` method
      (by making use of `super`) and prints out the `type` and `model`.
   5. add the following to the bottom of the `main` method in `VehicleTester`:
      ```java
           Car car1 = new Car(1200, "Holden", "sedan", "Barina");
           Car car2 = new Car(1500, "Mazda", "sports", "323");
           System.out.println(car1);
           System.out.println(car2);
       ```
      The following output should be produced when the program is run (the indents are 2 spaces):  <br><br>
      **<tt>Vehicle Info:   
      &ensp; engine capacity = 1500cc  
      &ensp; make = Mazda  
      Vehicle Info:  
      &ensp; engine capacity = 1200cc  
      &ensp; make = Holden  
      &ensp; type = sedan  
      &ensp; model = Barina  
      Vehicle Info:  
      &ensp; engine capacity = 1500cc  
      &ensp; make = Mazda  
      &ensp; type = sports  
      &ensp; model = 323</tt>**

---

### Task 2 - Checkpoint 43

1. Modify the class `Vehicle`, the parent class, to include a method called `setEngineCapacity` which allows the engine
   capacity to be changed. Assuming a `Vehicle` named `v1` has been created, the call
   ```java
    v1.setEngineCapacity(1600);
   ```
   should produce the following output:  <br><br>
   **<tt>Changing vehicle engine capacity: new capacity = 1600</tt>**  <br><br>
2. Modify the class `Car` so that it _overrides_ the method `setEngineCapacity` with its own version which output the
   message "**_Cannot change the engine capacity of a car_**" and does not change the engine capacity.

3. Add the following to bottom of the `main` method in `VehicleTester`:

   ```java
           v1.setEngineCapacity(1600);
           System.out.println(v1);
           car1.setEngineCapacity(1600);
           System.out.println(car1);
   ```  

   The following output should be produced when the program is run:  <br><br>
   **<tt>Vehicle Info:   
   &ensp; engine capacity = 1500cc  
   &ensp; make = Mazda  
   Vehicle Info:  
   &ensp; engine capacity = 1200cc  
   &ensp; make = Holden  
   &ensp; type = sedan  
   &ensp; model = Barina  
   Vehicle Info:  
   &ensp; engine capacity = 1500cc  
   &ensp; make = Mazda  
   &ensp; type = sports  
   &ensp; model = 323  
   Changing vehicle engine capacity: new capacity = 1600  
   Vehicle Info:  
   &ensp; engine capacity = 1600cc  
   &ensp; make = Mazda  
   Cannot change the engine capacity of a car  
   Vehicle Info:  
   &ensp; engine capacity = 1200cc  
   &ensp; make = Holden  
   &ensp; type = sedan  
   &ensp; model = Barina</tt>**

---

### Task 3 - Checkpoint 44 & 45

1. Add a class called `VehicleDB` which can store 5 `Vehicle` objects (You **must** use and _array_, and you will
   need to keep track of how many vehicles have been added (`private int numV`). It should include the following
   methods:
   1. a method called `addVehicle` which adds a `Vehicle`, or any of its descendants, to the database (see example
      below).
   2. a method that increases the size of the database by 10. This method should be called by the `addVehicle` method if the database becomes full.
   3. a method called `print` which prints all the `Vehicles` in the database (see example below).  
      **Hint:** make use of each `Vehicle`’s `toString` method.
   4. Add getters for the size of the database (`getSize`) and the number of vehicles in it (`getNumV`).
2. Modify the class `VehicleTester` to be:

    ```java
   public class VehicleTester {
   
       public static void main(String[] args) {
           VehicleDB vdb = new VehicleDB();
           vdb.addVehicle(new Car(1200, "Holden", "sedan", "Barina"));
           vdb.addVehicle(new Vehicle(1500, "Mazda"));
           vdb.addVehicle(new Car(1600, "Nissan", "suv", "X-Trail"));
           vdb.addVehicle(new Vehicle(1800, "Jeep"));
           vdb.addVehicle(new Vehicle(1000, "Suzuki"));
           vdb.addVehicle(new Car(2000, "Kia", "sedan", "Cerato"));
           vdb.print();
   
       }
   }
    ```

   The following output should be produced when the program is run:  <br><br>
   **<tt>=== Vehicle Data Base ===  
   Vehicle Info:  
   &ensp; engine capacity = 1200cc  
   &ensp; make = Holden  
   &ensp; type = sedan  
   &ensp; model = Barina  
   Vehicle Info:  
   &ensp; engine capacity = 1500cc  
   &ensp; make = Mazda  
   Vehicle Info:  
   &ensp; engine capacity = 1600cc  
   &ensp; make = Nissan  
   &ensp; type = suv  
   &ensp; model = X-Trail  
   Vehicle Info:  
   &ensp; engine capacity = 1800cc  
   &ensp; make = Jeep  
   Vehicle Info:  
   &ensp; engine capacity = 1000cc  
   &ensp; make = Suzuki  
   Vehicle Info:  
   &ensp; engine capacity = 2000cc  
   &ensp; make = Kia  
   &ensp; type = sedan  
   &ensp; model = Cerato </tt>**
<br><br>

3. Add a class called `HoldenDB` which inherits from (extends) `VehicleDB`. It should include:
   1. a constructor which has no formal parameters and which calls its parent’s constructor with an actual parameter of
      20 that represents the initial database size (this may cause you to add code to `VehicleDb`)
   2. a method called `addCar` which takes three parameters (capacity, type and model), creates a
      `Car` object based on these (make is always "Holden") and adds it to the database by making use one of its parent’s methods.
   3. an _overriden_ version of the `print` method that prints **=== Holdens Only ===** and then calls its parents
      `print` method
4. Add the following code at the bottom of the `main` method in the class `VehicleTester`:

    ```
            HoldenDB hdb = new HoldenDB();
            hdb.addCar(1200, "sedan", "Barina");
            hdb.addCar(3800, "wagon", "Commodore");
            hdb.print();
    ```

   The following output should be appended to the output above when the program is run:  <br><br>
   **<tt>=== Holdens Only ===  
   === Vehicle Data Base ===  
   Vehicle Info:  
   &ensp; engine capacity = 1200cc  
   &ensp; make = Holden  
   &ensp; type = sedan  
   &ensp; model = Barina  
   Vehicle Info:  
   &ensp; engine capacity = 3800cc  
   &ensp; make = Holden  
   &ensp; type = wagon  
   &ensp; model = Commodore</tt>**
    ---
