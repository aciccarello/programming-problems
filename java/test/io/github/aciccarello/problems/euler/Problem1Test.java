package io.github.aciccarello.problems.euler;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem1Test {

    @Test
    @Ignore
    public void call() {
        assertNotNull(new Problem1().call());
    }

    @Test
    public void sumNaturalNumbers() {
        assertEquals(Problem1.sumNaturalNumbers(10), 23);
    }
}