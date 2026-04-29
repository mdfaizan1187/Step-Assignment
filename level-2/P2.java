import java.util.Scanner;

public class P2 {

    // Method to find length without length()
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

    // Count words
    public static int countWords(String str) {
        int count = 1;
        for (int i = 0; i < findLength(str); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    // Split manually using charAt()
    public static String[] splitText(String str) {
        int len = findLength(str);
        int words = countWords(str);

        int[] spaceIndex = new int[words - 1];
        int k = 0;

        // store space indexes
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndex[k++] = i;
            }
        }

        String[] result = new String[words];

        int start = 0;
        for (int i = 0; i < words; i++) {
            int end = (i == words - 1) ? len : spaceIndex[i];

            String word = "";
            for (int j = start; j < end; j++) {
                word += str.charAt(j);
            }

            result[i] = word;
            start = end + 1;
        }

        return result;
    }

    // Compare arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] manual = splitText(text);
        String[] builtin = text.split(" ");

        System.out.println("Arrays same? " + compareArrays(manual, builtin));
    }
}