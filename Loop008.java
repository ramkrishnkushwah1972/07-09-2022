package com.looping.bll;
import java.util.Scanner;

	/*program that prompts the user to input a positive integer. 
	It should then output a message indicating whether the number is a prime number.*/

public class Loop008 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int f=1;
	    
	    System.out.println("Enter any number:");
		
		int num =input.nextInt();
	    for (int i = 2; i <= num / 2; ++i) { 
	      if (num % i == 0)// condition for nonprime number 
	      {
	        f = 0;
	        break;
	      }
	    }
	    if (f==1)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
		
	    input.close();
	}
}

