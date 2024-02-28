// Problem 1
import java.util.Scanner;
public class LogicProblem1 {
    static void converter() {
        Scanner sc = new Scanner(System.in);
        // Choose which to convert
        System.out.println("Would you like to convert from (1) Fahrenheit to Celsius,\nor (2) Celsius to Fahrenheit?");
        int decision = sc.nextInt();
        // Converter
        if (decision == 1) {
            System.out.println("Enter a temperature in Fahrenheit");
            double f = sc.nextDouble();
            System.out.println(f + " degrees Fahrenheit converted to Celsius is: " + Math.round((f - 32) * ((double) 5 / 9)) + "°");
        }
        if (decision == 2) {
            System.out.println("Enter a temperature in Celsius");
            double c = sc.nextDouble();
            System.out.println(c + " degrees Celsius converted to Fahrenheit is: " + Math.round(c * 1.8 + 32) + "°");
        }
    }
    public static void main(String[] args) {
        converter();
    }
}