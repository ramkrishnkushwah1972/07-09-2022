package com.looping.bll;
import java.util.Scanner;
	/* Write a program to calculate the sum of following series where n is input by user. 
	1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n */
		 
public class Loop012 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        double sum=0;
        for(int i=1; i<=number; i++){
        	sum=sum+(1.0/i);
        }
        System.out.println("Sum is : "+sum);

	    input.close();
	}
}

