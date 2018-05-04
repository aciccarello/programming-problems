package io.github.aciccarello.problems.euler;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Problem2Test {

    @Test
    public void fibonacci() {
        Integer[] expected = { 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 };
        List<Integer> returned = Problem2.fibonacci(89);
        assertEquals(returned, Arrays.asList(expected));
    }

    @Test
    public void sumEvenNumbers() {
        List<Integer> list = Arrays.asList(1, 2, 3, 5, 8, 13, 21, 34, 55, 89);
        assertEquals(44, Problem2.sumEvenNumbers(list));
    }
}