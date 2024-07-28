public class Truck extends Vehicle{
    Colour colour;

    int numberOfAxle;

    public Truck (int numberOfAxle, String licensePlate, Colour colour) {
        super(licensePlate, colour);
        this.numberOfAxle = numberOfAxle;
    }
}
