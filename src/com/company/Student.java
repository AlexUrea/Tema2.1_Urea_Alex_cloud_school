package com.company;

import java.util.*;

public class Student extends TreeSet<Student> implements Comparable<Student> {
    private String name;
    private double grade;


    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public double getGrade(){
        return grade;
    }


    public int compareTo(Student o){
        return Double.compare(this.grade, o.grade);
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", grade=" + grade + '}';
    }
}
