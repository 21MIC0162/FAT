public class Main {
    public static void main(String[] args) {
        // Check if 88 is a prime number
        int number = 88;
        boolean isPrime = isNumberPrime(number);
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    /**
     * Returns true if the given number is a prime number, false otherwise.
     */
    public static boolean isNumberPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}