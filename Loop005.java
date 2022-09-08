package com.looping.bll;

import java.util.Scanner;

//program to find the value of one number raised to the power of another number.

public class Loop005 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a first number : ");
		int n1 = input.nextInt();
		
		System.out.println("Enter a second number :");
		int n2 = input.nextInt();
		int pow=1;
		for(int i=1; i<=n2; i++){
			pow=pow*n1;
		}
		System.out.println("The Power of "+n1+ " is :"+pow);

	}

}
