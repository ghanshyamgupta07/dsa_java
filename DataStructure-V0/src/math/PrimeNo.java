package math;

public class PrimeNo {
    public static void main(String[] args) {
        System.out.println(isPrime(17));
    }
    // Every prime number can be represented in form of 6n + 1 or 6n – 1
    // except the prime numbers 2 and 3, where n is any natural number.
    public static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        // Check if n=2 or n=3
        if (n == 2 || n == 3)
            return true;

        // Check whether n is divisible by 2 or 3
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        // Check from 5 to square root of n
        // Iterate i by (i+6)
        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }
}
