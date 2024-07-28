import java.util.ArrayList;

public class CarPark {
    private final ArrayList<String> vehiclesPlates = new ArrayList<>();

    private double balance = 0.00;

    public void parkIn(Vehicle vehicle) {
        if(vehicle instanceof Truck) {
            System.out.println("Vehicle is too big.");
            // throw new IllegalArgumentException("Vehicle is too big.");
            return;
        } else if (this.vehiclesPlates.contains(vehicle.getLicensePlate())) {
            System.out.println("Vehicle already exists.");
            // throw new IllegalArgumentException("Vehicle is too big.");
            return;
        }
        this.vehiclesPlates.add(vehicle.getLicensePlate());
        this.balance += 2.50;
    }

    public void driveOut(Vehicle vehicle) {
        this.vehiclesPlates.remove(vehicle.getLicensePlate());
    }

    public ArrayList<String> getVehiclesPlates() {
        return this.vehiclesPlates;
    }

    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        CarPark newCarPark = new CarPark();

        Car car = new Car(4, 40.0, "D-K A1", Colour.GREEN);
        System.out.println(car.getLicensePlate());
        System.out.println(car.getLicensePlate());

        Car car2 = new Car(4, 40.0, "USA-B12", Colour.PURPLE);
        System.out.println(car2.getColour());

        newCarPark.parkIn(car);
        // newCarPark.parkIn(car);
        newCarPark.parkIn(car2);
        System.out.println(newCarPark.getBalance());

        // newCarPark.parkIn(new Truck(2, "A123"));
        // newCarPark.parkIn(car2);
        // System.out.println(newCarPark.balance);
        System.out.println(newCarPark.vehiclesPlates);

        newCarPark.driveOut(car2);
        System.out.println(newCarPark.vehiclesPlates);

        System.out.println(newCarPark.balance);

    }
}
