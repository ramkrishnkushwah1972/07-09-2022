package com.looping.bll;
import java.util.Scanner;

		/* Write a program to calculate the sum of following series where n is input by user. 
			1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n */
		 
public class Loop012 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	 
    
    
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        
        for(int i=1; i<=number; i++){
        	if(i==1)
        		System.out.print("1 + ");
        	else
        		System.out.print("1/"+i+" + ");
        }
        

	    input.close();
	}
}

