package myJavaPackage.scannerDemo;

import java.util.Scanner;

public class ScannerPractice {



    public void information(){
//        String name = "Bashir";
//        String profession= "IT Trainer";
        Scanner scan = new Scanner(System.in);
     String name =   scan.nextLine(); // String
        System.out.println("My name is "+ name);
       int age = scan.nextInt();
        System.out.println("my Age is "+ age);
       boolean isStudent =  scan.nextBoolean();
        System.out.println("Am I a student? " +isStudent);
      float myHeight =  scan.nextFloat();
        System.out.println(myHeight);
//        scan.nextByte();

        //System.out.println("My name is "+ name + " and profession is "+ profession);
    }



    public static void main(String[] args) {
        ScannerPractice obj = new ScannerPractice();
        obj.information();
    }

}
