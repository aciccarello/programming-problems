package io.github.aciccarello.problems.euler;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * @see <a href="https://projecteuler.net/problem=1">Problem 1</a>
 */
public class Problem1 implements EulerSolver {

    public String getDescription() {
        return "Multiples of 3 and 5";
    }

    public int getNumber() {
        return 1;
    }

    public Long call() {
        return Long.valueOf(sumNaturalNumbers(1000));
    }

    protected static int sumNaturalNumbers(int cap) {
        int sum = 0;
        for (int i = 0; i < cap; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
