package com.automation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayOperationsTest {
    int[] array, wrongArray, emptyArray;
    int number;

    @Before
    public void setUp() {
        wrongArray = new int[]{1,2,3,9};
        array = new int[]{1,2,4,4};
        emptyArray = new int[]{};
        number = 8;
    }

    @Test
    public void testIsEqualsToNotContainsNumber() {
        boolean response = ArrayOperations.isEqualsTo(wrongArray, number);

        assertFalse("The array contains 2 consecutive numbers added that are equals to number", response);
    }

    @Test
    public void testIsEqualsToContainsNumber() {
        boolean response = ArrayOperations.isEqualsTo(array, number);

        assertTrue("The two consecutive numbers aren't equals to number", response);
    }

    @Test
    public void testIsEqualsToWithEmptyArray() {
        boolean response = ArrayOperations.isEqualsTo(emptyArray, number);

        assertFalse("The array aren't empty", response);
    }
}
