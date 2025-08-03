package myJavaPackage.staticDemo;

import myJavaPackage.object.Students;

public class StudentsForStatic2 {

    // 0 members....




    public static void main(String[] args) {
        StudentsForStatic sabrina = new StudentsForStatic();
        sabrina.name= "Sabrina Sarwar";
        sabrina.id = 105;
        sabrina.location = "NJ";
        System.out.println("Sabrina is student or not "+StudentsForStatic.isStudent);
        StudentsForStatic.study();
        sabrina.homeWork();
    }




}
