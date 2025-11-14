package waak1.day2;

public class PalindromeNumberChecker {

    public static void main(String[] args) {
        
        int input = 121; // You can change this value to test other numbers
        int original = input;
        int reversed = 0;

        while (input > 0) {
            int digit = input % 10;
            reversed = reversed * 10 + digit;
            input = input / 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is not a Palindrome");
        }
    }
}
