package com.looping.bll;
import java.util.Scanner;

	/*	Write a do-while loop that asks the user to enter two numbers.
	 	The numbers should be added and the sum displayed. 
	 	The loop should ask the user whether he or she wishes to perform 
	 	the operation again. If so, the loop should repeat; otherwise it should terminate.
	 */

public class Loop009 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean b=true;
	    do{
	    	System.out.println("Enter first number:");
			int fnum =input.nextInt();
			System.out.println("Enter second number:");
			int snum =input.nextInt();
			int sum=fnum + snum;
			System.out.println("Sum :"+ sum);
			b=false;
			System.out.println("Do you wish to do this again (Y/N)");
			char ch =input.next().charAt(0);
			if(ch=='y'||ch=='Y')
				b=true;
			else
				b=false;
	    }while(b);
	    
	    input.close();
	}
}

