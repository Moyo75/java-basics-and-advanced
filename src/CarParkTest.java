import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class CarParkTest {
    @Test
    public void carParkShouldContainCarWithNewNumberPlate() {
        CarPark park = new CarPark();
        park.parkIn(new Car(4, 40.0, "USA-A1", Colour.YELLOW));

        ArrayList<String> plates = park.getVehiclesPlates();

        assertEquals("USA-A1", plates.getLast());
    }

    @Test
    public void trucksShouldNotBeAllowedToParkIn() {
        CarPark park = new CarPark();

        park.parkIn(new Truck(2, "USA-A1", Colour.GREEN));
        park.parkIn(new Truck(2, "DE-B12", Colour.ORANGE));

        assertTrue(park.getVehiclesPlates().isEmpty());
        assertEquals(0.0, park.getBalance());
    }
    @Test
    public void carParkShouldIncreaseByTwoPointFive() {
        CarPark park = new CarPark();

        park.parkIn(new Car(4, 40.0, "USA-A1", Colour.GREEN));
        park.parkIn(new Car(2, 2.0, "DE-B12", Colour.RED));

        assertEquals(5.0, park.getBalance());
    }

    @Test
    public void carParkShouldNotAllowTheSameNumberPlate() {
        CarPark park = new CarPark();

        park.parkIn(new Car(4, 40.0, "USA-A1", Colour.ORANGE));
        park.parkIn(new Car(2, 30.0, "USA-A1", Colour.PURPLE));

        assertEquals(2.5, park.getBalance());
        assertEquals(1, park.getVehiclesPlates().size());
    }

    @Test
    public void carWithNumberPlateShouldDriveOut() {
        CarPark park = new CarPark();

        Car car1 = new Car(4, 40.0, "USA-A1", Colour.GREEN);
        Car car2 = new Car(2, 30.0, "USA-F778", Colour.GREEN);
        Motorcycle bike = new Motorcycle("D-C A224", Colour.GREEN, true);

        park.parkIn(car1);
        park.parkIn(car2);
        park.parkIn(bike);

        park.driveOut(car2);

        assertTrue(park.getVehiclesPlates().contains("USA-A1"));
        assertTrue(park.getVehiclesPlates().contains("D-C A224"));
        assertFalse(park.getVehiclesPlates().contains("USA-F778"));
    }

    @Test
    public void carParkBalanceRemainsTheSameAfterDrivingOut() {
        CarPark park = new CarPark();

        Car car1 = new Car(4, 40.0, "USA-A1", Colour.YELLOW);
        Car car2 = new Car(2, 30.0, "USA-F778", Colour.ORANGE);
        Motorcycle bike = new Motorcycle("D-C224", Colour.PURPLE, false);

        park.parkIn(car1);
        park.parkIn(car2);
        park.parkIn(bike);

        assertEquals(7.5, park.getBalance());

        park.driveOut(car2);
        park.driveOut(bike);

        assertEquals(7.5, park.getBalance());
    }
}
