//Que 2. Write a Java program to calculate the area of a triangle and convert it into square inches.
import java.util.Scanner;
public class Codes_Level_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float base, height;
        System.out.println("Enter the base of the triangle(in cm): ");
        base = sc.nextFloat();
        System.out.println("Enter the height of the triangle(in cm): ");
        height = sc.nextFloat();
        float area = (base * height) / 2;
        float cm=1/2.54;
        float area_inch = area * cm * cm;
        System.out.println("The area of the triangle in sq inch: " + area_inch + " and sq cm: " + area);


    }
}
