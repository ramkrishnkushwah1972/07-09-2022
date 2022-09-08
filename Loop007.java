package com.looping.bll;
import java.util.Scanner;

	//Program that reads a set of integers, and then prints the sum of the even and odd integers.

public class Loop007 {

	public static void main(String[] args) {
		int number, i, evenSum = 0, oddSum = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		number = input.nextInt();	
		
		for(i = 1; i <= number; i++)
		{
			if(i % 2 == 0)
				evenSum = evenSum + i; 
			else
				oddSum = oddSum + i;
		}
		System.out.println("Sum of Even Numbers : " + evenSum);
		System.out.println("Sum of Odd Numbers : "+ oddSum);
		
	}
}

