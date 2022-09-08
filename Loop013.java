package com.looping.bll;

import java.util.Scanner;

public class Loop013 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		 System.out.println("Enter the value of n :");
	        int num = input.nextInt();
	       
	        double sum=0;
	        for(int i=1; i<=num; i++){ 
	        	if (i % 2 == 0)
		            sum -= 1.0/i;//add series (1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n )
	        	else
	        		sum += 1.0/i;
	        }
	        System.out.println("Sum is : "+sum);
		 
	}

}
