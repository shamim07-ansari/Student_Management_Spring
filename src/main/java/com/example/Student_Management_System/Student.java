package com.example.Student_Management_System;

public class Student {
    private String name;
    private int rollNo;
    private int age;
    private int mobileNo;

    public Student(String name, int rollNo, int age, int mobileNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }
}
