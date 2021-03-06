/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 31/08/20
 *  Time: 1:13 PM
 *  File Name : StaticBinding.java
 * */
package definitions.bindings;

public class StaticBinding {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.display();
    }
}

class Vehicle {
    public void display() {
        System.out.println("Vehicle class.");
    }
}

class Car extends Vehicle {
    public void displayColor() {
        System.out.println("This car is black.");
    }
}
