package oop_lab7;

import java.util.Scanner;

public class StudentApp {
    public static  void  main (String [] args) {
        //create Objects as Student
        Student student1 = new Student();

        student1.setId("111111111111");
        student1.setMajor("Information System");
        student1.setFaculty("Management Technology");
        student1.setName("Boy Saiyai");

        System.out.println(student1.toString());

        Student student2 = new Student("222222222222","management","Business Management","Girl Songkhla");

        System.out.println(student2.toString());



    Student student3 = new  Student();
    student3 = inputData(student3);

    System.out.println(student3.toString());
    }//main

    private static Student inputData(Student s){
        Scanner scanner = new Scanner(System .in);
        System.out.println("Enter your student data : ");

        System.out.println("NAme: ");
        s.setName(scanner.nextLine());
        System.out.println("ID: ");
        s.setId(scanner.nextLine());
        System.out.println("Major: ");
        s.setMajor(scanner.nextLine());
        System.out.println("Faculty: ");
        s.setFaculty(scanner.nextLine());
        return s;







      }//class
