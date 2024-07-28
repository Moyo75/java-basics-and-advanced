import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {
    @Test (expected = IllegalArgumentException.class)
    public void incorrectNumberPlateShouldNotBeCreated() throws Exception {
        Vehicle vehicle = new Vehicle("US-A123", Colour.ORANGE);
        Vehicle vehicle2 = new Vehicle("D-A123", Colour.YELLOW);

        assertNull(vehicle.getLicensePlate());
        assertNull(vehicle2.getLicensePlate());

        // try catch here so the tests doesn't fail due to exception.
    }

    @Test
    public void numberPlateShouldBeCorrect() throws Exception {
        Vehicle vehicle = new Vehicle("USA-A123", Colour.ORANGE);
        Vehicle vehicle2 = new Vehicle("D-K A123", Colour.YELLOW);

        assertEquals("USA-A123", vehicle.getLicensePlate());
        assertEquals("D-K A123" ,vehicle2.getLicensePlate());
    }
}
