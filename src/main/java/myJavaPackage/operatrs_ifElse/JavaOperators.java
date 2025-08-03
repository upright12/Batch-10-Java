package myJavaPackage.operatrs_ifElse;

import java.util.Scanner;

public class JavaOperators {

    /*
    Java has few operators
    Arithmatic Operators = +, -, /, *
    Comparison/relational Operators = >, <, >=, <=, ==, !=
    Logical Operators = AND (&&), OR(||)
    Asignment Operator =   =(assignment Operator)
     */

    public void arithmaticOperators() { // parameter
//        int a = 20;
//        int b = 10;
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int result = a - b; // -2
        if (result > 0) { // conditional statement
            System.out.println("a is greater than b. The result is " + result);
        } else {
            System.out.println("Sorry, a is not greater than b. The result is " + result);
        }

    }

    /**
     * This method is crated by Bashir on July 26, 2025
     * the purpose of this method is practicing comparison operators
     * @param a
     * @param b
     */
   public void comparisonOperator(int a, int b){
        // take a value from the user -- that means scanner
        // create two variables here --- direct varialbe and value
        // create two parameters int a int b
        // it returns only true and false

//        int a = 20;
//        int b = 30;

        boolean result = a<=b;
        System.out.println(result);


        int age = 10;

        if(age==16){
            System.out.println("You cannot vote. you are 16");
        }
        else if (age==10){
            System.out.println("you cannot vote. you are 17");
        }
        else if (age >=18){
            System.out.println("You can vote. you are 18 or 18+");
        }
        else {
            System.out.println("You cannot vote. You are too little");
        }
    }

    public void logicalOperator(){
        // &&, || -- true and false
        int a = 20;
        int b =9;
        int c = 5;

        boolean result = (a>b) && (b<c); // false
        System.out.println(result);

         result = (a==b)||(a>c);
        System.out.println(result);

        result = (a!=c)&&(c<a); // true
        System.out.println(result);
    }

    public static void main(String[] args) {
        JavaOperators obj = new JavaOperators();
       // obj.arithmaticOperators(); // argument
        obj.comparisonOperator(20, 30);
        //obj.logicalOperator();
    }

}
