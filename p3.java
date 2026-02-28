//Que 3. Write a Java program to calculate the side of a square when the perimeter is given.
import java.util.Scanner;
public class Codes_Level_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int per;
        System.out.println("Enter the perimeter of squaare: ");
        per = sc.nextInt();
        float side = per / 4;
        System.out.println("The side of the square is: " + side+" whose perimeter is: " + per);


    }
}
