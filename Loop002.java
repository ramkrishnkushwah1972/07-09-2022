package com.looping.bll;

import java.util.Scanner;

//	Write a program to calculate the sum of first 10 natural number.
public class Loop002 {

	public static void main(String[] args) {		
		int total=0;
		for(int i=1; i<=10; i++){
			total +=i;
			
		}
		System.out.println(total);
	}
}