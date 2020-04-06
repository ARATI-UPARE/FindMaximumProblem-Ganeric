package com.findmaximumgeneric;

import java.util.Arrays;

// WELCOME To Find Maximum Number using GENERIC
public class FindMaximum < V extends Comparable <V> >{

        // Array of Values
        V[] valuesArray;

        // Default Constructor
        public FindMaximum(){
        }

        // Generic method to find Maximum Value
        public <V extends Comparable<V>> V findMaximum(V... valuesArray)
        {
            Arrays.sort(valuesArray);
            V maximumValue = valuesArray[valuesArray.length-1];
            printMaximumValue(maximumValue);
            return valuesArray[valuesArray.length-1];

        }

        // UC-5: Generic Method to Print the Maximum Value
        private static <V> void printMaximumValue(V maximumValue) {
            System.out.println("Maximum value is: " + maximumValue);
    }

}                                                             //EOC





