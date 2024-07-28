import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // master (Root-Commit) caa7b77
        // System.out.print("Hello Java.pref");
         System.out.print(Arrays.toString(args));

        // printNameOnScreen("John", "Ademoye");
        // System.out.println(numberOfSecondsInAYear());
        // readThreeNumbersAndDisplayTheBiggest();

        // eightByEightChessBoard();
        // System.out.println(factorial(4));
        // legalAge(15);

        // printNameOnTheScreen();
        // getNumAndAddAllBetween();
        // System.out.println(calculateAreaCircle(2));
        // System.out.println(checkEven(3));
        // generateArrayWithThousandEntries();
        // generateArrayWithTenEntries();
        // getThreeNumAndSumAverageProduct();
        // System.out.println(convertNumberToTimeStatement(3685));
        // fizzBuzzWithFor();
        // System.out.println(multRecursively(2, -2));
        // System.out.println(multFloatRecursively(3, 1/3));
        // System.out.println(readCSVFile());
        // writeCSVFile();
        // readCSVFile();
        // calculateShapeArea();

        // Counter counter = new Counter(0);

//        System.out.println(counter.getValue());
//        counter.increase();
//        System.out.println(counter.getValue());
    }

    // Java Basics
    // 2
    public static void printNameOnScreen(String firstname, String surname) {
        System.out.printf("%s %s%n", firstname, surname);
    }

    // Java Basics
    // 3
    public static int numberOfSecondsInAYear() {
        return 365 * 24 * 60 * 60;
    }

    // Java Basics
    // 4
    public static void readThreeNumbersAndDisplayTheBiggest() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter three numbers:");

        int number1 = Integer.parseInt(getNumberFromUser(scanner, "Enter the first number: "));
        int number2 = Integer.parseInt(getNumberFromUser(scanner, "Enter the second number: "));
        int number3 = Integer.parseInt(getNumberFromUser(scanner, "Enter the third number: "));

        int max = Math.max(Math.max(number1, number2), number3);

        System.out.print("Maximum is " + max + ".");
    }

    // Java Basics
    // 5
    public static void eightByEightChessBoard() {
        // White and black boxes in Java
        for (int i = 0; i < 8; i++) {
            System.out.println();
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
        }
    }

    // Java Basics
    // 6
    public static int factorial(int n) {
        if (n < 0) {
            return n * factorial(n + 1);
        }
        return n == 0 ? 1 : n * factorial(n - 1);
    }

    // Java Basics
    // 7
    public static void legalAge(int age) {
        String firstError = "Sie dürfen überhaupt nicht fahren";
        String secondError = "Sie dürfen nicht wählen.";
        String thirdError = "Es ist nicht möglich, ein Auto zu mieten.";
        String fourthError = "Es ist nicht möglich, ein Auto zu mieten.";

        if (age < 16) {
            System.out.println(firstError);
            System.out.println(secondError);
            System.out.println(thirdError);
        } else if (age < 18) {
            System.out.println(secondError);
            System.out.println(thirdError);
        } else if (age < 25) {
            System.out.println(thirdError);
        } else {
            System.out.println(fourthError);
        }
    }

    // Java Basics
    // 8
    public static void printNameOnTheScreen() {
        for (int i = 0; i < 10; i++) {
            System.out.println("John Ademoye");
        }
    }

    // Java Basics
    // 9
    public static void getNumAndAddAllBetween() {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(getNumberFromUser(scanner, "Please enter a number: "));
        int sum = 0;

        for (int i = 0; i <= number; i++) {
            sum += i;
            System.out.println(i);
        }

        System.out.print("Sum is " + sum + ".");
    }

    // Java Basics
    // 10
    public static double calculateAreaCircle(int radius) {
        return radius * radius * Math.PI;
    }

    public static int calculateAreaRectangle(int length, int width) {
        return length * width;
    }

    public static int calculateAreaSquare(int side) {
        return side * side;
    }

    public static double calculateAreaTriangle(int base, int height) {
        return 0.5 * base * height;
    }

    private static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    private static String getNumberFromUser(Scanner inputScanner, String prompt) {
        System.out.println(prompt);
        String input = "";

        while (true) {
            input = inputScanner.nextLine();
            if(isInteger(input))
                break;
            System.out.println("Invalid number, try again. " + prompt);
        }

        return input;
    }
    public static void calculateShapeArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which shape?");
        String shape = scanner.nextLine();

        int radius, length, width, side, base, height;

        switch (shape.toLowerCase()) {
            case "circle":

                radius = Integer.parseInt(getNumberFromUser(scanner, "Enter radius of the circle: "));
                System.out.println("Area of circle is " + calculateAreaCircle(radius) + ".");
                break;

            case "rectangle":

                length = Integer.parseInt(getNumberFromUser(scanner, "Enter length of the rectangle: "));
                width = Integer.parseInt(getNumberFromUser(scanner, "Enter width of the rectangle: "));
                System.out.println("Area of rectangle is " + calculateAreaRectangle(length, width) + ".");
                break;

            case "square":

                side = Integer.parseInt(getNumberFromUser(scanner, "Enter the size of any side of the square: "));
                System.out.println("Area of circle is " + calculateAreaSquare(side) + ".");
                break;

            case "triangle":

                base = Integer.parseInt(getNumberFromUser(scanner, "Enter the base of the triangle: "));
                height = Integer.parseInt(getNumberFromUser(scanner, "Enter the height of the triangle: "));
                System.out.println("Area of triangle is " + calculateAreaTriangle(base, height) + ".");
                break;

            default:

                System.out.println("Enter a supported shape (circle, rectangle, triangle or square): ");
                calculateShapeArea();
        }

    }

    // Java Basics
    // 11
    public static boolean checkEven(int number) {
        return number % 2 == 0;
    }

    // Java Basics
    // 12
    public static void generateArrayWithThousandEntries() {
        int[] wholeNumbers = new int[1000];
        Random random = new Random();

        for (int i = 0; i < wholeNumbers.length; i++) {
            wholeNumbers[i] = random.nextInt(100 - 10) + 10;
        }

        System.out.println(Arrays.toString(wholeNumbers));
    }

    // Java Basics
    // 13
    public static void generateArrayWithTenEntries() {
        int[] wholeNumbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < wholeNumbers.length; i++) {
            wholeNumbers[i] = random.nextInt(100 - 1) + 1;
        }

        System.out.println(Arrays.toString(wholeNumbers));

        int biggest = 0;

        for (int wholeNumber : wholeNumbers) {
            if (wholeNumber > biggest)
                biggest = wholeNumber;
        }

        System.out.println("Biggest number is " + biggest + ".");
    }

    // Java Basics
    // 14
    public static void getThreeNumAndSumAverageProduct() {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(getNumberFromUser(scanner, "Please enter the first number: "));
        int number2 = Integer.parseInt(getNumberFromUser(scanner, "Please enter the second number: "));
        int number3 = Integer.parseInt(getNumberFromUser(scanner, "Please enter the third number: "));

        int min = Math.min(Math.min(number1, number2), number3);
        int max = Math.max(Math.max(number1, number2), number3);

        System.out.println("Sum is " + (min + max) + ".");
        System.out.println("Average is " + (min + max) / 2 + ".");
        System.out.println("Product is " + (min * max) + ".");
    }

    // Java Basics
    // 15
    public static String convertNumberToTimeStatement(int totalSeconds) {

        int days = totalSeconds / 86400;
        int hours = (totalSeconds % 86400) / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        return String.format("%d days, %d hours, %d minutes, %d seconds", days, hours, minutes, seconds);
    }

    // Java Basics
    // 16a
    public static void fizzBuzzWithFor() {
        for (int i = 1; i <= 100; i++) {

            boolean divisibleBy3 = (i % 3) == 0;
            boolean divisibleBy5 = (i % 5) == 0;

            if (divisibleBy3 && divisibleBy5) {
                System.out.println(i + ": FizzBuzz");
            } else if (divisibleBy3) {
                System.out.println(i + ": Buzz");
            } else if (divisibleBy5) {
                System.out.println(i + ": Fizz");
            }
        }
    }

    // 16b
    public static void fizzBuzzWithWhile() {
        int i = 1;
        while (i <= 100) {
            boolean divisibleBy3 = (i % 3) == 0;
            boolean divisibleBy5 = (i % 5) == 0;

            if (divisibleBy3 && divisibleBy5) {
                System.out.println(i + ": FizzBuzz");
            } else if (divisibleBy3) {
                System.out.println(i + ": Buzz");
            } else if (divisibleBy5) {
                System.out.println(i + ": Fizz");
            }

            i++;
        }
    }

    // 16c
    public static void fizzBuzzWithDoWhile() {
        int i = 1;

        do {
            boolean divisibleBy3 = (i % 3) == 0;
            boolean divisibleBy5 = (i % 5) == 0;

            if (divisibleBy3 && divisibleBy5) {
                System.out.println(i + ": FizzBuzz");
            } else if (divisibleBy3) {
                System.out.println(i + ": Buzz");
            } else if (divisibleBy5) {
                System.out.println(i + ": Fizz");
            }
            i++;

        } while (i <= 100);
    }

    // Java Basics
    // 17
    public static int multRecursively(int x, int y) {
        if(x < 0) {
            return -1 * (multRecursivelyHelper(x , y));
        }
        return x == 0 ? 0 : y + multRecursively(x - 1, y);
    }

    private static  int multRecursivelyHelper(int absOfX, int y) {
        return absOfX == 0 ? 0 : y + multRecursivelyHelper(absOfX + 1, y);
    }
    // Anpassung für beides.
    public static float multFloatRecursively(int x, float y) {
        /// Noch mal gucken
        if(x < 1 ) {
            return -1 * (multFloatRecursivelyHelper(x , y));
        }
        return y + multFloatRecursively(x - 1, y);
    }

    private static float multFloatRecursivelyHelper(int x, float y) {
        /// Noch mal gucken
        return x == 0 ? 0 : y + multFloatRecursivelyHelper(x + 1, y);
    }

    // Java Basics
    // 18
    public static void writeCSVFile(List<Integer> numbers) throws IOException {
        try (FileWriter file = new FileWriter("book.csv");
             BufferedWriter writer = new BufferedWriter(file);) {

            for (Integer number : numbers) {
                writer.write(number + System.lineSeparator());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readCSVFile() throws IOException {
        List<Integer> numbers = new ArrayList<>();

        try (FileReader file = new FileReader("numbers.csv");
             BufferedReader buffer = new BufferedReader(file);) {

            String str;

            while ((str = buffer.readLine()) != null) {
                numbers.add(Integer.parseInt(str));
            }
        }

        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Collections.sort(numbers);
        // numbers nicht richtig sortiert.

        System.out.println(numbers);

        writeCSVFile(numbers);

    }
}
