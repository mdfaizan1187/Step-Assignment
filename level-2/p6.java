//Que 6. Write a Java program to calculate the quotient and remainder of two numbers.
import java.util.Scanner;
public class Codes_Level_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_1,num_2;
        System.out.println("Enter the first number: ");
        num_1 = sc.nextInt();   
        System.out.println("Enter the second number: ");
        num_2 = sc.nextInt();
        float quotient = num_1 / num_2;
        float remainder = num_1 % num_2;
        System.out.println("The quotient and remainder of the two numbers is: " + quotient + " and " + remainder);

    }
}
