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

/* We use array, when we have multiple data in same datatype
and same category
 */

     void accessToArray()  {

         String [] name = {"Bashir", "Arafat", "Sabrina", "Shifat"};
//        System.out.println(name[0]);
//         System.out.println(name[1]);
//         System.out.println(name[2]);
//         System.out.println(name[name.length-1]);
        // System.out.println(name[4]);
//         int lengthOfName = name.length;
//         System.out.println(lengthOfName);
         System.out.println(name.length);

         int a = 0;
         while (a<=name.length-1){
             System.out.println(name[a]);
             a++;
         }

         for (int i = 0;i<name.length; i++){
             System.out.println(name[i]);
         }



//        for (int x = 0; x<=name.length-1; x++){
//            System.out.println(name[x]);
//        }


    }


    public void evenOdd(){
        Integer[] number = {2, 4, 5, 7, 8, 11, 13};
        System.out.println(number.length);
        System.out.println(number[0]);
        int a = 0;
        while (a<=6){
            System.out.println(number[a]);
            a++;
        }

    }
    public static void main(String[] args) {
        ArrayDemo obj = new ArrayDemo();
        obj.accessToArray();
    }
}
