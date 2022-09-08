package com.looping.bll;
import java.util.Scanner;

		/*Write a program to enter the numbers till the user wants and at the end 
	 	it should display the count of positive, negative and zeros entered.*/ 
		 

public class Loop010 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count_pos=0;
		int count_neg=0;
		int count_zero=0;
		
			System.out.println("How many numbers do you wants to enter : ");
			int num =input.nextInt();
			//int[] tnum =new int[num];
			System.out.println("Enter "+num+" numbers :");
			for(int i=1; i<=num; i++){
				int temp=input.nextInt();
				if(temp>0)
					count_pos++;
				else if(temp<0)
					count_neg++;
				else
					count_zero++;
			}	
			System.out.println("Positive no. : "+count_pos);
			System.out.println("Negetive no. : "+count_neg);
			System.out.println("Zero no. : "+count_zero);
			    
	    input.close();
	}
}




