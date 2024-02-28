// Problem 11
import java.util.Scanner;
public class LogicProblem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        int reversedNum = reverseNumber(num);
        System.out.println("Reversed number: " + reversedNum);
    }
    public static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10; }
        return reversedNum;
    }
}

