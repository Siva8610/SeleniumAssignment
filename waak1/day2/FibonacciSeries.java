package waak1.day2;

public class FibonacciSeries {

    public static void main(String[] args) {
        
        int range = 8;  // given input
        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: " + first + " " + second + " ");

        for (int i = 2; i < range; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}

