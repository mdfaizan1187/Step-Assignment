// Que 10.
import java.util.Scanner;

public class Level_One {
    public static void main(String[] args) {
        int height;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height: ");
        height = input.nextInt();
        double cm = 1 / 2.54;
        double inches = height * cm;
        double foot = inches * 12;
        System.out
                .println("The height in inches is: " + inches + " and the height in foot is: " + foot);

    }
}
