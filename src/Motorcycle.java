public class Motorcycle extends Vehicle {
    Boolean passenger;
    Colour colour;

    public Motorcycle(String licensePlate, Colour colour, Boolean passenger) {
        super(licensePlate, colour);
        this.passenger = passenger;
    }

    public Boolean getPassenger() {
        return this.passenger;
    }
}
