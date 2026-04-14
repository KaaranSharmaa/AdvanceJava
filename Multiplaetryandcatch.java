public class Multiplaetryandcatch {
    public static void main(String args[]) {

        int i = 2, j = 0;
        try {
            String str = null;
            System.out.println(str.length());  // Risky code - may throw Exception

            j = 18 / i;
            int[] nums = new int[5];
            System.out.println(nums[1]);  // Safe, no exception here
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}