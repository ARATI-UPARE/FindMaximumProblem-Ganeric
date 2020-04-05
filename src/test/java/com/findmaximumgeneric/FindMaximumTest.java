package com.findmaximumgeneric;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    FindMaximum findMax = new FindMaximum();
    //TC:1.1
    @Test
    public void givenMaxIntegerAtFirstPosition_shouldReturnFirstPosition() {
        Comparable maxNumber = findMax.findMaxInteger(30,10,20);
        Assert.assertEquals(30, maxNumber);
    }
    //TC:1.2
    @Test
    public void givenMaxIntegerAtSecondPosition_shouldReturnSecondPosition() {
        Comparable maxNumber = findMax.findMaxInteger(10,30,20);
        Assert.assertEquals(30, maxNumber);
    }
    //TC:1.3
    @Test
    public void givenMaxIntegerAtThirdPosition_shouldReturnThirdPosition() {
        Comparable maxNumber = findMax.findMaxInteger(10,20,30);
        Assert.assertEquals(30, maxNumber);
    }
}

