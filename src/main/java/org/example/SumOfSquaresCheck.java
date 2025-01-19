package org.example;

public class SumOfSquaresCheck {


    // Function to calculate the sum of squares of digits of a number
    public static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10; // Extract the last digit
            sum += digit * digit;  // Add the square of the digit
            num /= 10;             // Remove the last digit
        }
        return sum;
    }

    // Function to check if the sum of squares equals 30 times the number
    public static boolean isValidNumber(int num) {
        return sumOfSquares(num) == 30 * num;
    }

    public static void main(String[] args) {
        // Test different numbers
        for (int i = 1; i <= 3000000; i++) {
            if (isValidNumber(i)) {
                System.out.println("The number " + i + " satisfies the condition.");
            }
        }
    }

//    public static void main(String[] args) {
//        for(int i=0; i<=3000; i++){
//            if(isValidNumber(i)){
//                System.out.println("valid number is :"+i);
//            }
//        }
//    }
//
//
//    private static boolean isValidNumber(int num) {
//        return squareOfDigits(num) == 30*num;
//    }
//
//    private static int squareOfDigits(int num) {
//        int sum = 0;
//        while(num > 0){
//            int digit = num % 10;
//            sum += digit * digit;
//            num = num/10;
//        }
//        return sum;
//    }


}
