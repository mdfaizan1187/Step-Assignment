
// Write a program that takes a number as input and counts down from that number to 1, printing each number on a new line.
import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown number: ");
        int counter = sc.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
    }
}