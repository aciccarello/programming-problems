package io.github.aciccarello.problems.euler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem3Test {

    @Test
    public void largestPrime() {
        assertEquals(Long.valueOf(2L), Problem3.largestPrimeFactor(8L));
        assertEquals(Long.valueOf(3L), Problem3.largestPrimeFactor(9L));
        assertEquals(Long.valueOf(13L), Problem3.largestPrimeFactor(13L));
        assertEquals(Long.valueOf(29L), Problem3.largestPrimeFactor(29L));
        assertEquals(Long.valueOf(29L), Problem3.largestPrimeFactor(13195L));
    }

    @Test
    public void isFactor() {
        assertTrue(Problem3.isFactor(4L, 20L));
    }

    @Test
    public void isNotFactor() {
        assertTrue(!Problem3.isFactor(9L, 20L));
    }

    @Test
    public void isPrime() {
        assertTrue("2 should be prime", Problem3.isPrime(2L));
        assertTrue("3 should be prime", Problem3.isPrime(3L));
        assertTrue("13 should be prime", Problem3.isPrime(13L));
        assertTrue("29 should be prime", Problem3.isPrime(29L));
        assertTrue("89 should be prime", Problem3.isPrime(89L));
        assertTrue("433 should be prime", Problem3.isPrime(433L));
    }

    @Test
    public void isNotPrime() {
        assertTrue("9 should not be prime", !Problem3.isPrime(9L));
        assertTrue("20 should not be prime", !Problem3.isPrime(20L));
        assertTrue("995 should not be prime", !Problem3.isPrime(995L));
    }

    @Test
    public void isEven() {
        assertTrue("2 should be even", Problem3.isEven(2L));
        assertTrue("100 should be even", Problem3.isEven(100L));
    }

    @Test
    public void isNotEven() {
        assertTrue("1 should not be even", !Problem3.isEven(1L));
        assertTrue("3 should not be even", !Problem3.isEven(3L));
        assertTrue("13 should not be even", !Problem3.isEven(13L));
        assertTrue("99 should not be even", !Problem3.isEven(99L));
    }
}