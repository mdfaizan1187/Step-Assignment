
// Write a program to calculate the sum of first n natural numbers using both loop and formula.
import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Not a natural number");
            return;
        }

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        int formula = n * (n + 1) / 2;

        System.out.println("Sum using loop = " + sum);
        System.out.println("Sum using formula = " + formula);
    }
}