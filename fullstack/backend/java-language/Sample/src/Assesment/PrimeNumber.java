package Assesment;

import java.util.Scanner;

public class PrimeNumber {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Main method to print prime numbers from 1 to N
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        
        System.out.println("Prime numbers from 1 to " + N + " are: ");
        for (int i = 1; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
