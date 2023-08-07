/**
 * Program to convert a number into text
 * @author Abhishek Mateti
 * @Since 28th July 2023
 */
package com.techzenure.day3;

import java.util.Scanner;

public class ConvertANumberToText
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		int num;
		
		String a = "";

		while(n > 0)
		{
			num = n % 10;
			switch(num)
			{
				case 0:
					a = "ZERO " + a;
					break;
					
				case 1:
					a = "ONE " + a;
					break;
					
				case 2:
					a = "TWO " + a;
					break;
					
				case 3:
					a = "THREE " + a;
					break;
					
				case 4:
					a = "FOUR " + a;
					break;
					
				case 5:
					a = "FIVE " + a;
					break;
					
				case 6:
					a = "SIX " + a;
					break;
					
				case 7:
					a = "SEVEN " + a;
					break;
					
				case 8:
					a = "EIGHT " + a;
					break;
					
				case 9:
					a = "NINE " + a;
					break;
			}
			n = n / 10;
		}
		
		System.out.println(a);
		sc.close();
	}
}