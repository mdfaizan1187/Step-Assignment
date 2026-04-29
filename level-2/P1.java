import java.util.Scanner;

public class P1 {

    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count); // keep accessing until exception
                count++;
            }
        } catch (Exception e) {
            // exception occurs when index is out of bounds
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        int manualLength = findLength(text);
        int actualLength = text.length();

        System.out.println("Length (without length()): " + manualLength);
        System.out.println("Length (using length()): " + actualLength);
    }
}