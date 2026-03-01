//Que 1. Write a Java program to perform addition, subtraction, multiplication and division of two numbers.
import java.util.Scanner;
public class Codes_Level_2 {
    public static void main(String[] args) {
        float num_1,num_2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num_1 = sc.nextFloat();
        System.out.println("Enter the second number: ");
        num_2 = sc.nextFloat();
        float sum = num_1 + num_2;
        float difference = num_1 - num_2;
        float product = num_1 * num_2;
        float quotient = num_1 / num_2;
        System.out.println("The addition,subtraction,multiplication,division of the two numbers is: " + sum + ", " + difference + ", " + product + ", " + quotient);

    }
}
