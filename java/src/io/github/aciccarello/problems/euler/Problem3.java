package io.github.aciccarello.problems.euler;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 60085147514
 *
 * @see <a href="https://projecteuler.net/problem=3">Problem 3</a>
 */
public class Problem3 implements EulerSolver {
    public String getDescription() {
        return "Largest prime factor";
    }

    public int getNumber() {
        return 3;
    }

    @Override
    public Long call() throws Exception {
        return largestPrimeFactor(600851475143L);
    }

    /**
     * Searches for the largest prime factor of a number
     *
     * @param number value to check factors
     * @return Returns the largest prime
     */
    protected static Long largestPrimeFactor(Long number) {
        while (isEven(number) && number != 2) { // remove even factors
            number = number / 2;
        }

        long starting = number / 2; // only loop through half of numbers
        if (isEven(starting)) { // want to start on an odd number
            starting--;
        }


        for (long i = starting; i > 1; i = i - 2) {
            if (isFactor(i, number)) {
                System.out.println(i + " is a factor of " + number);
                if (isPrime(i)) {
                    return i;
                }
            }
        }

        return number; // The number itself is prime
    }

    /**
     * Checks if factor is a factor of a number
     *
     * Checks for a remainder using the modulo operator
     *
     * @param factor value that may be a factor of number
     * @param number value to divide
     * @return True if number can be evenly divided by factor
     */
    protected static boolean isFactor(Long factor, Long number) {
        return (number % factor == 0);
    }

    /**
     * Brute force prime check.
     * Checks all numbers smaller than the square root of a number to see if it is a factor
     * @param number value to check if prime
     * @return true if the number is a prime
     */
    protected static boolean isPrime(Long number) {
        if (isEven(number)) {
            return number == 2;
        }

        for (long i = 3; i * i <= number; i = i + 2) {
            if (isFactor(i, number)) {
                System.out.println(number + " is divisible by " + i);
                return false;
            }
        }
        // else
        return true;
    }

    /**
     * Checks if a number is even
     *
     * @param number value to check if it is evenly divisible
     * @return true if a number is evenly divisible by 2
     */
    protected static boolean isEven(Long number) {
        return number % 2 == 0;
    }
}
