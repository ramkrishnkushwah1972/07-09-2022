package com.looping.bll;
import java.util.Scanner;
	/* Write a program to find how many vowels and how many consonants 
	 are in a given string. */
	 
public class Loop015 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int w=0;
		int c=0;
		
			System.out.println("Enter a string: ");
			String num =input.nextLine();
//			System.out.println(num.length());
			for(int i=0; i<= num.length()-1; i++){
				if(num.charAt(i)=='a'||num.charAt(i)=='A')
					w++;
				else 
					c++;
				
			}	
			System.out.println("Vowels : "+w);
			System.out.println("Consonent : "+c);
			
			    
	    input.close();

	}

}
