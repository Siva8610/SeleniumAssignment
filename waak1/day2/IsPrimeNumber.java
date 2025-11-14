package waak1.day2;

public class IsPrimeNumber {

    public static void main(String[] args) {
        
        int number = 29; // change the number to test
        
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && number > 1) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is NOT a Prime Number");
        }
    }
}

