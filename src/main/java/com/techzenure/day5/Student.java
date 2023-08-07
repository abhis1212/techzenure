/**
 * Program to accpet details for a student
 * @author Abhishek Mateti
 * @Since 01th August 2023
 */
package com.techzenure.day5;

class Student 
{
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;

    // 3-argument constructor for NIT students
    public Student(int studentId, String studentName, String studentAddress)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = "NIT";
    }

    // 4-argument constructor for students from other colleges
    public Student(int studentId, String studentName, String studentAddress, String collegeName)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = collegeName;
    }

    // Getter methods
    public int getStudentId()
    {
        return studentId;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public String getStudentAddress()
    {
        return studentAddress;
    }

    public String getCollegeName()
    {
        return collegeName;
    }
}