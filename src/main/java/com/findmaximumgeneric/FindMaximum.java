package com.findmaximumgeneric;
// WELCOME To Find Maximum Number using GENERIC
public class FindMaximum {

    // Default Constructor
    public FindMaximum(){

    }
    // Method to find Maximum Number
    public static int findMaxInteger(int no1, int no2, int no3) {

        int maxInt = 0;
        if (no1 > no2 && no1 > no2) {
            return maxInt = no1;
        } else if (no2 > no1 && no2 > no3) {
            return maxInt = no2;
        } else {
            return maxInt = no3;
        }
    }
}





