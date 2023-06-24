public class PrimeNumber {
    public static void main(String[] args) {

        // Defining a counter
        int counter;

        // Finding the prime numbers from 0 to 100
        System.out.print("Prime numbers : ");
        for (int i = 2; i <= 100; i++) {
            counter = 0;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    counter = 1;
                    break;
                }
            }

            if (counter == 0)
                System.out.print(i + " ");
        }
    }
}
