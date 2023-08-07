/**
 * Program to find the average age of the given input
 * @author Abhishek Mateti
 * @Since 31th July 2023
 */
package com.techzenure.day4;

import java.util.Scanner;

public class FindTheAverageAge
{
	public static void main(String[] args)
	{
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total no. of employees: ");
        int totalEmployees = scanner.nextInt();

        if (totalEmployees < 2) {
            System.out.println("Please enter a valid employee count");
            return;
        }

        int[] ages = new int[totalEmployees];
        System.out.println("Enter the age for " + totalEmployees + " employees:");
        for (int i = 0; i < totalEmployees; i++)
        {
            int age = scanner.nextInt();
            if (age < 28 || age > 40)
            {
                System.out.println("Invalid Age Encountered");
                return;
            }
            ages[i] = age;
        }

        double averageAge = calculateAverage(ages);
        System.out.printf("The average age is %.2f\n", averageAge);
    }

    public static double calculateAverage(int[] age)
    {
        int sum = 0;
        for (int value : age)
        {
            sum += value;
        }
        return (double) sum / age.length;
    }
}