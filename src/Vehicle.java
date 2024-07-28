import java.util.regex.Pattern;

public class Vehicle {
        Colour color = null;

        String licensePlate = null;

    private static final Pattern
         deRegex = Pattern.compile("D-[A-Z] [A-Za-z]{1,2}[0-9]{1,4}"),
    /// How to avoid creating an object (throw exception)
         uSARegex = Pattern.compile("USA-[A-Za-z]{1,2}[0-9]{1,4}");
        public Vehicle(String licensePlate, Colour colour) {
            if(!deRegex.matcher(licensePlate).matches() && !uSARegex.matcher(licensePlate).matches()) {
                 throw new IllegalArgumentException("Invalid number plate: " + licensePlate);
            }
            this.licensePlate = licensePlate;
            this.color = colour;
        }

        public Colour getColour() {
            return  this.color;
        };

        public String getLicensePlate () {
            return this.licensePlate;
        }
}
