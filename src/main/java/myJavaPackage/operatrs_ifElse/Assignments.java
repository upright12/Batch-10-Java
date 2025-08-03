package myJavaPackage.operatrs_ifElse;

public class Assignments {
/*
Write a Java program that checks whether a given number is even or odd using if-else.

Instructions:

Take a number as a variable as an integer.

Use the modulus operator % to determine if the number is even.

Print "Even" if the number is divisible by 2, otherwise print "Odd".

Sample Output:

Enter a number: 7
7 is an Odd number.
 */
   static void evenOrOdd(int a){
       //int a = 20;

       if (a%2 ==0){
           System.out.println(a + " is an even number");
       }
       else {
           System.out.println(a+ " is an odd number");
       }

   }
/* take a number as a variable or parameter
and determine whether it is a positive number or negative number
or 0
 */

    static void positiveNegative(int x){
        if(x>0){
            System.out.println(x +" is a positive number");
        }
        else if (x<0){
            System.out.println(x + " is a negative number");
        }
        else if (x==0) {
            System.out.println(x +" is zero");
        }
    }
    /*
    check if a selected year is leap year or not
     */

    static void leapYear(int year){
        if (year%4 == 0 ){
            System.out.println(year + " is a leap year");
        }
    }


    public static void main(String[] args) {
       // evenOrOdd(25);
       // positiveNegative(0);
        leapYear(2028);
    }
}
