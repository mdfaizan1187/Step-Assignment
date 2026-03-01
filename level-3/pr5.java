//Que 5. Write a Java program to swap two numbers without using a third variable.
import java.util.Scanner;
public class Codes_Level_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_1,num_2;
        System.out.println("Enter the first number: ");
        num_1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        num_2 = sc.nextInt();
        int c;
        c=num1;
        num_1=num_2;
        num_2=c;
        System.out.println("The swapped numbers are: " + num_1 + " and " + num_2);

    }
}
