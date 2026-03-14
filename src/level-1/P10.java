
// Write a program that reads numbers from the user until the user enters 0. The program should then display the total of all the numbers entered (excluding the 0).
import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        System.out.print("Enter number: ");
        double num = sc.nextDouble();

        while (num != 0) {
            total += num;
            System.out.print("Enter number: ");
            num = sc.nextDouble();
        }

        System.out.println("Total = " + total);
    }
}