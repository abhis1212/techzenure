/**
 * Program to accpet details for a student
 * @author Abhishek Mateti
 * @Since 01th August 2023
 */
package com.techzenure.day5;

import java.util.Scanner;

public class StudentDetails
{
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student's Id: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character

        System.out.print("Enter Student's Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Student's address: ");
        String studentAddress = scanner.nextLine();

        String collegeChoice;
        String collegeName;

        do {
            System.out.print("Whether the student is from NIT(Yes/No): ");
            collegeChoice = scanner.nextLine().toUpperCase();

            if (collegeChoice.equals("YES"))
            {
                Student student = new Student(studentId, studentName, studentAddress);
                displayStudentDetails(student);
                break;
            } 
            else if (collegeChoice.equals("NO"))
            {
                System.out.print("Enter the college name: ");
                collegeName = scanner.nextLine();
                Student student = new Student(studentId, studentName, studentAddress, collegeName);
                displayStudentDetails(student);
                break;
            }
            else
            {
                System.out.println("Wrong Input.");
            }
        }while (true);

        scanner.close();
    }

    public static void displayStudentDetails(Student student)
    {
    	System.out.println();
        System.out.println("Student id: " + student.getStudentId());
        System.out.println("Student name: " + student.getStudentName());
        System.out.println("Address: " + student.getStudentAddress());
        System.out.println("College Name: " + student.getCollegeName());
    }
}