public class Car extends Vehicle {
    Colour colour;
    int numberOfDoors;
    double trunkVolume;

    public Car(int numberOfDoors, double trunkVolume, String licensePlate, Colour colour) {
        super(licensePlate, colour);
        this.numberOfDoors = numberOfDoors;
        this.trunkVolume = trunkVolume;
    }
}
