package com.looping.bll;
import java.util.Scanner;

	//Program to find the factorial value of any number entered through the keyboard.

public class Loop004 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number for factorial : ");
		int n = input.nextInt();
		int f=1;
		for(int i=n; i>=1; i--){
			f= f*i;
		}
		System.out.println("Factorial is :"+f);

	}

}
