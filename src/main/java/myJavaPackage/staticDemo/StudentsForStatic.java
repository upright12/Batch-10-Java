package myJavaPackage.staticDemo;

import myJavaPackage.object.Students;

public class StudentsForStatic {
/*
 Static keyword I have used before the methods and variables
 WE usually assign to a member as static when it is common for all the objects.
 If we define the members as static, we do not need a object to use that member.
 Static members are belongs to classes..not any object.

 */
    // declaring some variables
    String name; // global variable
    int id;
    String location;
   static boolean isStudent = true;


    public static void study() {
        System.out.println("Students study at home");
    }


    public void homeWork() {
        System.out.println("Students bring homework in the class");
    }


    public static void main(String[] args) {
        // a class can have many objects
       StudentsForStatic peter = new StudentsForStatic(); // created an object of the class. object1 is the reference variable
        peter.name = "Peter X";
        peter.id = 102;
        peter.location = "New York";
        System.out.println("Peters full name is " + peter.name);
        System.out.println("Peters id  is " + peter.id);
        System.out.println("Peters location is " + peter.location);
        System.out.println("Peters is student or not " + isStudent);
        study(); // we called the method
        peter.homeWork(); // we called the method

        System.out.println("-----------------------------------");

        StudentsForStatic john = new StudentsForStatic();// Created another objecgt of the class
        john.name = "John X";
        john.id = 103;
        john.location = "Texas";
        System.out.println("john full name is " + john.name);
        System.out.println("john id  is " + john.id);
        System.out.println("john location is " + john.location);
        System.out.println("john is student or not " + isStudent);
        study(); // we called the method
        john.homeWork(); // we called the method

        StudentsForStatic layla = new StudentsForStatic(); // created another object of the class
        layla.name = "John X";
        layla.id = 103;
        layla.location = "Texas";

        System.out.println("Layla full name is " + layla.name);
        System.out.println("Layla id  is " + layla.id);
        System.out.println("Layla location is " + layla.location);
        System.out.println("Layla is student or not " + isStudent);
       study(); // we called the method
        layla.homeWork(); // we called the method


    }


}