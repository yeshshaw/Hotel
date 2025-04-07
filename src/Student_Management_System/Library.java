package Student_Management_System;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList <Student> students = new ArrayList<>() ;
    private static final String fileName = "Student_data.txt" ;
    Scanner sc = new Scanner(System.in) ;

    // Enter the student detail or add student

    public void addStudent () {
        System.out.println("Enter the roll number : ");
        int roll = sc.nextInt() ;
        sc.nextLine() ;
        System.out.println( "Enter Name : ");
        String name = sc.nextLine() ;
        System.out.println("Enter Age : ");
        int age = sc.nextInt() ;
        System.out.println("Enter Class : ");
        String  Classs = sc.nextLine() ;
        System.out.println("Enter Tutionfees : ");
        double tutionfees = sc.nextDouble();
        students.add ( new Student(roll , name , age , Classs , tutionfees)) ;
        saveStudentsToFile();
        System.out.println("✅ Student Added Successfully!");
    }
    public void addfeepayment() {
        System.out.println("Enter the student name  to update the fees : ");
        String name = sc.nextLine() ;
        System.out.println("Enter the month : ");
        int month = sc.nextInt() ;
        System.out.println("Has the fees has been paid ? (true/false) : ");
        boolean ispaid = sc.nextBoolean() ;

        for ( Student student : students ) {
            if ( student.getName().equals(name)  ) {
                student.addpayment(month , ispaid );
                saveStudentsToFile();
                System.out.println("✅ Fee Payment Updated Successfully!");
                return;
            }
        }
        System.out.println("⚠️ Student Not Found!");
    }
    public void viewStudentPayments() {
        System.out.println("Enter the name of the Students:");
        String name = sc.nextLine();
        for(Student student : students) {
            if (student.getName().equals(name) ) {
                student.viewpayment();
                return;
            }
        }
        System.out.println("⚠️ Student Not Found!");
    }

    // Save and Load methods for Students...

    private void saveStudentsToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(students);
        } catch (IOException e) {
            System.out.println("⚠️ Error saving students to file.");
        }
    }

    private void loadStudentsFromFile() {
        File file = new File(fileName);
        if (!file.exists()) return;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            students = (ArrayList<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("⚠️ Error loading students from file.");
        }
    }

}
