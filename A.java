package MockQuestions2Array;

import java.util.Scanner;

public class A {

	static int factorial() {
		System.out.println("1. Write a Java program to find the factorial of a given number.");
		int n = 10;
		int factori = 1;
		for(int i = 1; i <= n; i++) {
			factori = factori * i;
		}
		return factori;
	}
	
	static boolean checkIfPrime() {
		System.out.println("2. Write a Java program to check whether a number is prime or not.");
		int n = 11;
		if(n <= 1) {
			return false;
		}
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	static int fibonacciSequence(int counter) {
		if(counter <= 1) {
			return counter;
		}
		return fibonacciSequence(counter - 1) + fibonacciSequence(counter - 2);
	}
	
	static boolean checkIfPalindrome(String palindrome) {
		System.out.println("4. Write a Java program to check if a string is a palindrome.");
		String reverse = "";
		for(int i = palindrome.length() - 1; i >= 0; i--) {
			reverse = reverse + palindrome.charAt(i);
		}
		if(palindrome.equals(reverse)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	static String reverseString(String stringToReverse) {
		System.out.println("5. Write a Java program to reverse a string.");
		String reverse = "";
		for(int i = stringToReverse.length() - 1; i >= 0; i--) {
			reverse = reverse + stringToReverse.charAt(i);
		}
		return reverse;
	}
	
	static boolean checkIfLeapYear(int year) {
		System.out.println("6. Write a Java program to check whether a year is a leap year or not.");
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return true;
			}
		}
		else {
			return false;
		}
	}
	
	static void bubbleSort(int array[], int n) {
		System.out.println("7. Write a Java program to sort an array of integers using bubble sort.");
		boolean swapped;
		int temp;
		for(int i = 0; i < n - 1; i++) {
			swapped = false;
			for(int j = 0; j < n - i - 1; j++) {
				if(array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swapped = true;
				}
			}
			if(swapped == false) {
				break;
			}
		}
	}
	
	static void gradeStudents(double[] grades) {
		System.out.println("8. Write a Java program to calculate the average grade of students and determine the highest and lowest grades.");
		double sum = 0;
		double max = grades[0];
		double min = grades[0];
		for(int i = 0; i < grades.length; i++) {
			if(grades[i] > max) {
				max = grades[i];
			}
			if(grades[i] < min) {
				min = grades[i];
			}
			sum += grades[i];
		}
		double average = sum / grades.length;
		System.out.println("Average Grade: " + average);
		System.out.println("Highest Grade: " + max);
		System.out.println("Lowest Grade: " + min);
	}
	
	static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB){
		int aRows = matrixA.length;
	    int aColumns = matrixA[0].length;
	    int bRows = matrixB.length;
	    int bColumns = matrixB[0].length;

	    int[][] C = new int[aRows][bColumns];
	    for (int i = 0; i < aRows; i++) {
	    	for (int j = 0; j < bColumns; j++) {
	    		C[i][j] = 0;
	    	}
	    }

	    for (int i = 0; i < aRows; i++) {
	    	for (int j = 0; j < bColumns; j++) {
	    		for (int k = 0; k < aColumns; k++) {
	    			C[i][j] += matrixA[i][k] * matrixB[k][j];
	    		}
	    	}
	    }

	    return C;
	}
	
	static void calculator() {
		char operator;
		double n1, n2, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose operation: +, -, *, /");
		operator = sc.next().charAt(0);
		
		// ask users to enter numbers
	    System.out.println("Enter first number");
	    n1 = sc.nextDouble();

	    System.out.println("Enter second number");
	    n2 = sc.nextDouble();

	    switch (operator) {

	      // performs addition between numbers
	      case '+':
	        result = n1 + n2;
	        System.out.println(result);
	        break;

	      // performs subtraction between numbers
	      case '-':
	        result = n1 - n2;
	        System.out.println(result);
	        break;

	      // performs multiplication between numbers
	      case '*':
	        result = n1 * n2;
	        System.out.println(result);
	        break;

	      // performs division between numbers
	      case '/':
	        result = n1 / n2;
	        System.out.println(result);
	        break;

	      default:
	        System.out.println("Invalid operation.");
	        break;
	    }
	}
	
	static int binarySearchAlgorithm(int array[], int n) {
		int low = 0;
		int high = array.length - 1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			
			if(array[mid] == n) {
				return mid;
			}
			if(array[mid] < n){
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to find the factorial of a given number.
		System.out.println(factorial());
//		Write a Java program to check whether a number is prime or not.
		System.out.println(checkIfPrime());
//		Write a Java program to print the Fibonacci series up to a given number.
		System.out.println("3. Write a Java program to print the Fibonacci series up to a given number.");
		System.out.println(fibonacciSequence(10));
//		Write a Java program to check if a string is a palindrome.
		System.out.println(checkIfPalindrome("racecar"));
//		Write a Java program to reverse a string.
		System.out.println(reverseString("Onomatopoeia"));
//		Write a Java program to check whether a year is a leap year or not.
		System.out.println(checkIfLeapYear(2016));
//		Write a Java program to sort an array of integers using bubble sort.
		int[] intArray = {5,7,2,3,1,4,6,10,9,8};
		bubbleSort(intArray, intArray.length);
		for(int element : intArray) {
			System.out.println(element);
		}
//		Write a Java program to calculate the average grade of students and determine the highest and lowest grades.
		double[] grades = {99.4,87.8,73.3,100,91.3};
		gradeStudents(grades);
//		Write a Java program to multiply two matrices.
		int[][] matrixA = {{12,23},{12,35}};
		int[][] matrixB = {{12,23},{12,35}};
		int[][] result = multiplyMatrices(matrixA,matrixB);
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.println(result[i][j]);
			}
		}
//		Create a Java class to manage a bank account with functionalities to deposit, withdraw, and check balance.
		System.out.println("Solved in B.java");
//		Create a Java program to manage employees with functionalities to add, remove, and display employee details.
		System.out.println("Unfinished in C.java");
//		Write a Java program to create a simple calculator using switch case statements.
		calculator();
//		Write a Java program to implement the binary search algorithm for a sorted array.
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		int n = 7;
		System.out.println(binarySearchAlgorithm(array, n));
	}

}
