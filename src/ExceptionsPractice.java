import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExceptionsPractice {
    public static void f(int x) {
        System.out.println ("num is now " + (x * 2));
    }

    public static boolean greaterThanZero(int number) {
        if(number < 0)
            throw new ArithmeticException("Number is less than zero.");
        return true;
    }

    public static void isEven(int number) {
        if(number % 2 == 1)
            throw new ArithmeticException("Number is is odd.");
        return;
    }

    public static void main(String[] args)  {

//       try {
//           isEven(1);
//       } catch (Exception report) {
//           System.out.println("Error: " + report.getMessage());
//       } finally {
//           System.out.println("Program is over.");
//       }


        String[] str = { "Apple", "Banana" };
        List<String> l = Arrays.asList(str);
        System.out.println(l);

        l.add("Pawpaw");

//        int[] numbers = {1,2,3,4,5};
//
//        for (int number : numbers) {
//            f(number);
//        }

//        try {
//            int[] numbers = {1,2,3,4,5};
//            for (int i = 0; i <numbers.length; i++) {
//                System.out.println(numbers[i]);
//            }
//        } catch (Exception ignored) {
//            System.out.println("Something went wrong.");
//        } finally {
//            System.out.println("The 'try-catch' is done.");
//        }

    }
}
