package com.findmaximumgeneric;

// WELCOME To Find Maximum Number using GENERIC
public class FindMaximum < V extends Comparable <V> >{

        // Class Parameters
        V firstValue;
        V secondValue;
        V thirdValue;

        // Default Constructor
        public FindMaximum(){
        }
        // Paramerized Constructor
        public FindMaximum(V firstValue, V secondValue, V thirdValue){
            this.firstValue=firstValue;
            this.secondValue=secondValue;
            this.thirdValue=thirdValue;
        }

        // Generic Method to find Maximum Value
        public  V findMaximum (V firstValue, V secondValue, V thirdValue){
            V maxValue = firstValue;
            if( secondValue.compareTo(maxValue) > 0) {
                maxValue = secondValue;
            }
            if( thirdValue.compareTo(maxValue) > 0) {
                maxValue = thirdValue;
            }
            return maxValue;
        }

        // Internally call findMaximum
        public <V extends Comparable<V>> V findMaximum()
        {
            return (V) findMaximum(firstValue,secondValue,thirdValue);
        }
}                                                             //EOC





