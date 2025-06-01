package Methods;

import java.util.Scanner;

public class primenum {
	
	    // Method to check if a number is prime
	    public static boolean isPrime(int number) {
	        // Handle edge cases
	        if (number <= 1) {
	            return false;
	        }

	        // Check for factors from 2 to sqrt(number)
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false; // Not a prime number
	            }
	        }

	        return true; // Prime number
	    }

	    public static void main(String[] args) {
	        // Create Scanner object to read input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt user for input
	        System.out.print("Enter a number to check if it's prime: ");
	        int num = scanner.nextInt();

	        // Call the method and display result
	        if (isPrime(num)) {
	            System.out.println(num + " is a prime number.");
	        } else {
	            System.out.println(num + " is not a prime number.");
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}

