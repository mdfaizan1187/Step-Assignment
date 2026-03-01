//Que1. Write a Java program to convert temperature from Celsius to Fahrenheit.
import java.util.Scanner;
public class Codes_Level_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float celsius;
        float fahrenheit;
        System.out.println("Enter the temperature in Celsius: ");
        celsius = sc.nextFloat();
        fahrenheit = (celsius * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);

    }
}
