package myJavaPackage.object;

public class Students {
  // declaring some variables
   public String name;
    int id; // only within the same package
    private String location;
    boolean isStudent;


    public void study(){
        System.out.println("Students study at home");
    }


    public void homeWork(){
        System.out.println("Students bring homework in the class");
    }


    public static void main(String[] args) {
      // a class can have many objects
      Students peter = new Students(); // created an object of the class. object1 is the reference variable
      peter.name = "Peter X";
      peter.id = 102;
      peter.location = "New York";
      peter.isStudent= true;
      System.out.println("Peters full name is "+ peter.name);
      System.out.println("Peters id  is "+ peter.id);
      System.out.println("Peters location is "+ peter.location);
      System.out.println("Peters is student or not "+ peter.isStudent);
      peter.study(); // we called the method
      peter.homeWork(); // we called the method

      System.out.println("-----------------------------------");

      Students john = new Students();// Created another objecgt of the class
      john.name = "John X";
      john.id = 103;
      john.location = "Texas";
      john.isStudent= true;
      System.out.println("john full name is "+ john.name);
      System.out.println("john id  is "+ john.id);
      System.out.println("john location is "+ john.location);
      System.out.println("john is student or not "+ john.isStudent);
      john.study(); // we called the method
      john.homeWork(); // we called the method

      Students layla = new Students(); // created another object of the class

    }







}
