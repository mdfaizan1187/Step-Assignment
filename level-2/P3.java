import java.util.Scanner;

public class P3 {

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

    // Split manually
    public static String[] splitText(String str) {
        int len = findLength(str);

        int words = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ')
                words++;
        }

        int[] spaces = new int[words - 1];
        int k = 0;

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaces[k++] = i;
            }
        }

        String[] result = new String[words];

        int start = 0;
        for (int i = 0; i < words; i++) {
            int end = (i == words - 1) ? len : spaces[i];

            String word = "";
            for (int j = start; j < end; j++) {
                word += str.charAt(j);
            }

            result[i] = word;
            start = end + 1;
        }

        return result;
    }

    // Create 2D array (word + length)
    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] data = wordWithLength(words);

        System.out.println("\nWord\tLength");
        for (int i = 0; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            System.out.println(data[i][0] + "\t" + len);
        }
    }
}