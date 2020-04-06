package com.findmaximumgeneric;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    FindMaximum findMax = new FindMaximum();
    //TC:1.1
    @Test
    public void givenMaxIntegerAtFirstPosition_shouldReturnFirstPosition() {
        Comparable maxNumber = findMax.findMaximum(30,10,20);
        Assert.assertEquals(30, maxNumber);
    }
    //TC:1.2
    @Test
    public void givenMaxIntegerAtSecondPosition_shouldReturnSecondPosition() {
        Comparable maxNumber = findMax.findMaximum(10,30,20);
        Assert.assertEquals(30, maxNumber);
    }
    //TC:1.3
    @Test
    public void givenMaxIntegerAtThirdPosition_shouldReturnThirdPosition() {
        Comparable maxNumber = findMax.findMaximum(10,20,30);
        Assert.assertEquals(30, maxNumber);
    }
    //TC:2.1
    @Test
    public void givenMaxFloatAtFirstPosition_shouldReturnFirstPosition() {
        Comparable maxFloat = findMax.findMaximum(30.5,20.5,10.5);
        Assert.assertEquals(30.5, maxFloat);
    }
    //TC:2.2
    @Test
    public void givenMaxFloatAtSecondPosition_shouldReturnFirstPosition() {
        Comparable maxFloat = findMax.findMaximum(10.5,30.5,20.5);
        Assert.assertEquals(30.5, maxFloat);
    }
    //TC:2.3
    @Test
    public void givenMaxFloatAtThirdPosition_shouldReturnFirstPosition() {
        Comparable maxFloat = findMax.findMaximum(10.5, 20.5, 30.5);
        Assert.assertEquals(30.5, maxFloat);
    }

    //TC:3.1
    @Test
    public void givenMaxStringAtFirstPosition_shouldReturnFirstPosition() {
        Comparable maxString = findMax.findMaximum("peach", "apple", "banana");
        Assert.assertEquals("peach", maxString);
    }
    //TC:3.2
    @Test
    public void givenMaxStringAtSecondPosition_shouldReturnFirstPosition() {
        Comparable maxString = findMax.findMaximum("apple", "peach", "banana");
        Assert.assertEquals("peach", maxString);
    }
    //TC:3.3
    @Test
    public void givenMaxStringAtThirdPosition_shouldReturnFirstPosition() {
        Comparable maxString = findMax.findMaximum("apple", "banana", "peach");
        Assert.assertEquals("peach", maxString);
    }
}


