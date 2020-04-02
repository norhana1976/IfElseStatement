package com.hana.examples;

import java.util.Scanner;

public class MenuRunner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int number1 = scanner.nextInt();
		//System.out.println("Number you entered is "+ number1);
		
		System.out.println("Enter number 2: ");
		int number2 = scanner.nextInt();
		//System.out.println("Number you entered is "+ number2);
		
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");
		System.out.println("Please choose operation: ");
		int choices = scanner.nextInt();
		//System.out.println("Operation you entered is "+ choices);
		
		//nestedIf(number1, number2, choices);
		switchChoices(number1, number2, choices);
		
		
	}

	private static void nestedIf(int number1, int number2, int choices) {
		if(choices==1) {
			//add
			int sumNo = number1 + number2;
			System.out.println(number1+ " + " +number2+" = "+sumNo);
		} else if(choices==2) {
			//Subtract
			int subtractNo = number1 - number2;
			System.out.println(number1+ " - " +number2+" = "+subtractNo);
		} else if(choices==3) {
			//Divide
			int divideNo = number1 / number2;
			System.out.println(number1+ " / " +number2+" = "+divideNo);
		} else if(choices==4) {
			//Multiply
			int multiplyNo = number1 * number2;
			System.out.println(number1+ " x " +number2+" = "+multiplyNo);
		} else {
			System.out.println("Invalid choice!");
		}
	}
	
	
	private static void switchChoices(int number1, int number2, int choices) {
	switch(choices) {
		case 1 : 
			System.out.println("Result = "+(number1 + number2)); 
			break;
		case 2 : 
			System.out.println("Result = "+(number1 - number2)); 
			break;
		case 3 : 
			System.out.println("Result = "+(number1 / number2)); 
			break;
		case 4 : 
			System.out.println("Result = "+(number1 * number2)); 
			break;
		default : 
			System.out.println("Invalid choice!"); 
			break;
	}
	}

}
