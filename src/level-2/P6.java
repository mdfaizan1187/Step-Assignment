import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar age: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Amar height: ");
        int amarHeight = sc.nextInt();

        System.out.print("Enter Akbar age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Akbar height: ");
        int akbarHeight = sc.nextInt();

        System.out.print("Enter Anthony age: ");
        int anthonyAge = sc.nextInt();
        System.out.print("Enter Anthony height: ");
        int anthonyHeight = sc.nextInt();

        if (amarAge < akbarAge && amarAge < anthonyAge)
            System.out.println("Youngest: Amar");
        else if (akbarAge < amarAge && akbarAge < anthonyAge)
            System.out.println("Youngest: Akbar");
        else
            System.out.println("Youngest: Anthony");

        if (amarHeight > akbarHeight && amarHeight > anthonyHeight)
            System.out.println("Tallest: Amar");
        else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight)
            System.out.println("Tallest: Akbar");
        else
            System.out.println("Tallest: Anthony");
    }
}