/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 29/08/20
 *  Time: 12:04 PM
 *  File Name : Example6.java
 * */
package definitions.examples;

public class Example6 {
    public static void main(String[] args) {
        Bike myBike = new Bike(1);
        myBike.printBikeInformation(); // method call
        SuperBike mySuperBike = new SuperBike(2, 230);
        mySuperBike.printBikeInformation();
        RacingBike myRacingBike = new RacingBike(3, 250, 7);
        myRacingBike.printBikeInformation();
    }
}

class Bike {
    private final int serialNumber;

    public Bike(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    // method body
    public void printBikeInformation() {
        System.out.println("serialNumber = " + serialNumber);
    }
}

class SuperBike extends Bike {
    int maxSpeed;

    public SuperBike(int serialNumber, int maxSpeed) {
        super(serialNumber); // calling the constructor of the Bike class
        // and passing the serialNumber parameter as an argument.
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void printBikeInformation() {
        super.printBikeInformation();
        System.out.println("maxSpeed = " + maxSpeed);
    }
}

class RacingBike extends SuperBike {
    private int racingTeamID;

    public RacingBike(int racingTeamID) {
        super(0, 0);
        this.racingTeamID = racingTeamID;
    }

    public RacingBike(int serialNumber, int maxSpeed, int racingTeamID) {
        super(serialNumber, maxSpeed);
        this.racingTeamID = racingTeamID;
    }

    @Override
    public void printBikeInformation() {
        super.printBikeInformation();
        System.out.println("racingTeamID = " + racingTeamID);
    }
}






