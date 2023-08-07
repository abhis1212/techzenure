/**
 * Program to get sum of two number taken from user
 * @author Abhishek Mateti
 * @Since 28th July 2023
 */
package com.techzenure.day3;

import java.util.Scanner;

public class SumOfTwoDigits
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		while(num != 0)
		{
			int temp = num % 10;
			sum += temp;
			num /= 10;
		}
		
		System.out.printf("Sum of digit is %d" , sum);
		sc.close();
	}
}
