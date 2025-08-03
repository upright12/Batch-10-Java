package myJavaPackage.arrayPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class ArrayDemo {
// Array --
    // Array elements always counts as index value that always starts from 0
    // String name = "Bashir";
    // Array can hold multiple value
    // Array is fixed in length
    String [] name = {"Bashir", "Arafat", "Sabrina", "Shifat"};

     void accessToArray()  {

//        System.out.println(name[0]);
//         System.out.println(name[1]);
//         System.out.println(name[2]);
//         System.out.println(name[name.length-1]);
        // System.out.println(name[4]);
//         int lengthOfName = name.length;
//         System.out.println(lengthOfName);
         System.out.println(name.length);


        for (int x = 0; x<=name.length-1; x++){
            System.out.println(name[x]);
        }


    }


    public static void main(String[] args) {
        ArrayDemo obj = new ArrayDemo();
        obj.accessToArray();
    }
}
