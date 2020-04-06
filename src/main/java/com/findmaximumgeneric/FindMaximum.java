package com.findmaximumgeneric;

import java.util.Arrays;

// WELCOME To Find Maximum Number using GENERIC
public class FindMaximum < V extends Comparable <V> >{

        // Array of Values
        V[] valuesArray;

        // Default Constructor
        public FindMaximum(){
        }

        public <V extends Comparable<V>> V findMaximum(V... valuesArray)
        {
            Arrays.sort(valuesArray);
            return valuesArray[valuesArray.length-1];

        }

}                                                             //EOC





