package Student_Management_System;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Student implements Serializable {
    private int t_roll ;

    public int getT_roll() {
        return t_roll;
    }

    public void setT_roll(int t_roll) {
        this.t_roll = t_roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getClasss() {
        return Classs;
    }

    public void setClasss(String aClass) {
        Classs = aClass;
    }

    public double getTutionfees() {
        return tutionfees;
    }

    public void setTutionfees(double tutionfees) {
        this.tutionfees = tutionfees;
    }

    public ArrayList<Boolean> getFeespayment() {
        return feespayment;
    }

    public void setFeespayment(ArrayList<Boolean> feespayment) {
        this.feespayment = feespayment;
    }

    private String name ;
    private int age ;
    private String Classs ;
    private double tutionfees ;
    private ArrayList<Boolean> feespayment = new ArrayList<>() ;

    public Student ( int roll , String name , int age , String Class , double tutionfees) {
        this.t_roll = roll ;
        this.name = name ;
        this.age = age  ;
        this.Classs = Class ;
        this.tutionfees = tutionfees ;
        this.feespayment = new ArrayList<>(Collections.nCopies(12 , false)) ;
    }

    public void addpayment( int month , boolean ispaid) {
        if ( month >= 1 && month <= 12) {
            feespayment.set( month-1  , ispaid) ;
        }
        else {
            System.out.println("Invalid month!");
        }
    }

    public void viewpayment () {
        System.out.println("payment status for " + name + ":");
        for ( int i = 0 ; i<12 ; i++) {
          String month = getMonthName(i+1) ;
            System.out.println( month + ":" + (feespayment.get(i) ? " paid" : "Notpaid "));
        }
    }

    public String getMonthName (int month ) {
        String[] months = { "january" , "February" , "March" , "April" , "May" , "June" , "July" , "August" , "September" , "October" , "November" , "December"} ;
        return months[month-1] ;
    }

}
