/**
 * Program to find sequence of the given number
 * @author Abhishek Mateti
 * @Since 28th July 2023
 */
package com.techzenure.day3;

public class Sequence
{
	public static void main(String[] args)
	{
		//Scanner sc = new Scanner(System.in);
		int i,j=1;
		System.out.println("First 15 element of the sequence are ");
		//num = sc.nextInt();
		 for(i=0; i<=15; i++)
		 {
			 System.out.print(j + " ");
			 j = j + 3;
		 }	
	}
}
