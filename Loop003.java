package com.looping.bll;
import java.util.Scanner;

	/*Write a program that prompts the user to input a positive integer.
	It should then print the multiplication table of that number. */

public class Loop003 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number positive integer : ");
		int num = input.nextInt();
		System.out.println("Table of "+num);
		int i=1;
		do{
			System.out.println(num+" * "+i+" = "+num*i);
			i++;
		}while(i<=10);

	}

}
