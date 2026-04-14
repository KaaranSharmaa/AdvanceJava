public class tryandcatch {
    public static void main(String[] args) {
        int i = 0, j = 0;

        try {
            i = 18 / i;  // Risky code - may throw ArithmeticException
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);  // Prints exception message
        }

        System.out.println(j);  // Will not be executed if exception occurs before
        System.out.println("Bye");
    }
}