public class P4 {

    // Method to generate exception
    public static void generateException() {
        String text = null;

        // This will throw NullPointerException
        System.out.println(text.length());
    }

    // Method to handle exception
    public static void handleException() {
        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception handled: String is null");
        }
    }

    public static void main(String[] args) {

        // First: Generate exception
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Exception occurred in generateException()");
        }

        // Then: Handle exception properly
        handleException();
    }
}