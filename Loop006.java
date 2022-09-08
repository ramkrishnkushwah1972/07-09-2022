package com.looping.bll;
import java.util.Scanner;

	//The number with the digits reversed. For example, if the input is 12345, the output should be 54321.

public class Loop006 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		int reverse = 0;
		
		while(num!=0) { 
			int rem = num % 10; // finding last digit of the number
			reverse = reverse * 10 + rem; 
			num = num / 10; //// remove last digit of the number
		}
		
		System.out.println("Reverse no is : " + reverse);
		
		scanner.close();
		
		

	}
}
