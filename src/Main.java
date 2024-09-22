

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);

        // Assignment 1.1.1 - Sum of multiples
//        int maximumNumber = 1000;
//        int sum = 0;
//
//        for (int i = 0; i < maximumNumber; i++) {
//            if (i % 3 == 0 || i % 5 == 0) {
//                sum = sum + i;
//            }
//        }
//
//        System.out.println("The sum of all multiples of 3 or 5 that are smaller than " + maximumNumber + " is " + sum);

        // Assignment 1.1.2 - Sum of multiples
//        int maximumNumber;
//        int sum = 0;
//
//        maximumNumber= scanner.nextInt();
//
//        for (int i = 0; i < maximumNumber; i++) {
//            if (i % 3 == 0 || i % 5 == 0) {
//                sum = sum + i;
//            }
//        }
//
//        System.out.println("The sum of all multiples of 3 or 5 that are smaller than " + maximumNumber + " is " + sum);

        // Assignment 1.1.2 - Sum of multiples

        // For which number will an overflow occur for an integer variable? > 2,147,483,647
        // What about a long variable? > 9,223,372,036,854,775,807

        // Assignment 1.2.1 - Fibonacci even sum

//        System.out.println("The sum of all even Fibonacci numbers is " + calculateSum(calculateNumbers()));

        // Assignment 1.2.2 - Fibonacci even sum

//        System.out.println("The sum of all even Fibonacci numbers is " + calculateSum());

        // Assignment 1.2.3 - Fibonacci even sum
//
//        System.out.println("Please give a number:");
//        int n = scanner.nextInt();
//
//        while (calculateFibonacci(n) > 4000000) {
//            System.out.println("Number exceeded the limit. Please give another number:");
//            n = scanner.nextInt();
//        }
//
//        System.out.println("The sum of all even Fibonacci numbers is " + calculateSum(n));

        // Assignment 1.3.1 - Largest palindrome
//        int largestPalindrome = 0;
//
//        for (int i = 999; i >= 100; i--) {
//            for (int j = 999; j >= 100; j--) {
//                int product = i * j;
//                if (palindromeCheck(product) && product > largestPalindrome) {
//                    largestPalindrome = product1;
//                }
//            }
//        }
//
//        System.out.println("The largest palindrome that is a result of 2, 3 digits numbers multiplied, is " + largestPalindrome1);

        // Assignment 1.3.2 - Largest palindrome
//        int largestPalindrome2 = 0;
//
//        for (int i = 9999; i >= 1000; i--) {
//            for (int j = 9999; j >= 1000; j--) {
//                int product = i * j;
//                if (palindromeCheck(product) && product > largestPalindrome) {
//                    largestPalindrome = product;
//                }
//            }
//        }
//
//        System.out.println("The largest palindrome that is a result of 2, 4 digits numbers multiplied, is " + largestPalindrome);

        // Assignment 1.4 (optional) - Prime spiral

        int[] corners = new int[10000000];
        int sides = 1;
        double averageRatio = 1.0;
        int primeNumbers = 0;
        int totalCorners = 1;

        corners[0] = 1;

        while (averageRatio > 0.10) {
            for (int i = 1; i < corners.length - 3; i += 4) {
                sides += 2;

                corners[i] = sides * sides - (sides - 1) * 3;
                corners[i + 1] = sides * sides - (sides - 1) * 2;
                corners[i + 2] = sides * sides - (sides - 1);
                corners[i + 3] = sides * sides;

                if (checkPrime(corners[i])) {
                    primeNumbers++;
                }
                if (checkPrime(corners[i + 1])) {
                    primeNumbers++;
                }
                if (checkPrime(corners[i + 2])) {
                    primeNumbers++;
                }
                if (checkPrime(corners[i + 3])) {
                    primeNumbers++;
                }

                totalCorners += 4;

                averageRatio = (double) primeNumbers / totalCorners;

                if (averageRatio <= 0.10) {
                    break;
                }
            }
        }

        System.out.println("The first average under 10% is " + averageRatio + " for a spiral with " + sides + " side length.");
 }

    // Assignment 1.2.1 - Fibonacci even sum
//    public static int[] calculateNumbers() {
//        int fibonacci[] = new int[100];
//        fibonacci[0] = 1;
//        fibonacci[1] = 2;
//
//        int statement = 0;
//        int i = 2;
//        while (statement == 0) {
//            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
//            if (fibonacci[i] > 4000000) {
//                statement = 1;
//            }
//            i++;
//        }
//        return fibonacci;
//    }
//
//    public static int calculateSum(int[] fibonacci) {
//        int sum = fibonacci[0] + fibonacci[1];
//        for (int j = 2; j < fibonacci.length; j++) {
//            if (fibonacci[j] % 2 == 0) {
//                sum += fibonacci[j];
//            }
//        }
//        return sum;
//    }

    // Assignment 1.2.2 - Fibonacci even sum
//    public static int calculateSum() {
//        int prev1 = 1;
//        int prev2 = 2;
//
//        int sumFibonacci = prev1 + prev2;
//
//        while (prev2 < 4000000) {
//            int currentNumber = prev1 + prev2;
//            prev1 = prev2;
//            prev2 = currentNumber;
//
//            if (currentNumber % 2 == 0) {
//                sumFibonacci += currentNumber;
//            }
//        }
//        return sumFibonacci;
//    }

    // Assingment 1.2.3 - Fibonacci even sum
//        public static int[][] matrixMultiplication(int[][] A, int[][] B) {
//            return new int[][] {
//                    {
//                            A[0][0] * B[0][0] + A[0][1] * B[1][0],
//                            A[0][0] * B[0][1] + A[0][1] * B[1][1]
//                    },
//                    {
//                            A[1][0] * B[0][0] + A[1][1] * B[1][0],
//                            A[1][0] * B[0][1] + A[1][1] * B[1][1]
//                    }
//            };
//        }
//
//        public static int[][] matrixPower(int[][] matrix, int n) {
//            int[][] result = {{1, 0}, {0, 1}};  // Identity matrix
//            while (n > 0) {
//                if (n % 2 == 1) {
//                    result = matrixMultiplication(result, matrix);
//                }
//                matrix = matrixMultiplication(matrix, matrix);
//                n /= 2;
//            }
//            return result;
//        }
//
//        public static int calculateFibonacci(int n) {
//            if (n == 0) {
//                return 0;
//            } else if (n == 1) {
//                return 1;
//            }
//            int[][] matrix = {{1, 1}, {1, 0}};
//            int[][] result = matrixPower(matrix, n - 1);
//            return result[0][0];
//        }
//
//        public static int calculateSum(int n) {
//            return calculateFibonacci(n + 2) - 1;
//        }

    // Assignment 1.3.1 & 1.3.2 - Largest palindrome

//    public static boolean palindromeCheck(int x) {
//        int original = x;
//        int reversed = 0;
//
//        while (x != 0) {
//            int digit = x % 10;
//            reversed = reversed * 10 + digit;
//            x = x / 10;
//        }
//
//        return original == reversed;
//    }

    // Assignment 1.4 (optional) - Prime spiral

    public static boolean checkPrime(int number) {
        if (number <= 1) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }

}