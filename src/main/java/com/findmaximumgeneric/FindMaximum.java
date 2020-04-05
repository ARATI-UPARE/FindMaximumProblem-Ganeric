package com.findmaximumgeneric;
// WELCOME To Find Maximum Number using GENERIC
public class FindMaximum {

    // Default Constructor
    public FindMaximum(){

    }
    // Method to find Maximum IntegerNumber
    public static int findMaxInteger(int no1, int no2, int no3) {

        int maxInt = 0;
        if (no1 > no2 && no1 > no3) {
            return maxInt = no1;
        } else if (no2 > no1 && no2 > no3) {
            return maxInt = no2;
        } else {
            return maxInt = no3;
        }
    }

    // Method to find Maximum Float Number
    public static double findMaxFloat(double fNo1, double fNo2, double fNo3) {

        double maxFloat= 0;
        if (fNo1 > fNo2 && fNo1 > fNo3) {
            return maxFloat = fNo1;
        } else if (fNo2 > fNo1 && fNo2 > fNo3) {
            return maxFloat = fNo2;
        } else {
            return maxFloat = fNo3;
        }
    }
}





