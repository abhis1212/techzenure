/**
 * Program for hosteller this java file contains super class Student
 * * @author Abhishek Mateti
 * @Since 02th August 2023
 */
package com.techzenure.day6;

public class Student 
{
    protected int studentId;
    protected String name;
    protected int departmentId;
    protected String gender;
    protected String phone;

    // Constructor for Student class
    public Student(int studentId, String name, int departmentId, String gender, String phone)
    {
        this.studentId = studentId;
        this.name = name;
        this.departmentId = departmentId;
        this.gender = gender;
        this.phone = phone;
    }

    // Getters and Setters for the Student class
    public int getStudentId()
    {
        return studentId;
    }
    
    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getDepartmentId()
    {
        return departmentId;
    }
    
    public void setDepartmentId(int departmentId)
    {
        this.departmentId = departmentId;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }
}