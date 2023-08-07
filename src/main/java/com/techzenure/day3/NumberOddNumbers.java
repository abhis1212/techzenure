/**
 * Program to get the even number depends on user input
 * @author Abhishek Mateti
 * @Since 28th July 2023
 */

package com.techzenure.day3;

import java.util.Scanner;

public class NumberOddNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter how many odd numbers to be generated : ");
		int n = sc.nextInt();
		
		for(int i = 1; n > 0; i += 2)
		{
			System.out.print(i + " ");
			n--;
		}
		sc.close();
	}
}