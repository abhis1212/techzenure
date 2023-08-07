/**
 * Program to reverse an inputed number
 * @author Abhishek Mateti
 * @Since 28th July 2023
 */
package com.techzenure.day3;

import java.util.Scanner;

public class ReverseNumber
{
	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int rev = 0;
		
		while(num != 0)
		{
			int temp = num % 10;
			rev = rev * 10 + temp;
			num /= 10;
		}
		
		System.out.printf("Sum of digit is %d " , rev);
		sc.close();
	}
}