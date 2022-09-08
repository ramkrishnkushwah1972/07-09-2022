package com.looping.bll;
import java.util.Scanner;
	/* Write a program to find how many vowels and how many consonants 
	 are in a given string. */
	 
public class Loop015 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int count_w=0;
		int count_c=0;
		
			System.out.println("Enter a string: ");
			String num =input.nextLine();
//			System.out.println(num.length());
			for(int i=0; i<= num.length()-1; i++){
				if(num.charAt(i)=='a'||num.charAt(i)=='A')
					count_w++;
				else 
					count_c++;
				
			}	
			System.out.println("Vowels : "+count_w);
			System.out.println("Consonent : "+count_c);
			
			    
	    input.close();

	}

}
