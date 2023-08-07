/**
 * Program for hosteller to enter students details
 * * @author Abhishek Mateti
 * @Since 02th August 2023
 */
package com.techzenure.day6;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {
        Hosteller hosteller = getHostellerDetails();

        // Modify room number and phone number if needed
        Scanner scanner = new Scanner(System.in);

        System.out.print("Modify Room Number(Y/N): ");
        String modifyRoom = scanner.nextLine();

        if (modifyRoom.equalsIgnoreCase("Y")) {
            System.out.print("New Room Number: ");
            int newRoomNumber = scanner.nextInt();
            hosteller.setRoomNumber(newRoomNumber);
        }

        System.out.print("Modify Phone Number(Y/N): ");
        String modifyPhone = scanner.next();

        if (modifyPhone.equalsIgnoreCase("Y")) {
            System.out.print("New Phone Number: ");
            String newPhoneNumber = scanner.next();
            hosteller.setPhone(newPhoneNumber);
        }

        scanner.close();

        // Display the student details
        System.out.println("\nThe Student Details are as follows:");
        System.out.println("Student ID: " + hosteller.getStudentId());
        System.out.println("Student Name: " + hosteller.getName());
        System.out.println("Department ID: " + hosteller.getDepartmentId());
        System.out.println("Student Gender: " + hosteller.getGender());
        System.out.println("Student Phone No: " + hosteller.getPhone());
        System.out.println("Hostel Name: " + hosteller.getHostelName());
        System.out.println("Room No: " + hosteller.getRoomNumber());
    }

    public static Hosteller getHostellerDetails() {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Student Details & Hostel Details:");

        System.out.print("Student ID: ");
        int studentId = scanner.nextInt();

        scanner.nextLine(); // Consume the newline left by nextInt()

        System.out.print("Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Department Id: ");
        int departmentId = scanner.nextInt();

        scanner.nextLine(); // Consume the newline left by nextInt()

        System.out.print("Gender[M/F]: ");
        String gender = scanner.nextLine();

        System.out.print("Phone Number: ");
        String phone = scanner.nextLine();

        System.out.print("Hostel Name: ");
        String hostelName = scanner.nextLine();

        System.out.print("Room Number: ");
        int roomNumber = scanner.nextInt();

        //scanner.close();

        // Create and return the Hosteller object
        return new Hosteller(studentId, name, departmentId, gender, phone, hostelName, roomNumber);
    }
}