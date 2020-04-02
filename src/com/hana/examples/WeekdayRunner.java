package com.hana.examples;

import java.util.Scanner;

public class WeekdayRunner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose day in a week: ");
		String dayInput = scanner.next();
		switchChoices(dayInput);
	}
	
	private static void switchChoices(String dayInput) {
		switch(dayInput) {
		case "sun" : 
			System.out.println("It's a weekend"); 
			break;
		case "sat" : 
			System.out.println("It's a weekend"); 
			break;
		default : 
			System.out.println("It's a weekday!"); 
			break;
		}		
	}
}
