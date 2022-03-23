package com.company;

import java.util.*;

public class Main {

    static TreeSet<Student> students = new TreeSet<>();

    public static void main(String[] args) {

        Student student1 = new Student("Alex", 8.45);
        Student student2 = new Student("Mihai", 7.51);
        Student student3 = new Student("Andreea", 9.49);
        Student student4 = new Student("Alin", 9.70);
        Student student5 = new Student("Mihaela", 9.55);
        Student student6 = new Student("Mihnea", 1.30);
        Student student7 = new Student("Catalin", 0.20);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);

        gradeMapFilter(students);

    }
        public static void gradeMapFilter(TreeSet<Student> students){
            HashMap<Integer, TreeSet<Student>>gradeMapFiltered = new HashMap<>();

            for(double i = 10; i >= 0; i--){
                TreeSet<Student>studentsWithSameGrade = new TreeSet<>();
                for(Student s : students){
                    double g = s.getGrade();
                    if( g >= (i - 0.5) && g <= (i + 0.49) ){
                        studentsWithSameGrade.add(s);
                    }
                }
                gradeMapFiltered.put((int)i, studentsWithSameGrade);
                }

            System.out.println(gradeMapFiltered);
            }
}







