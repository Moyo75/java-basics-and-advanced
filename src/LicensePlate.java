import java.util.Random;

public class LicensePlate {
    String[] countryAbbreviations = {
            "USA",
            "CAN",
            "GBR",
            "AUS",
            "GER",
            "FRA",
            "JPN",
            "ITA",
            "BRA",
            "IND",
            "CHN",
            "RUS",
            "MEX",
            "ESP",
            "ARG",
            "NLD",
            "CHE",
            "SWE",
            "POL",
            "BEL"
    };

    static String generateLetters(int amount) {
        String letters = "";
        int n = 'Z' - 'A' + 1;
        for (int i = 0; i < amount; i++) {
            char c = (char) ('A' + Math.random() * n);
            letters += c;
        }
        return letters;
    }
    public String generateDigits(int amount) {
        String digits = "";
        int n = '9' - '0' + 1;
        for (int i = 0; i < amount; i++) {
            char c = (char) ('0' + Math.random() * n);
            digits += c;
        }
        return digits;
    }

    public String generateLicensePlate() {
        Random random = new Random();
        String licensePlate;
        String letters;

        int num = random.nextInt(this.countryAbbreviations.length + 1);

        letters = generateLetters(3);
        String digits = generateDigits(3);

        licensePlate = this.countryAbbreviations[num] +  "-" + letters + digits;
        return licensePlate;
    }

    public static void main(String[] args) {
        LicensePlate plate = new LicensePlate();
        System.out.println(plate.generateLicensePlate());
    }
}
