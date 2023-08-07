/**
 * Program for hosteller this java file contains sub class hosteller
 * * @author Abhishek Mateti
 * @Since 02th August 2023
 */
package com.techzenure.day6;

class Hosteller extends Student {
    private String hostelName;
    private int roomNumber;

    // Constructor for Hosteller class
    public Hosteller(int studentId, String name, int departmentId, String gender, String phone, String hostelName, int roomNumber) {
        super(studentId, name, departmentId, gender, phone);
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
    }

    // Getters and Setters for Hosteller class
    public String getHostelName()
    {
        return hostelName;
    }

    public void setHostelName(String hostelName)
    {
        this.hostelName = hostelName;
    }

    public int getRoomNumber()
    {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }
}