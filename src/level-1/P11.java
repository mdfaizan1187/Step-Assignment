
// Write a program that reads numbers from the user until a non-positive number is entered. The program should then display the total of all the positive numbers entered.
import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        while (true) {
            System.out.print("Enter number: ");
            double num = sc.nextDouble();

            if (num <= 0) {
                break;
            }

            total += num;
        }

        System.out.println("Total = " + total);
    }
}