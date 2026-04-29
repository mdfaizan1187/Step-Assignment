import java.util.Scanner;

public class P2 {

    // Find length without length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    // Find unique characters
    public static char[] findUnique(String str) {
        int len = findLength(str);
        char[] temp = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char current = str.charAt(i);
            boolean isUnique = true;

            // check with previous characters
            for (int j = 0; j < i; j++) {
                if (current == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[index++] = current;
            }
        }

        // create final array of exact size
        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    // Display method
    public static void display(char[] arr) {
        System.out.print("Unique characters: ");
        for (char c : arr) {
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] uniqueChars = findUnique(text);
        display(uniqueChars);
    }
}