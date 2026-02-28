// QUE 8. Write a program to convert a given distance in kilometers to miles, using user input. (1 mile = 1.6 kilometers)
import java.util.Scanner;

public class Level_One {
    public static void main(String[] args) {
        double km;
        Scanner input = new Scanner(System.in);
        km = input.nextInt();
        double miles = (1 / 1.6) * km;
        System.out.println("The distance " + km + "km in miles is: " + miles);
    }
}
